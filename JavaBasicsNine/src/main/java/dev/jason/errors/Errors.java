package dev.jason.errors;

public class Errors {
public static int counter = 0;
	public static void main(String[] args) {
		// Errors vs Exceptions
		// Exceptions are runtime issues that you should handle
		
		// Errors are catastrophic failures that you should NOT handle
		// You should fix the code at the core
		a();
	}
	
	
	public static void a() {
		System.out.println("Hello from a method");
		System.out.println(++counter);
		b();
	}
	
	public static void b() {
		System.out.println("Hello from b method");
		System.out.println(++counter);
		a();
	}
}
