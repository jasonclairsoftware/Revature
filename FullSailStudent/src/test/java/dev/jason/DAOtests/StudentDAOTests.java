package dev.jason.DAOtests;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import dev.jason.daos.StudentDAO;
import dev.jason.daos.StudentJDBCDAO;
import dev.jason.entities.Student;
import dev.jason.utilities.ConnectionUtil;
import junit.framework.Assert;

public class StudentDAOTests {

	StudentDAO sdao = new StudentJDBCDAO();

	@Test
	public void createStudentTest() {
		Student jason = new Student(0, "Rodgers", "asdf", null);
		int id = sdao.createStudent(jason);
		System.out.println(id);

	}

	@Test
	public void getStudentbyIDTest() {
		Student s = sdao.getStudentbyId(4);
		Assert.assertNotNull(s);
		System.out.println(s);
	}

	@Test
	public void getStudentByUsernameTest() {
		Student s = sdao.getStudentbyUsername("jcclair");
		System.out.println(s);
	}

	@Test
	public void updateStudentTest() {
		Student s = new Student(1, "Yolhan the Wizard", "theshinythings", null);
		boolean result = sdao.updateStudent(s);
		Assert.assertEquals(true, result);
	}

	@Test
	public void deleteStudentTest() {
		Student s = new Student(5, "null", "null", null);
		boolean result = sdao.deleteStudent(s);
		Assert.assertEquals(true, result);

	}

	@Test
	public void sqlInjectionTest() {
		// Why should not use statment and string to make SQL Commands in Java
		String input = "7; DELETE FROM student WHERE id=7;"; // bad
		String sql = "SELECT * FROM student WHERE id =" + input;

		Connection conn = ConnectionUtil.getConnection();
		try {
			Statement state = conn.createStatement();
			state.execute(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
