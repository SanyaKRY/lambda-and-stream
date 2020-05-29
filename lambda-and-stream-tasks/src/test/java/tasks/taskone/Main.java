package tasks.taskone;

public class Main {
	public static void main(String[] args) {
				
		Runnable taskBmw = () -> {
			Car bmw = new Car("Bmw");
			bmw.refuel();
			try {
				Thread.sleep(10000);	
				bmw.move();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			bmw.park();
		};
		
		Runnable taskToyota = () -> {			
				Car toyota = new Car("Toyota");
				toyota.refuel();
				try {
					Thread.sleep(1000);	
					toyota.move();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				toyota.park();
		};
		
		executeTask(taskBmw);
		executeTask(taskToyota);

	}
	
	static void executeTask(Runnable runnable) {
		new Thread(runnable).start();
	}
}
