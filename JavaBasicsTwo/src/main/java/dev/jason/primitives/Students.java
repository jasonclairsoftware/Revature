package dev.jason.primitives;

import java.util.Vector;

public class Students {

	// Data Members
	private Vector<Student> students;

	// CTOR
	public Students() {
		students = new Vector<Student>(1);
	}
	
	// Methods
	/**
	 * returns the index of the oldest student
	 * -1 if array is empty
	 * @param arr
	 * @return
	 */
	private int getOldestStudent() {
		int index = 0;
		if (this.students.size() == 0) return -1;
		else {
			for (int i = 0; i < this.students.size(); i++) {
				if (i+1 < this.students.size()) {
				if (this.students.get(i).getAge() < this.students.get(i+1).getAge()) index = i+1; }
			}
			return index;
		}
	}

	public void addStudent(Student student) {
		students.addElement(student);

	}
	
	public void printOldestStudent() {
		int index = this.getOldestStudent();
		System.out.println(students.get(index).getName() + " is the oldest student with the age of " + students.get(index).getAge());
	}
	
	
}
