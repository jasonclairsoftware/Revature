package dev.jason.arrays;

public class ArrayHelper {

	// Data members
	
	// CTOR
	
	// Getters
	
	// Setters
	
	// Methods
	public void displayAll(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
	public int sumContents(int[] arr) {
		int holder=0;
		for (int i : arr) {
			holder += i;
		}
		return holder;
	}
	
	// gives the average value
	public int average(int[] arr) {
		if (arr.length == 0) return 0;
		int total=0;
		int averageInt=0;
		for (int i : arr) {
			total += i;
		}
		if (arr.length != 0) {
			averageInt = total / arr.length;
		}
		return averageInt;
	}
	// gives minimum value
	public int minimum(int[] arr) {
		if (arr.length == 0) return 0;
		int min = arr[0];			// Making sure that the checkers has a start
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) min = arr[i];
		}
		return min;

	}
	
	// gives max value
	public int maximum(int[] arr) {
		if (arr.length == 0) return 0;
		int max = arr[0];			// Making sure that the checkers has a start
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) max = arr[i];
		}
		return max;
	}
	
	// gives difference of min and max
	public int difference(int[] arr) {
		int min=0;
		int max=0;
		min = this.minimum(arr);
		max = this.maximum(arr);
		return max - min;
	}
	
	// does all of above and prints them
	public void calcPrint(int[] arr) {
		System.out.println("The sum of the whole is " + this.sumContents(arr));
		System.out.println("The average of the whole is " + this.average(arr));
		System.out.println("The floor of the whole is " + this.minimum(arr));
		System.out.println("The ceiling of the whole is " + this.maximum(arr));
		System.out.println("The difference from the max and the min of the whole is " + this.difference(arr));
	}
}
