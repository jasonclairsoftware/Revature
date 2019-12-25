package dev.jason.wordtests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import dev.jason.app.JasonWordAnalizer;
import dev.jason.app.WordAnalizer;

public class PalindromeTests {

	@Test
	public void palindromeRaceCar() {
		
		
		
		WordAnalizer wa = new JasonWordAnalizer();
		boolean result = wa.isPalindrome("racecar");
	
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void palindromeBuilding() {
		WordAnalizer wa = new JasonWordAnalizer();
		
		boolean result = wa.isPalindrome("building");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void palindromeEmpty() {
		WordAnalizer wa = new JasonWordAnalizer();
		boolean result = wa.isPalindrome("");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void palindromeEven() {
		WordAnalizer wa = new JasonWordAnalizer();
		boolean result = wa.isPalindrome("lool");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void palindromeTwoLetters() {
		WordAnalizer wa = new JasonWordAnalizer();
		boolean result = wa.isPalindrome("ll");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void palindromeTwoLettersFail() {
		WordAnalizer wa = new JasonWordAnalizer();
		boolean result = wa.isPalindrome("lo");
		Assert.assertEquals(false, result);
	}

}
