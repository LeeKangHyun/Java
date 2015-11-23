package java76.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java76.pms.annotation.Component;
import java76.pms.domain.Student;
import java76.pms.exception.DaoException;
import java76.pms.util.DBConnectionPool;

@Component
public class StudentDao {
DBConnectionPool dbPool;
  
  public void setDbConnectionPool(DBConnectionPool dbPool) {
    this.dbPool = dbPool;
  }
  
  public StudentDao() {}
  
  public List<Student> selectList() {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    ArrayList<Student> list = new ArrayList<>();
    
    try {
      con = dbPool.getConnection();
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
      dbPool.returnConnection(con);
    }
  }

  public int insert(Student student) {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      con = dbPool.getConnection();
      
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
      dbPool.returnConnection(con);
    }
  }

  public int delete(String email) {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      con = dbPool.getConnection();
      
      stmt = con.prepareStatement(
          "delete from student where email=?");
      
      stmt.setString(1, email);
      
      return stmt.executeUpdate();
      
    } catch (Exception e) {
      throw new DaoException(e);
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      dbPool.returnConnection(con);
    }
  }
  
  public int update(Student student) {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      con = dbPool.getConnection();
      
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
      dbPool.returnConnection(con);
    }
  }
}




