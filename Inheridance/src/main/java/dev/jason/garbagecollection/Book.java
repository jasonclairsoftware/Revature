package dev.jason.garbagecollection;

public class Book {

	private String title;
	private int numpages;

	public Book()
	{}	
	public Book(String title, int numpages) {
		this.title = title;
		this.numpages = numpages;
	}

	public int getNumpages() {
		return numpages;
	}

	public void setNumpages(int numpages) {
		if (numpages > 0)
			this.numpages = numpages;
		else
			return;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public void finalize() {
		System.out.println("Deleting " + this.title);
	}
}
