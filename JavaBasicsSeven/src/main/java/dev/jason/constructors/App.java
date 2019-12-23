package dev.jason.constructors;

public class App {

	public static void main(String[] args) {
		Dwelling d1 = new Dwelling(300);
		Dwelling d2 = new Dwelling();
		House h1 = new House();
		House h2 = new House(250, 8, "Jason");
		
		System.out.println(h1);
		System.out.println(d1);
		System.out.println(d2.toString());
		System.out.println(h2);
	}
}
