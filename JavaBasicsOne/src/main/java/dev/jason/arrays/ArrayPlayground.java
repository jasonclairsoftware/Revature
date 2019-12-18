package dev.jason.arrays;

public class ArrayPlayground {

	public static void main(String[] args) {
		
		// Arrays store multiple values of sequential data in blocks
		int[] arr = {1,10,3,13,5};
		int[] arr2 = new int[20];
		Math.random();
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int) (Math.random()*100);
		}
		
		ArrayHelper aHelp = new ArrayHelper();
		
		aHelp.displayAll(arr);
		aHelp.displayAll(arr2);
		aHelp.calcPrint(arr2);

	}
}
