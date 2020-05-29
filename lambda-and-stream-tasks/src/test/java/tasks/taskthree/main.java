package tasks.taskthree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class main {
	public static void main(String[] args) {
		
		Supplier<Cat> getCat = () -> {
			System.out.println("Enter the name of the cat: ");
			String name = new Scanner(System.in).nextLine();
			return new Cat(name);
		};	
		
		Cat myCat = getCat.get();
	
		Predicate<Cat> predicate = (cat) -> cat.name.length() > 3;
		predicate.test(myCat);

		Consumer<Cat> consumer = System.out::println;
		consumer.accept(myCat);
		
		Function<String, Cat> function = Cat::new;
		function.apply("MyCat");
		
		UnaryOperator<Cat> unaryOperator = cat -> new Cat("MyCat" + cat.name);
		unaryOperator.apply(myCat);
				
		
		Predicate<Cat> predicateNameLength = MyInterface :: isNameMoreThenThreeLetters;
		
		List<Cat> cats = Arrays.asList(new Cat("May"));		
		System.out.println(cats.stream().allMatch(predicateNameLength));
				
		UnaryOperator<Cat> modifyName = cat -> cat.modifyName(cat);
		
		cats.stream().forEach(cat -> cat.modifyName(cat));
		
		MyInterface myInterface = System.out::println;
		cats.stream().forEach(cat -> myInterface.getInformationAboutCat(cat));
		
		MyInterface myInterfaceInner = new MyInterface(){

			@Override
			public void getInformationAboutCat(Cat cat) {
				System.out.println(cat.toString() + "Inner");
			}
			
		};
		myInterfaceInner.getInformationAboutCat(myCat);
		
	}
}
