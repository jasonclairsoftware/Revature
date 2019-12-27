package dev.jason.customexception;

import java.util.Scanner;

public class UserPlayground {

	public static void main(String[] args) throws UsernameInvalidCharacterExcemption {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = scan.next();
		UsernameValidator uv = new UsernameValidator();
		try {
		uv.validateUsername(username);
		} catch (UsernameLengthExcemption e) {
			e.printStackTrace();
		}
		catch (UsernameInvalidCharacterExcemption e) {
			e.printStackTrace();
		}
		scan.close();
	}
}
