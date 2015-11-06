package java76.pms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class DBConnectionPool {
  String url;
  String username;
  String password;

  ArrayList<Connection> list = new ArrayList<>();

  public DBConnectionPool(String driver,
      String url, String username, String password) throws Exception {

    Class.forName(driver);

    this.url = url;
    this.username = username;
    this.password = password;
  }

  public Connection getConnection() throws Exception {
    Connection con = null;

    for (int i = 0; i < list.size(); i++) {
      con = list.get(i);
      if (con.isClosed() || !con.isValid(1000)) {
        list.remove(i--);
        continue;
      }
      System.out.println("get:" + list.size());
      return list.remove(i);
    }
    System.out.println("get:" + list.size() + ", 새로 커넥션 객체 생성");
    
    return DriverManager.getConnection(url, username, password);
  }

  public void returnConnection(Connection con) {
    try {
      if (con.isClosed())
        return;

      if (!con.isValid(1000))
        return;

      list.add(con);
      System.out.println(list.size());
      
    } catch (Exception e) {

    }
  }
}









