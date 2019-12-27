package dev.jason.checkedexcemptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

public class ReadWriter {
	private String filename;
	private File file;

	public ReadWriter(String filename) throws NullPointerException {
		this.file = new File(this.filename);
	}

	public void write(String phrase) throws IOException {
		BufferedWriter write = new BufferedWriter(new FileWriter(file));
		write.write(phrase);
		write.close();
	}

	public String read() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String s = reader.readLine();
		return s;
	}
}
