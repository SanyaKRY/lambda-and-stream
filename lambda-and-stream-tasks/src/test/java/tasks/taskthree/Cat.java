package tasks.taskthree;

public class Cat implements MyInterface{
	String name;

	public Cat(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void getInformationAboutCat(Cat cat) {
		System.out.println(cat.toString() + "Default");		
	}

}
