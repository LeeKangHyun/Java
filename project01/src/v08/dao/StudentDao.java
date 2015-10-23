package v08.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import v08.domain.Student;
import v08.exception.DaoException;

// 데이터의 지속성(persistence)
// => 등록(create), 조회(read/retrive), 변경(update), 삭제(delete)를 관리
// => 이런 기능을 CRUD라고 부른다.
public class StudentDao {
  ArrayList<Student> list = new ArrayList<Student>();

  public StudentDao() {
    String filename = "./data/student.dat";
    try (
        FileReader in = new FileReader(filename);
        BufferedReader in2 = new BufferedReader(in);
    ) {
      String line = null;
      while((line = in2.readLine()) != null) {
        list.add(new Student(line));
      }
    } catch (Exception e) {
      throw new DaoException("학생정보 로딩 실패!");
    }
  }

  public void save() {
    try (
        FileWriter out = new FileWriter("./data/student.dat");
        BufferedWriter out2 = new BufferedWriter(out);
        PrintWriter out3 = new PrintWriter(out2);
    ) {
      for (Student s : list) {
        out3.println(s);
      }
    } catch (Exception e) {
      throw new DaoException("학생정보 저장 실패!");
    }
  }

  public ArrayList<Student> selectList() {
    return list;
  }

  public void insert(Student student) {
    list.add(student);
  }

  public Student delete(int no) {
    return list.remove(no);
  }
}




