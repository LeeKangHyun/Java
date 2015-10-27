package v09.client;

import java.util.Scanner;

public class ProjectClient01 {
  class QueryString {
    String ip;
    int port = 8888;
    String command;

    public QueryString(String str) { 
      // str 형식 
      // 192.168.1.2:8989/project/list
      // 192.168.1.2/project/list
      // 192.168.1.2:8989/project/add?title.....

      // 1) 서버 주소 뜯어내기
      // - 사용자가 입력한 문자열을 앞에서부터 / 문자가 있는 위치를 찾는다.  
      int i = str.indexOf('/');  
      // - 앞에서부터 / 문자 전까지 문자열 추출한다.
      String serverInfo = str.substring(0, i);
      // - 서버 정보로부터 ip와 port를 분리한다.
      String[] tokens = serverInfo.split(":");
      this.ip = tokens[0];
      if (tokens.length > 1) {
        this.port = Integer.parseInt(tokens[1]);
      }

      //2) 명령 추출하기.
      this.command = str.substring(i);
    }
  }

  private void execute() {
    try (
        Scanner keyboard = new Scanner(System.in);
        ) 
    {
      String command = null;
      QueryString qs = null;

      while (true) {
        System.out.print("명령> ");
        command = keyboard.nextLine();

        if (command.equals("quit"))
          break;

        qs = new QueryString(command);
        System.out.println(qs.ip);
        System.out.println(qs.port);
        System.out.println(qs.command);
      }
    } 
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    ProjectClient01 client = new ProjectClient01();
    client.execute();
  }

}




