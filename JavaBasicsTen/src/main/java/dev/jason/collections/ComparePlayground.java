package dev.jason.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparePlayground {

	public static void main(String[] args) {
		String bowser = "Bowser";
		String lilmac = "Little Mac";
		String peach = "Peach";
		String pit = "Pit";
		
		// Sets do not maintain order added 
		// Treesets sorts alhebetical
		// We can define for each class we create on how to be sorted
		Set<String> ssbu = new TreeSet<String>();
		ssbu.add(bowser);
		ssbu.add(lilmac);
		ssbu.add(peach);
		ssbu.add(pit);
		
		Student jason = new Student("Jason Clair", 14);
		Student mike = new Student("Mike Bellows", 15);
		Student jessica = new Student("Jessica Lane", 16);
		Student john = new Student("John Williams", 17);
		
		Comparator<Student> sortDecend = (Student s1, Student s2) -> {
			if ( s1.getId() < s2.getId())
				return 1;
			if (s1.getId() > s2.getId())
				return -1;
			return 0;
		};
		Comparator<Student> sortAssend = (Student s1, Student s2) -> {
			if ( s1.getId() < s2.getId())
				return -1;
			if (s1.getId() > s2.getId())
				return 1;
			return 0;
		};
		
		Set<Student> studentset = new TreeSet<Student>(sortAssend/*sortAssend*/);
		studentset.add(jason);
		studentset.add(mike);
		studentset.add(jessica);
		studentset.add(john);
		
		System.out.println(studentset);
//		for(Student student : studentset)
//			System.out.println(student);
		
		// Collections class has a ton of methods that are extremely useful
	}
}
