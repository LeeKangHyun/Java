package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test09 {
  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try ( 
        Scanner keyboard = new Scanner(System.in);
        ) 
    {
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      //DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
      //DriverManager.registerDriver(new org.postgresql.Driver());
      
      con = DriverManager.getConnection(
          "jdbc:mysql://192.168.0.37:3306/java76db", "java76", "1111");
      
      stmt = con.prepareStatement(
          "update board set title=?, content=? where bno=?");
      
      System.out.print("번호?");
      int no = Integer.parseInt(keyboard.nextLine());
      
      System.out.print("제목?");
      String title = keyboard.nextLine();
      
      System.out.print("내용?");
      String content = keyboard.nextLine();
      
      stmt.setString(1, title);
      stmt.setString(2, content);
      stmt.setInt(3, no);
      
      // update 실행
      int count = stmt.executeUpdate();
      
      if (count > 0) { 
        System.out.println("입력 성공!");
      } else {
        System.out.println("입력 실패!");
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }

  }
}




