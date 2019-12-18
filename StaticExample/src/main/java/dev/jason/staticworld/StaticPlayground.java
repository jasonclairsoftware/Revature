package dev.jason.staticworld;

public class StaticPlayground {

	public static void main(String[] args) {

		SO one = new SO(13);
		SO two = new SO(20);
		SO three = new SO(2);
		SO four = new SO();
		
		System.out.println(SO.counter);
		System.out.println(one.price);
		System.out.println(two.price);
		System.out.println(three.price);
		System.out.println(four.price);
		four.counter++;
		System.out.println(SO.counter);

		
	}
}
