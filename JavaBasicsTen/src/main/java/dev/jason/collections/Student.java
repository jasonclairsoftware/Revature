package dev.jason.collections;

public class Student implements Comparable<Student>{

	private String name;
	private int id;
	
	public Student(String name, int id) {
		this.setName(name);
		this.setId(id);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return ("Name: " + this.getName() + '\t' + "ID: " + this.getId());
	}
	@Override
	public int compareTo(Student s) {
		if (this.getId() < s.getId())
			return -1;
		if (this.getId() > s.getId())
			return 1;
		return 0;
	}
}
