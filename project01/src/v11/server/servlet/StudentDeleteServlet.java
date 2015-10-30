package v11.server.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import v11.server.annotation.Component;
import v11.server.dao.StudentDao;

@Component("/student/delete")
public class StudentDeleteServlet implements Servlet {
	StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void service(HashMap<String,Object> params) {
		int no = Integer.parseInt((String)params.get("no"));
		
		PrintStream out = (PrintStream)params.get("out");

		try {
			studentDao.delete(no);
			out.println("삭제하였습니다");
		} catch (Exception e) {
			out.println("유효하지 않은 값입니다.");
		}
	}

}
