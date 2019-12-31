package dev.jason.lambdas;

import java.util.Collections;

public class CalculatorPlayground {

	public static void main(String[] args) {

		Calcuable add = (number1, number2) -> {
			return number1 + number2;
		};

		Calcuable sub = (number1, number2) -> {
			return number1 - number2;
		};
		
		System.out.println(add.calculate(2, 3));
		System.out.println(sub.calculate(2, 3));

	}
}
