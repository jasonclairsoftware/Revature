package dev.jason.structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentPlayground {

	public static void main(String[] args) {
		Student Jeffery = new Student("Jeffery", 2.4f);
		Student Mike = new Student("Mike", 1.5f);
		Student Hank = new Student("Hank", 2.8f);
		Student Jessica = new Student("Jessica", 4.0f);
		Student Phil = new Student("Phil", 3.2f);
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(Jeffery);
		students.add(Mike);
		students.add(Hank);
		students.add(Jessica);
		students.add(Phil);
		
		/*
		for (Student student : students) {
			student.discribeSelf();
		}
		*/
		
		Set<Student> morestudents = new HashSet<Student>();
		morestudents.add(Jeffery);
		morestudents.add(Mike);
		morestudents.add(Hank);
		morestudents.add(Jessica);
		morestudents.add(Phil);
		/*
		for (Student student : morestudents) {
			student.discribeSelf();
		}
		*/
		
		Map<String, Student> studentmap = new HashMap<String, Student>();
		studentmap.put("Jeffery", Jeffery);
		studentmap.put("Mike", Mike);
		studentmap.put("Hank", Hank);
		studentmap.put("Jessica", Jessica);
		studentmap.put("Phil", Phil);
		
		studentmap.get("Jeffery").discribeSelf();
		
		Map<String, Integer> phonebook = new HashMap<String, Integer>();
		
		phonebook.put("Jeffery", 6018675);
		phonebook.put("Mike", 2540123);
		phonebook.put("Hank", 8547125);
		phonebook.put("Jessica", 3652089);
		phonebook.put("Phil", 9874563);
		
		int n = phonebook.get("Jessica");
		System.out.println(n);
		
		

		
		
		
		
		
		
		
		
		
		
	}
}
