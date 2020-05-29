package tasks.tasktwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(new Person("Sanya", 25), new Person("Bob", 35),	new Person("Djeun", 18));
		
		Comparator<Person> ComparatorByName =(Person o1, Person o2)->o1.getName().compareTo(o2.getName());
				
		Comparator<Person> ComparatorByAge =(Person o1, Person o2)->new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
		
		people.stream().sorted(ComparatorByName).forEach(System.out::println);
		System.out.println();
		people.stream().sorted(ComparatorByAge).forEach(System.out::println);
		
	}
}
