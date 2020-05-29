package tasks.taskeight;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
				
		Tree tree0 = new Tree(0);		
		
		Tree tree12 = new Tree(12);
		Tree tree11 = new Tree(11);
		
		Tree tree21 = new Tree(21);
		Tree tree22 = new Tree(22);
				
		Tree tree2 = new Tree(2, tree21, tree22);	
		
		Tree tree1 = new Tree(1, tree11, tree12);		
		
		tree0.setChildren(Arrays.asList(tree1, tree2));			

		tree0.flattened().forEach(System.out::println);
		
		System.out.println("getAllValues: " + tree0.getAllValues());
		System.out.println("getEvenValues: " + tree0.getEvenValues());
		System.out.println("sumOfEvenValues: " + tree0.sumOfEvenValues().get());
		System.out.println("isContains13: " + tree0.isContains13());
	}

}
