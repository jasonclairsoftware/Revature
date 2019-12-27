package dev.jason.calculator;

public class Calculator {

	public int add(int a, int b) {
		return (a + b);
	}

	public int subtract(int a, int b) {
		return (a - b);
	}

	public int multiply(int a, int b) {
		return (a * b);
	}

	public double divide(double numerator, double denominator) throws ArithmeticException {
		double result = 0.0f;

		result = numerator / denominator;
		if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY)
			throw new ArithmeticException();
		return result;
	}

}
