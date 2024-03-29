package dev.jason.working;

public class Cat {

	// Data Memebers
	private String name;
	private int age;
	
	public Cat(String name, int age) {
		this.setAge(age);
		this.setName(name);
	}
	
	// Getters and setters
	
	/**
	 * if less than ZERO, do nothing
	 * @param age
	 */
	public void setAge(int age) {
		if (age < 0) 		return;
		else 				this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public String getName() { 
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("The cats age is " + this.getAge() + "\nThe cats name is " + this.getName());
	}

}
