package dev.jason.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import dev.jason.entities.Student;
import dev.jason.utilities.ConnectionUtil;

public class StudentJDBCDAO implements StudentDAO {

	@Override
	public int createStudent(Student student) {
		Connection conn = ConnectionUtil.getConnection();

		String sql = "INSERT INTO student VALUES(?, ?, ?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, 0);
			ps.setString(2, student.getUsername());
			ps.setString(3, student.getPassword());
			ps.execute();

			// Holds all the information you get back from the database in JDBC
			ResultSet rs = ps.getGeneratedKeys();
			rs.next(); // Moves the cursor to the first element in the result set
			int id = rs.getInt("id");

			return id;

		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("That username already exists.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Student getStudentbyId(int id) {
		Connection conn = ConnectionUtil.getConnection();
		String sql = "SELECT * FROM student WHERE id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next(); // moves index to first record

			Student student = new Student();
			student.setId(rs.getInt("id"));
			student.setUsername(rs.getString("username"));
			student.setPassword(rs.getString("password"));

			return student;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Student getStudentbyUsername(String username) {
		Connection conn = ConnectionUtil.getConnection();
		String sql = "SELECT * FROM student WHERE username=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			rs.next(); // moves index to first record

			Student student = new Student();
			student.setId(rs.getInt("id"));
			student.setUsername(rs.getString("username"));
			student.setPassword(rs.getString("password"));

			return student;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateStudent(Student student) {

		Connection conn = ConnectionUtil.getConnection();
		String sql = "UPDATE student SET username=?,password=? WHERE id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, student.getUsername());
			ps.setString(2, student.getPassword());
			ps.setInt(3, student.getId());
			ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteStudent(Student student) {
		Connection conn = ConnectionUtil.getConnection();
		String sql = "DELETE FROM student WHERE id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, student.getId());
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.out.println("That id does not exist.");
			//e.printStackTrace();
			return false;
		}
		
	}

}
