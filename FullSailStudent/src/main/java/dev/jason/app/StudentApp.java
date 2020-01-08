package dev.jason.app;

import dev.jason.entities.Course;
import dev.jason.entities.Student;
import dev.jason.services.StudentImpl;
import dev.jason.services.StudentService;

public class StudentApp {

	public static void main(String[] args) {
		
		// Creating Student services
		StudentService ss = new StudentImpl();
	
		// Creating new student
		Student jason = new Student(0, "williambill", "12345", null);
		Course math = new Course(0, jason.getId(), "Discret Math", 4);
		Course art = new Course(0, jason.getId(), "Paint 101", 3);
		
		// Adding student to the list
		ss.enrollStudent(jason);
		ss.addCourseToTranscript(jason, math);
		ss.addCourseToTranscript(jason, art);
		
		// "Logging" in student
		Student s = ss.loginStudent("williambill", "12345");
		
		// Checking to make sure I got a saved student
		System.out.println(s);
	}
}
