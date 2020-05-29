package tasks.tasksix;

import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		System.out.println(
				Stream.of(new Person(8, "Alex")
						,new Person(2, "Sanya")
						,new Person(3, "Helen")
				        ,new Person(7, "Marli")
				        ,new Person(4, "Sanya")
				        ,new Person(6, "Bob"))
				.parallel()			
				.collect(new PopularNameCollector()));

	}
}
