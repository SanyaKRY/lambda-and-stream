package tests;

import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import tasks.tasksix.Person;
import tasks.tasksix.PopularNameCollector;

public class TestSixTask {

	@Test
	public void sixTaskTest() {
		
		String name = Stream.of(new Person(8, "Alex")
				,new Person(2, "Sanya")
				,new Person(3, "Helen")
		        ,new Person(7, "Marli")
		        ,new Person(4, "Sanya")
		        ,new Person(6, "Bob"))				
		        .parallel()			
		        .collect(new PopularNameCollector());
		Assert.assertEquals(name, "Sanya");
		
	}
}
