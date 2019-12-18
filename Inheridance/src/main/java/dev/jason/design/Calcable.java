package dev.jason.design;

public interface Calcable {

	/**
	 * Sums ALL numbers from start to finish
	 * 2+3+4 ==> 9
	 * @param start - the number to start from
	 * @param end - the number to stop
	 * @return - the total sum
	 */
	public int sumAll(int start, int end);
	
	// sums from 1 to end
	// 1+2+3 ==> 6
	public int sumAll(int end);
	
	// gives the factorial of a number
	// 5*4*3*2*1 ==> 120
	public int factorial(int num);
}
