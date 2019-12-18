package dev.jason.review;

public class ArrayReview {

	public static void main(String[] args) {
		
		// array literal 
		int [] numbers = { 1,2,3,4,5};
		
		int [] ray = new int[5];
		for (int i = 0; i < ray.length; i++) ray[i] = i+1;
		System.out.println(ray[3]);
		
		for (int i : numbers) 			System.out.println(i);
		
		
		
		
	}
}
