package dev.jason.daos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import dev.jason.entities.Course;
import dev.jason.entities.Student;

public class CourseLocalDAO implements CourseDAO{

	public static final Map<Integer, Course> coursetable = new HashMap<Integer, Course>();
	private static int idmaker = 100;
	
	
	public int createCourse(Course course) {
		idmaker++;
		course.setId(idmaker);
		coursetable.put(idmaker, course);
		return idmaker;
	}

	public Course getCourseByID(int ID) {
		Course course = coursetable.get(ID);
		return course;
	}

	public Set<Course> getCoursesByStudent(Student student) {
		Set<Course> allcourses = new HashSet<Course>(coursetable.values());
		Set<Course> courses = new HashSet<Course>();
		
		for (Course course : allcourses) {
			if(course.getStudentid() == student.getId()) {
				courses.add(course);
			}
		}
		
		return courses;
	}

	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteCourse(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

}
