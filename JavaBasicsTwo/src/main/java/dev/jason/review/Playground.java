package dev.jason.review;

public class Playground {

	public static void main(String[] args) {
		int iterator = 20;
		// Case examples
		if (4<5) {
			System.out.println("This will print if true");
		}
		else
			System.out.println("This will print if false");
		
		
		// Loops example
		for(int i = 0; i < iterator; i++) {
			System.out.println(i);
		}
		
		while(0 != iterator) {
			System.out.println(iterator);
			iterator--;
		}
	}
}
