package dev.jason.design;

public class Student {

	private String name;
	private float gpa;
	
	public Student(String name, float gpa) {
		this.setGpa(gpa);
		this.setName(name);
	}
	public Student() {
		this.setName("NULL");
		this.setGpa(0.0f);
	}
	
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
