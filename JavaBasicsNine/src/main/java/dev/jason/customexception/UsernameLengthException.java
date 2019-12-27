package dev.jason.customexception;

public class UsernameLengthException extends Exception{

	public UsernameLengthException() {
		super("username must be at least 6 characters.");
	}
	
}
