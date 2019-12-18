package dev.jason.app;

public class Calculator {

	// Data members
	public static final double pi = 3.14;

	// CTOR
	
	// Getters
	
	// Setters
	
	// Methods
	public double add(double num1, double num2) {
		return (num1+num2);
	}
	// subtracting num2 from num1
	public static double subtract(double num1, double num2) {
		return (num1-num2);
	}
	public double multiply(double num1, double num2) {
		return (num1*num2);
	}
	public double divide(double num1, double num2) {
		if (num2 != 0) return (num1/num2);
		else System.out.println("denominator cannot be zero");
		return -1;
	}
	public int remainder(double num1, double num2) {
		if (num2 != 0) return (int) (num1%num2);
		else System.out.println("denominator cannot be zero");
		return -1;
	}
	public double square(double num) {
		return (num*num);
	}
	public double power(double toBePowered, int toThePower) {
		if(toThePower == 0) return 1;
		if (toThePower == 1) return toBePowered;
		
		double product=toBePowered;
		for (int i = 0; i < toThePower-1; i++) {
			product *= toBePowered;
		}
		return product;
	}
}
