package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test10 {
  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try (
        Scanner keyboard = new Scanner(System.in);
        )
    {
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java76db", "java76", "1111");
      
      stmt = con.prepareStatement("delete from board where bno=?");
      
      System.out.print("번호?");
      int no = Integer.parseInt(keyboard.nextLine());
      
      stmt.setInt(1, no);
      
      int count = stmt.executeUpdate();
      
      if (count > 0) {
      System.out.println("삭제 성공!");
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




