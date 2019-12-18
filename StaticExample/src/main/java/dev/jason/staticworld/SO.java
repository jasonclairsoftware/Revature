package dev.jason.staticworld;

public class SO {

	public static int counter = 0;
	public int price = 20;

	SO() {
		SO.counter++;
		this.price = 20;
	}
	
	SO (int price) {
		this.price = price;
		SO.counter++;
	}
	
	public static void printInfo() {
		System.out.println("counter is " + SO.counter);
	}
}
