package tasks.taskfive;

import java.util.List;

public class Author {
	
	String name;
	short age;
	List<Book> books;
	
	public Author(String name, short age, List<Book> books) {
		super();
		this.name = name;
		this.age = age;
		this.books = books;
	}

	public Author(String name, short age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	

}
