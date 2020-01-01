package dev.jason.services;

import dev.jason.daos.CourseDAO;
import dev.jason.daos.CourseLocalDAO;
import dev.jason.daos.StudentDAO;
import dev.jason.daos.StudentLocalDAO;
import dev.jason.entities.Course;
import dev.jason.entities.Student;

public class StudentImpl implements StudentService {

	StudentDAO sdao = new StudentLocalDAO();
	CourseDAO cdao = new CourseLocalDAO();
	
	
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
		cdao.createCourse(course);
		student.getTranscript().add(course);
		return student;
	}

	public Student enrollStudent(Student student) {
		sdao.createStudent(student);
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
