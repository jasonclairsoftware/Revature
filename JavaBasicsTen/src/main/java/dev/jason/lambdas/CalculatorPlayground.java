package dev.jason.lambdas;

public class CalculatorPlayground {

	public static void main(String[] args) {

		Calcuable add = (number1, number2) -> {
			return number1 + number2;
		};

		Calcuable sub = (number1, number2) -> {
			return number1 - number2;
		};
		

	}
}
