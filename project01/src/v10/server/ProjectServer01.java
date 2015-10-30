/*
 * v01 - 
 */
package v10.server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import v10.server.servlet.Servlet;

public class ProjectServer01 {
  HashMap<String,Object> objMap = new HashMap<String,Object>();

  class RequestHandler implements Runnable {
    Socket socket;
    public RequestHandler(Socket socket) {
      this.socket = socket;
    }
    @Override
    public void run() {
      System.out.println("클라이언트 요청 처리...");
      try (
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintStream out = new PrintStream(socket.getOutputStream());
          )
      {
        String message = in.readLine();

        int i = message.indexOf('?');
        String command = message.substring(0, (i != -1)? i : message.length());

        HashMap<String,Object> params = new HashMap<String,Object>();
        params.put("out", out);

        extractParamDataFromMessage(params, message);

        Object servlet = objMap.get(command);

        if (servlet != null && servlet instanceof Servlet)
          ((Servlet)servlet).service(params);
        else
          out.println("죄송하지만 요청하신 명령을 찾을수 없습니다.");

        out.println();
      }
      catch (Exception e) {
        e.printStackTrace();
      }
      finally {
        try {socket.close();} catch (Exception e) {}
      }
    }
  }

  public ProjectServer01() throws Exception {
    creadteObjects();
    injectDepencies();
  }

  private void injectDepencies() throws Exception {
    Object[] objList = objMap.values().toArray();
    Object dependency = null;

    for (Object obj : objList) {
      for (Method m : obj.getClass().getMethods()) {
        if (!isSetter(m)) continue;
        dependency = findObjectByType(m.getParameterTypes()[0]); 
        if (dependency == null ) continue;
        m.invoke(obj, dependency);
      }
    }
  }

  private boolean isSetter(Method m) {
    if (m.getName().startsWith("set")
        && m.getParameterTypes().length ==1)
      return true;
    return false;
  }

  private Object findObjectByType(Class<?> type) {
    Object[] objList = objMap.values().toArray();

    for (Object obj : objList) {
      if (type.isInstance(obj))
        return obj;
    }
    return null;
  }

  private void creadteObjects() throws Exception {
    Properties props = new Properties();
    props.load(
        new FileReader("./src/v10/server/application-context.properties"));

    Class<?> clazz = null;
    for (Entry<Object,Object> entry : props.entrySet()) {
      clazz = Class.forName((String)entry.getValue());
      objMap.put((String)entry.getKey(), clazz.newInstance());
    }
  }

  public static void main(String[] args) {
    try {
      ProjectServer01 server = new ProjectServer01();
      server.execute();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  private void execute() {
    try (ServerSocket ss = new ServerSocket(8888);) {
      while (true) {
        System.out.println("클라이언트 요청을 기다리는중...");
        new Thread(new RequestHandler(ss.accept())).start();
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void extractParamDataFromMessage(Map<String,Object> map, String message) {
    int i = 0;
    String paramString = null;
    String[] tokens = null;
    String[] keyValue = null;

    if (message.contains("?")) {
      i = message.indexOf('?');
      paramString = message.substring(i + 1);

      tokens = paramString.split("&");

      for (String token : tokens) {
        keyValue = token.split("=");
        map.put(keyValue[0], keyValue[1]);
      }
    }
  }
}
