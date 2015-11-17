package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardList {
  public static void main(String[] args) {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      //DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
      //DriverManager.registerDriver(new org.postgresql.Driver());
      
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java76db", "java76", "1111");
      System.out.println("DBMS 연결 완료!");
      
      stmt = con.createStatement();
      
      System.out.println("SQL 실행 객체 준비 완료!");
      
      // 4) DBMS에게 질의하기
      // - executeQuery() : SELECT 문 실행
      // - executeUpdate() : INSERT, UPDATE, DELETE
      // - execute() : all
      // - executeBatch() : 여러 개의 SQL 문을 순차적으로 실행
      // => 리턴 값? DBMS로부터 결과를 가져오는 도구를 리턴. java.sql.ResultSet 구현체
      //    ResultSet구현체는 서버에서 결과를 가져온 것이 아니라,
      //    결과를 가져오는 역할을 수행한다.
      rs = stmt.executeQuery("select * from board");
      // 도구를 리턴한 것이지, 결과를 가져온 것은 아니다!
      
      // 5) 결과 한 개(한 레코드)를 가져오기
      while (rs.next()) { // 서버로부터 결과를 가져왔으면 true, 아니면 false
       System.out.printf("%d, %s, %s, %d, %s\n", 
           rs.getInt("bno"), 
           rs.getString("title"), 
           rs.getString("content"), 
           rs.getInt("views"), 
           rs.getDate("cre_dt").toString());
      }
      
      /* 컬럼의 타입과 값 추출 메서드
       * int, integer 등 정수 : getInt()
       * char, varchar 등 문자열 : getString()
       * date, datetime 등 날짜 : getDate()
       * 
       * getString() 모든 타입의 값을 문자열로 꺼낼 수 있다.
       */
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }

  }
}




