package dev.jason.design;

public class DesignApp {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.sumAll(1,3));
		System.out.println(calc.sumAll(3));
		System.out.println(calc.factorial(-3));

	}
}
