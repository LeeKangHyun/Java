package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test06 {
  public static void main(String[] args) {
    Connection con = null;
    Statement stmt = null;
    
    try {
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      //DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
      //DriverManager.registerDriver(new org.postgresql.Driver());
      
      con = DriverManager.getConnection(
          "jdbc:mysql://192.168.0.37:3306/java76db", "java76", "1111");
      
      stmt = con.createStatement();
      
      // delete 실행
      // => executeUpdate()의 리턴 값? 추가, 변경, 삭제된 레코드의 수.
      int count = stmt.executeUpdate(
          "delete from board where bno=9");
      
      if (count > 0) {
      System.out.println("입력 성공!");
      } else {
        System.out.println("해당 번호의 게시물을 찾을 수 없습니다.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }

  }
}




