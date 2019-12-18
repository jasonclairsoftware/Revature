package dev.jason.design;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

	public static void main(String[] args) {
		double start;
		double end;

		start = System.nanoTime();
		List<Student> students = new LinkedList<Student>();
		//List<Student> students = new ArrayList<Student>();
		
		for (int i = 0; i < 100000; i++) {
			Student student = new Student();
			students.add(student);
		}

		end = System.nanoTime();
		double clock = end - start;

		System.out.println((clock / 1000000000) + " add Lists");

		start = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			Student student = students.get(50000);
		}
		end = System.nanoTime();
		clock = (end - start) / 1000000000;
		System.out.println(clock + " To get item from List");

		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			Student student = new Student("Lee Roy", 4.0f);
			students.add(0, student);
		}
		end = System.nanoTime();
		clock = (end - start) / 1000000000;
		System.out.println(clock + " added to beginning to list");

	}
}
