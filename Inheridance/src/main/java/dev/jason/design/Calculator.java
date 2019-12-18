package dev.jason.design;

public class Calculator implements Calcable {

	public int sumAll(int start, int end) {
		int counter = 0;
		for (int i = start; i <= end; i++)
			counter += i;
		return counter;
	}

	public int sumAll(int end) {
		int counter = 0;
		for (int i = 1; i <= end; i++)
			counter += i;
		return counter;
	}

	public int factorial(int num) {
		int counter = 1;

		if (num < 0) {
			for (int i = num; i < 0; i++) {
				counter *= i;
			}
		}
		else if (num == 0) {
			return 0;
		}
		else {
			for (int i = 1; i <= num; i++)
				counter *= i;
		}
			
		
		return counter;
	}

}
