package java76.pms.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import java76.pms.annotation.Component;
import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;

@Component("/student/list")
public class StudentListServlet implements Servlet {
	StudentDao studentDao;

	@Override
	public void service(HashMap<String, Object> params) {
		PrintStream out = (PrintStream)params.get("out");

		out.printf("%-3s %-5s %-17s %-13s %-7s\n", 
				"No", "Name", "E-Mail", "Tel", "ClassID");

		int i = 0;
		for (Student student : studentDao.selectList()) {
			if (student == null)
				continue;

			out.printf("%3d %-5s %-17s %-13s %7s\n"
					, i++
					, student.getName()
					, student.getEmail()
					, student.getTel()
					, student.getCid());
		}
		out.println();
	}	

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
}
