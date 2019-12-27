package dev.jason.customexception;

public class UsernameInvalidCharacterException extends Exception{

	public UsernameInvalidCharacterException(String value) {
		super("Tried to use invalid character " + value);
	}
}
