package dev.jason.primitives;

public class StudentPlayground {

	public static void main(String[] args) {

		Students students = new Students();
		Student jason = new Student("Jason", 34);
		Student mike = new Student("mike", 20);
		Student milly = new Student("milly", 62);
		Student william = new Student("William", 43);
		
		students.addStudent(jason);
		students.addStudent(mike);
		students.addStudent(milly);
		students.addStudent(william);
		
		students.printOldestStudent();
	}
}
