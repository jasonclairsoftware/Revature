package dev.jason.daos;

import java.util.HashMap;
import java.util.Map;

import dev.jason.entities.Student;

public class StudentLocalDAO implements StudentDAO{

	// int id, get Student
	public final static Map<Integer, Student> studenttable = new HashMap<Integer, Student>();
	
	// ID CREATED IS HANDLED BY THE DATABASE
	// Good ID's start above ZERO
	private int idmaker = 1000;
	
	public int createStudent(Student student) {
		// Place student and create ID for the student
		studenttable.put(++idmaker, student);
		student.setId(idmaker); // Setting ID
		return idmaker;
	}

	public Student getStudentbyId(int id) {
		return studenttable.get(id);
	}

	public Student getStudentbyUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateStudent(Student student) {
		studenttable.put(student.getId(), student);
		// Should be in a try block
		return true;
	}

	public boolean deleteStudent(Student student) {
		studenttable.remove(student.getId());
		// Should be in a try block
		return true;
	}

	
	
}
