package step01;

import java.util.HashMap;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

public class CalcTest02 {
  public static void main(String[] args) throws Exception {
    HttpGet httpget = new HttpGet(
        "http://192.168.0.29:8080/remote01t/calc");
    
    httpget.addHeader("x-calc-method", "plus");
    httpget.addHeader("x-calc-a", "10");
    httpget.addHeader("x-calc-b", "20");
    
    CloseableHttpClient httpclient = HttpClients.createDefault();
    CloseableHttpResponse response = httpclient.execute(httpget);
    
    try {
      HttpEntity entity = response.getEntity();
      
      Gson gson = new Gson();
      HashMap<?,?> map = gson.fromJson(
          EntityUtils.toString(entity), HashMap.class);
      System.out.println(map.get("result"));
      
    } catch (Exception e) {
      response.close();
    }
    
  }
}
