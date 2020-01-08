package dev.jason.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import dev.jason.entities.Course;
import dev.jason.entities.Student;
import dev.jason.utilities.ConnectionUtil;

public class CourseJDBCDAO implements CourseDAO {

	@Override
	public int createCourse(Course course) {
		Connection conn = ConnectionUtil.getConnection();
		String sql = "INSERT INTO course VALUES (?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, 0);
			ps.setString(2, course.getTitle());
			ps.setInt(3, course.getGrade());
			ps.setInt(4, course.getStudentid());
			ps.execute();

			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			int generated = rs.getInt("c_id");
			return generated;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Course getCourseByID(int ID) {
		Connection conn = ConnectionUtil.getConnection();
		String sql = "SELECT * FROM course WHERE c_id=" + ID;

		return null;
	}

	@Override
	public Set<Course> getCoursesByStudent(Student student) {
		Connection conn = ConnectionUtil.getConnection();
		String sql = "SELECT * FROM course WHERE s_id=?";
		Set<Course> courses = new HashSet<Course>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, student.getId());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Course course = new Course();
				course.setId(rs.getInt("c_id"));
				course.setTitle(rs.getString("title"));
				course.setGrade(rs.getInt("grade"));
				course.setStudentid(rs.getInt("s_id"));
				courses.add(course);
			}
			return courses;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCourse(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

}
