package dev.jason.services;

import dev.jason.entities.Course;
import dev.jason.entities.Student;

// Meat of the user stories
public interface StudentService {

	Student loginStudent(String username, String password);
	Student addCourseToTranscript(Student student, Course course);
	Student enrollStudent(Student student);
	Student withdrawStudent(Student student);
	Student changePassword(Student student, String password);
}
