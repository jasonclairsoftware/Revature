package dev.jason.romanNumerals;

public class RomanNumerals {

	// Data Members
	private char[] numerals;
	
	// Getters
	public char[] getRomanSymbols() {
		return this.numerals;
	}
	
	// Setters
	// There is no error checking for this
	public void setNumeralValues(String values) {
		this.numerals = values.toCharArray();
	}
	
	// Methods
	private int convertNumeral(char numeral) {
		switch (numeral) {
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default:
			System.out.println("No no no...");
			return -1;
		}
	}
	
	public int convertValue(char[] arr) {
		int totval = 0;
		int fval = 0;
		int sval = 0;
		
		for (int i = 0; i < arr.length; i++) {
			fval = this.convertNumeral(arr[i]);
			if (i+1 < arr.length) {
				sval = this.convertNumeral(arr[i+1]);
				if (fval >= sval) 	
					totval += fval;
				else 				{ 
					totval += sval-fval;
					i++; 
					}
			}
			else {
				totval += fval;
			}
		}
		return totval;
	}
	
	public void printValue() {
		System.out.println(this.convertValue(this.numerals));
	}
	
	
}
