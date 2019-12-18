package dev.jason.working;

import java.util.ArrayList;
import java.util.List;

public class LearningPlayground {
// 1) create array of cats
// 2) load array of cats
// 3) print arrays printInfo
// 4) change array to List
	public static void main(String[] args) {

		// Create array
		Cat[] cats = new Cat[4];	


		// load array
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat("Fluffy", 12);
		}
		
		// Create list
		List<Cat> copycats = new ArrayList<Cat>();
		
		// load list
		for (int i = 0; i < cats.length; i++) {
			copycats.add(cats[i]);
		}
		
		for (Cat cat : copycats) {
			cat.printInfo();
		}


	}
}
