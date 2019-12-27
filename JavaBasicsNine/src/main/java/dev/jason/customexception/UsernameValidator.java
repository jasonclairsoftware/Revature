package dev.jason.customexception;

public class UsernameValidator {

	public boolean validateUsername(String username) throws UsernameLengthException, UsernameInvalidCharacterException {
	
		if (username.length() < 6) {
			// Throw exception
			throw new UsernameLengthException();
		}
		
		if (username.contains("$")) {
			throw new UsernameInvalidCharacterException("$");
			}
		if (username.contains("#")) {
			throw new UsernameInvalidCharacterException("#");
		}
		
		
		return true;
	}
}
