package dev.jason.wrappers;

public class WrapperPlayground {

	public static void main(String[] args) {
		// Wrappers are object versions of primitives
		Integer i = 100;
		double d = 100.0;
	
		printNumber(i);
		showNumber(d);
	}
	
	// unboxing
	public static void printNumber(int x) {
		System.out.println(x);
	}
	
	// autoboxing
	public static void showNumber(Double d) {
		System.out.println(d);
	}
}
