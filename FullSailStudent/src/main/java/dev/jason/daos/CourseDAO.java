package dev.jason.daos;

import java.util.Set;

import dev.jason.entities.Course;
import dev.jason.entities.Student;

// CRUD methods should be in every DAO
// Create Read Update and Delete
public interface CourseDAO {

	// Create
	public int createCourse(Course course);
	
	// Read
	public Course getCourseByID(int ID);
	public Set<Course> getCoursesByStudent(Student student);
	
	// Update
	public Course updateCourse(Course course);
	
	// Delete
	public boolean deleteCourse(Course course);
	
}
