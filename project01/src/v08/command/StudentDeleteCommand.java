package v08.command;

import java.util.HashMap;
import java.util.Scanner;

import v08.dao.StudentDao;
import v08.domain.Student;


public class StudentDeleteCommand implements Command{
  StudentDao studentDao;

  public void setStudentDao(StudentDao studentDao) {
    this.studentDao = studentDao;
  }

  public void execute(HashMap<String, Object> params) {
    Scanner scanner = (Scanner)params.get("scanner");

    System.out.print("회원 번호? ");
    int no = Integer.parseInt(scanner.nextLine());

    System.out.print("정말 삭제하시겠습니까?(y/n)");
    String yesno = scanner.nextLine();
    if (yesno.toLowerCase().equals("y")) {
      if (studentDao.delete(no) != null) { 
        System.out.println("삭제하였습니다.");
      } else {
        System.out.println("유효하지 않은 번호입니다.");
      }
    } else {
      System.out.println("취소하였습니다.");
    }
  }
}
