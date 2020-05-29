package tasks.taskfive;

import java.util.List;

public class Book {
	
	String title;
	List<Author> authors;
	int numberOfPages;
	
	public Book(String title, List<Author> authors, int numberOfPages) {
		super();
		this.title = title;
		this.authors = authors;
		this.numberOfPages = numberOfPages;
	}

	public Book(String title, int numberOfPages) {
		super();
		this.title = title;
		this.numberOfPages = numberOfPages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	@Override
	public String toString() {
		return "title: " + title + " authors: " + authors + "numberOfPages: " + numberOfPages;
	}
	
}
