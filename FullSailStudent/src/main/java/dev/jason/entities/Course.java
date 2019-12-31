package dev.jason.entities;

// This is a Java Bean
public class Course {
	
	private int id;
	private int studentid; // Recommended
	private String title;
	private int grade;
	
	public Course() {
		super();
	}
	
	public Course(int id, int studentid, String title, int grade) {
		super();
		this.id = id;
		this.studentid = studentid;
		this.title = title;
		this.grade = grade;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", studentid=" + studentid + ", title=" + title + ", grade=" + grade + "]";
	}
	
	
	
}
