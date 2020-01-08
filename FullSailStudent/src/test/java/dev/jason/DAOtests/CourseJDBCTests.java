package dev.jason.DAOtests;

import java.util.Set;

import org.junit.Test;

import dev.jason.daos.CourseDAO;
import dev.jason.daos.CourseJDBCDAO;
import dev.jason.entities.Course;
import dev.jason.entities.Student;

public class CourseJDBCTests {

	public static CourseDAO cdao = new CourseJDBCDAO();
	@Test
	public void createCourseTest() {
		Course course = new Course(0, 1, "Advanced Magic", 4);
		int result = cdao.createCourse(course);
		System.out.println(result);
	}
	
	@Test
	public void getCoursesByStudentTest() {
		Student student = new Student();
		student.setId(1);
		Set<Course> courses = cdao.getCoursesByStudent(student);
		System.out.println(courses);
	}

}
