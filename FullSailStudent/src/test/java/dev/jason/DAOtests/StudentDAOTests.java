package dev.jason.DAOtests;

import static org.junit.Assert.*;

import org.junit.Test;

import dev.jason.daos.StudentDAO;
import dev.jason.daos.StudentLocalDAO;
import dev.jason.entities.Student;
import junit.framework.Assert;

public class StudentDAOTests {

	StudentDAO sdao = new StudentLocalDAO()
;	
	
	@Test
	public void createStudentTest() {
		Student jason = new Student(0, "jcclair", "12345", null);
		int id = sdao.createStudent(jason);
		System.out.println(id);
		
	}
	
	@Test
	public void getStudentbyIDTest() {
		Student s = sdao.getStudentbyId(1001);
		Assert.assertNotNull(s);
		System.out.println(s);
	}
	

}
