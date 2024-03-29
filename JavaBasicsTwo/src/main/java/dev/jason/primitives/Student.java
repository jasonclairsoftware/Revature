package dev.jason.primitives;

public class Student {

	// Data Members
	private String name;
	private int age;
	
	// CTOR
	public Student(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public Student() {
		this.setName("NULL");
		this.setAge(-1);
	}
	
	// Getters
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * The student must be 6 years old or older
	 * FAIL: If age is less than 6 years old and returns -1
	 * @param age
	 */
	public void setAge(int age) {
		if (age >= 0) 		this.age = age;
		else 				this.age = -1;
	}
	
	// Methods
	public void printInfo() {
		System.out.println(this.name + " is " + this.age + " years old.");
	}
}
