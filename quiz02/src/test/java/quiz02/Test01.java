package quiz02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test01 {
  public static void main(String[] args) {
    Connection con = null;
    Statement stmt = null;
    
    try {
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java76db", "java76", "1111");
      
      stmt = con.createStatement();
      
      for (int i = 0; i < 50; i++) {
      stmt.executeUpdate(
          "insert into book(title,authors,press,tag) "
          + "values('book" + (int)(Math.random() * 100) + "', "
              + "'" + (int)(Math.random() * 100) + "강', "
                  + "'BIT', '컴퓨터,컴터,컴퓨' )");
      }
      System.out.println("입력 성공!");
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }

  }
}
