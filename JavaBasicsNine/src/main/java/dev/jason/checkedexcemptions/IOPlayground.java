package dev.jason.checkedexcemptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOPlayground {

	public static void main(String[] args) {

		File file = new File("../JavaBasicsNine/src/main/resources/test.txt");
		BufferedWriter writer;
	
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write("All I want is sharks with freaking laserbeams attached to thier heads." + "one");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Cannot write to file...");
		}
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
			String s = reader.readLine();
			System.out.println(s);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Could not read from file...");
		}
		
		ReadWriter rw = new ReadWriter();
		
		try {
		rw.write("I like cheese");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Cannot write to file.");
		}
		
		try {
			System.out.println(rw.read());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Cannot read file..");
		}
		

	}

}
