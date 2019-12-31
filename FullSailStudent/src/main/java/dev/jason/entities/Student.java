package dev.jason.entities;

import java.util.HashSet;
import java.util.Set;

// Entitiy should be Java Beans
// Bean is a Java class that has private fields and public getters and setters
// Technically it should implements serializable. This is deprecated
// Serializable has a security flaw. DON'T USE

// Everything not a bean is called a POJO (Plain Old Java Object)
public class Student {

	// All entities should have and id
	private int id;
	
	private String username;
	private String password;
	
	private Set<Course> transcript = new HashSet<Course>();
	
	public Student() {
		super();
	}

	public Student(int id, String username, String password, Set<Course> transcript) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.transcript = transcript;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Course> getTranscript() {
		return transcript;
	}

	public void setTranscript(Set<Course> transcript) {
		this.transcript = transcript;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", password=" + password + ", transcript=" + transcript
				+ "]";
	}
	
	
	
}
