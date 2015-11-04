package java76.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java76.pms.annotation.Component;
import java76.pms.domain.Project;
import java76.pms.domain.Student;
import java76.pms.exception.DaoException;

@Component
public class StudentDao {
  String url;
  String username;
  String password;
  
  public StudentDao() {
    url = "jdbc:mysql://localhost:3306/java76db";
    username = "java76";
    password = "1111";
  }

  public List<Student> selectList() {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    ArrayList<Student> list = new ArrayList<>();
    
    try {
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      
      con = DriverManager.getConnection(url, username, password);
      stmt = con.createStatement();
      rs = stmt.executeQuery("select name,email,tel,cid from student");
      
      Student student = null;
      while (rs.next()) { 
        student = new Student();
        student.setName(rs.getString("name"));
        student.setEmail(rs.getString("email"));
        student.setTel(rs.getString("tel"));
        student.setCid(rs.getString("cid"));
        list.add(student);
      }
      return list;
      
    } catch (Exception e) {
      throw new DaoException(e);
      
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }

  public int insert(Student student) {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      
      con = DriverManager.getConnection(url, username, password);
      
      stmt = con.prepareStatement(
          "insert into student(name,email,tel,cid) values(?,?,?,?)");
      
      stmt.setString(1, student.getName());
      stmt.setString(2, student.getEmail());
      stmt.setString(3, student.getTel());
      stmt.setString(4, student.getCid());
      
      return stmt.executeUpdate();
      
    } catch (Exception e) {
      throw new DaoException(e);
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }

  public int delete(String email) {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      
      con = DriverManager.getConnection(url, username, password);
      
      stmt = con.prepareStatement(
          "delete from student where email=?");
      
      stmt.setString(1, email);
      
      return stmt.executeUpdate();
      
    } catch (Exception e) {
      throw new DaoException(e);
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
  public int update(Student student) {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      
      con = DriverManager.getConnection(url, username, password);
      
      stmt = con.prepareStatement(
          "update student set name=?,tel=?,cid=? where email=?");
      
      stmt.setString(1, student.getName());
      stmt.setString(2, student.getTel());
      stmt.setString(3, student.getCid());
      stmt.setString(4, student.getEmail());
      
      return stmt.executeUpdate();
      
    } catch (Exception e) {
      throw new DaoException(e);
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
}







