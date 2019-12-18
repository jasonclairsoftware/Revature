package dev.jason.structures;

public class Student {

	private String name;
	private float gpa;
	
	Student(String name, float gpa){
		this.setName(name);
		this.setGPA(gpa);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getGPA() {
		return gpa;
	}
	/**
	 * will clamp between 0.0 and 4.0
	 * @param gpa
	 */
	public void setGPA(float gpa) {
		if (gpa < 0.0f) 		this.gpa = 0;		// Below 0.0
		else if (gpa > 4.0f)	this.gpa = 4.0f;	// Greater than highest GPA
		else					this.gpa = gpa;		// Success assign the data member
	}
	
	public void discribeSelf() {
		System.out.println("Name: " + this.name + " GPA: " + this.gpa);
	}
}
