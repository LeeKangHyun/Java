package v11.server.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import v11.server.annotation.Component;
import v11.server.dao.StudentDao;
import v11.server.domain.Student;

@Component("/student/add")
public class StudentAddServlet implements Servlet {
	StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	@Override
	public void service(HashMap<String,Object> params) {
		Student student = new Student();
		
		student.setName((String)params.get("name"));
		student.setEmail((String)params.get("email"));
		student.setTel((String)params.get("tel"));
		student.setCid((String)params.get("cid"));
			
		studentDao.insert(student);
		
		PrintStream out = (PrintStream)params.get("out");
		out.println("저장되었습니다.");
		out.println();
	}


}
