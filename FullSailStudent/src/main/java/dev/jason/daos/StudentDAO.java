package dev.jason.daos;

import dev.jason.entities.Student;

//CRUD methods should be in every DAO
//Create Read Update and Delete
public interface StudentDAO {

	// when you create a student you will not know their ID
	// You might want to get that back
	// CREATE
	int createStudent(Student student);
	
	// READ
	Student getStudentbyId(int id);
	Student getStudentbyUsername(String username);
	
	//UPDATE
	boolean updateStudent(Student student);
	
	// DELETE
	boolean deleteStudent(Student student);
	
}
