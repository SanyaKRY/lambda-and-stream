package tasks.tasksix;

public class Person {
	
	int age;
	String name;	
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	

}
