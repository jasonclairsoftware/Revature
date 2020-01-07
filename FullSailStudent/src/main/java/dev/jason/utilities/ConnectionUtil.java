package dev.jason.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.util.Properties;

public class ConnectionUtil {

	// JDBC Java DataBase Connectivity
	// Java API Application Program Interface

	// Responsible for connecting to database
	// JDBC is not enabled by default you have to add it to your program
	// Maven makes it easy to add necessary API and .libs to your program

	private static Connection connection = null;

	public static Connection getConnection() {
		if (connection == null) {
			return createConnection();
		} else
			return connection;
	}
	
	

	private static Connection createConnection() {
		Properties props = new Properties();
		FileInputStream in;

		try {
			in = new FileInputStream("resources/connection.properties");
			props.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String connectiondetails = props.getProperty("connectInfo");

		try {
			Connection conn = DriverManager.getConnection(connectiondetails);
			connection = conn;
			return conn;
		} catch (SQLTimeoutException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
