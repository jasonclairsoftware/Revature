package dev.jason.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StudentPlayground {

	public static void main(String[] args) {
		Student jason = new Student("Jason Clair", 14);
		Student mike = new Student("Mike Bellows", 15);
		Student Jessica = new Student("Jessica Lane", 16);
		Student John = new Student("John Williams", 17);
		List<Student> studentlist = new ArrayList<Student>();
		studentlist.add(jason);
		studentlist.add(mike);
		studentlist.add(Jessica);
		studentlist.add(John);
//		for (Student student : studentlist) {
//			System.out.println(student);
//		}

		// This is a Lambda
		// Lambda stores code in a variable
		Consumer<Student> lambda = (student) -> {
			System.out.println(student);
		};
		Consumer<Student> idincrement = (student) -> {
			student.setId(student.getId() + 1);
		};

		studentlist.forEach(lambda);
		studentlist.forEach(idincrement);
		studentlist.forEach(lambda);
	}
}
