package tasks.taskeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tree {

	private int value; 
	private List<Tree> children = new LinkedList<>();
	
	public Tree(int value, List<Tree> children) {
		super();
		this.value = value;
		this.children = children;
	} 
	
	public Tree(int value, Tree... children) { 
		this(value, Arrays.asList(children)); 
	}

	public int getValue() {
		return value;
	}

	public List<Tree> getChildren() {
		return Collections.unmodifiableList(children);
	} 
		
	public void setChildren(List<Tree> children) {
		this.children = children;
	}
	
	@Override
	public String toString() {
		return "" + value;
	}
	
	public Stream<Tree> flattened() {
        return Stream.concat(
                Stream.of(this),
                children.stream().flatMap(Tree::flattened));
    }

	public List<Integer> getAllValues() {
		return flattened().map(tree -> tree.getValue()).collect(Collectors.toCollection(ArrayList::new));	
	} 
	
	public List<Integer> getEvenValues() {
		return flattened().map(tree -> tree.getValue()).filter(number -> number%2==0).collect(Collectors.toCollection(ArrayList::new));	
	}
	
	public Optional<Integer> sumOfEvenValues() {
		return flattened().map(tree -> tree.getValue()).filter(number -> number%2==0).reduce((number1, number2) -> (number1 + number2));
	} 
	
	public Boolean isContains13() {
		return flattened().map(tree -> tree.getValue()).anyMatch(number -> number==13);
	}
		
}
