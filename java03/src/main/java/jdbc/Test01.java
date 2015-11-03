package jdbc;

import java.sql.DriverManager;

public class Test01 {
  public static void main(String[] args) {
    // 1) java.sql.Driver 구현체를 드라이버 관리자에게 등록한다.
    // => com.mysql.jdbc.Driver
    try {
    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      
    }
    
  }
}
