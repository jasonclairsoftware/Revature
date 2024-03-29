package dev.jason.maps;

public class Account {

	private String email;		//PK
	private long phonenumber;
	private String fname;
	private String lname;
	private String username;

	public Account(String email, long phonenumber, String fname, String lname, String username) {
		this.setEmail(email);
		this.setPhonenumber(phonenumber);
		this.setFname(fname);
		this.setLname(lname);
		this.setUsername(username);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
