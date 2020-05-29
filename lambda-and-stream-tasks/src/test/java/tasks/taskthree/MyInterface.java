package tasks.taskthree;

@FunctionalInterface
public interface MyInterface {	
	
	void getInformationAboutCat(Cat cat);	
	
	default Cat modifyName(Cat cat) {
		return new Cat("MyCat" + cat.name);
	}	 
	 
	static boolean isNameMoreThenThreeLetters(Cat cat) {
		return cat.name.length() > 3;
	}
	 
}
