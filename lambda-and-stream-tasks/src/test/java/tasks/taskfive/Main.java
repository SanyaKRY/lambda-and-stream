package tasks.taskfive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
				
		Book book1 = new Book("title1", 200);
		Book book2 = new Book("title2", 300);
		Book book3 = new Book("title3", 100);
				
		Author author1 = new Author("Author1", (short)1);
		Author author2 = new Author("Author2", (short)2);
		Author author3 = new Author("Author3", (short)3);
		
		book1.setAuthors(Arrays.asList(author1, author2, author3));
		book2.setAuthors(Arrays.asList(author1, author2));
		book3.setAuthors(Arrays.asList(author1));
		
		author1.setBooks(Arrays.asList(book1, book2, book3));
		author2.setBooks(Arrays.asList(book1, book2));
		author3.setBooks(Arrays.asList(book1));
		
		List<Book> books = Arrays.asList(book1, book2, book3);
		
		System.out.println(books.parallelStream().anyMatch(book -> book.numberOfPages>200));
		
		System.out.println(books.parallelStream().collect(Collectors.minBy(Comparator.comparing(Book::getNumberOfPages))).get());
		System.out.println(books.parallelStream().collect(Collectors.maxBy(Comparator.comparing(Book::getNumberOfPages))).get());
		
		books.parallelStream().filter(book -> book.getAuthors().size() == 1).forEach(System.out::println);
		
		books.parallelStream().sorted(Comparator.comparing(Book::getNumberOfPages).thenComparing(Book::getTitle)).forEach(System.out::println);
		
		ArrayList<String> titles = books.parallelStream().map(book -> book.getTitle()).collect(Collectors.toCollection(ArrayList::new));
		titles.parallelStream().forEach(System.out::println);
		
		ArrayList<Author> authors =	books.parallelStream().map(Book::getAuthors).peek((autorList) -> System.out.print(autorList + " "))
				.flatMap(List::stream).distinct().collect(Collectors.toCollection(ArrayList::new));
				
		authors.parallelStream().forEach(System.out::println);
	}
}
