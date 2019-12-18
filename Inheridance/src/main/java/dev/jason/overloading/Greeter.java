package dev.jason.overloading;

public class Greeter {

	public static void sayHello() {
		System.out.println("Hello");;
	}
	public static void sayHello(String name) {
		System.out.println("Hello " + name);
	}
}
