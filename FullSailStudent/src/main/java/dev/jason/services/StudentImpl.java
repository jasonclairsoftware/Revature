package dev.jason.services;

import dev.jason.daos.CourseDAO;
import dev.jason.daos.CourseJDBCDAO;
import dev.jason.daos.StudentDAO;
import dev.jason.daos.StudentJDBCDAO;
import dev.jason.entities.Course;
import dev.jason.entities.Student;

public class StudentImpl implements StudentService {

	StudentDAO sdao = new StudentJDBCDAO();
	CourseDAO cdao = new CourseJDBCDAO();
	
	public Student loginStudent(String username, String password) {
		Student student = this.sdao.getStudentbyUsername(username);
		student.setTranscript(cdao.getCoursesByStudent(student));
		if (student.getPassword().equals(password)) {
			return student;
		}
		return null;
	}

	public Student addCourseToTranscript(Student student, Course course) {
		course.setStudentid(student.getId());
		int cid = cdao.createCourse(course);
		course.setId(cid);
		student.getTranscript().add(course);
		
		return student;
	}

	public Student enrollStudent(Student student) {
		student.setId(sdao.createStudent(student));
		return student;
	}

	public Student withdrawStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student changePassword(Student student, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
