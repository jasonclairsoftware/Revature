package dev.jason.app;

public class JasonWordAnalizer implements WordAnalizer {

	public boolean isPalindrome(String word) {
		if (word.length() == 0 || word.length() == 1) return false;
		boolean result = false;
		char arr[] = word.toCharArray();

		
		for (int i = 0; i <= (word.length() - 1) / 2; i++) {
			if (arr[i] == arr[(word.length() - 1) - i])
				result = true;
			else
				result = false;
		}
		return result;
	}

}
