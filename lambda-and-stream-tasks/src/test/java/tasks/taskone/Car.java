package tasks.taskone;

public class Car {
	
	String name;
	
	Car(String name){
		this.name=name;
	}
	
	void refuel() {
		System.out.println(name + " is refueling");
	}
	
	void move() {
		System.out.println(name + " is moving");
	}
	
	void park() {
		System.out.println(name + " is parked");
	}

}
