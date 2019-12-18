package dev.jason.control;

// Demonstrating loops
public class Loops {

	// Data members
	public static int iNumberOfRuns;
	
	// Main entry point
	public static void main(String[] args) {
		iNumberOfRuns = 50;
		//forLoop(iNumberOfRuns);
		
		// Making sure that iNumberOfRuns primitive is not changed inside of whileLoop();
		whileLoop(iNumberOfRuns);
		System.out.println(iNumberOfRuns);

	}
	
	// This is a demonstration of a for loop
	public static void forLoop(int runs) {
		for (int iterator = 0; iterator < runs; iterator++) {
			System.out.println("Hello " + (iterator+1) + " times!!");
			if (iterator > 35) break;
		}
		for (int iterator = runs; iterator > 0; iterator--) {
			System.out.println("I ate an apple and have " + iterator + " left...");
			if (iterator < 20) break;
		}
		for (int iterator = 0; iterator < runs; iterator++) {
			System.out.println("I like cheese.");
			if (iterator > 20) continue;
			System.out.println("and I like playing checkers.");
		}
		
	}
	
	public static void whileLoop(int runs) {
		while (runs >= 0) {
			System.out.println("stuff and things..." + runs);
			runs--;
		}
		
		// demonstrating a do while loop
		do {
			System.out.println("Bring for the cheesecake!!");
			runs++;
		} while (runs <= 20);
	}
	
	
	
}
