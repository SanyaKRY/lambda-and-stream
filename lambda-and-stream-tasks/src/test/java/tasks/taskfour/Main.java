package tasks.taskfour;

public class Main {
	public static void main(String[] args) {
		
		ThreeFunction<Double, Double, Double> cylinderMass = (diameter, height) -> {
			return  (Math.PI*diameter*diameter*4)/height;
		};
		
		System.out.println(cylinderMass.func(15.8, 10.0));
		
		ThreeFunction<Boolean, Integer, Double> comparisonOfTwoNumbers = (diameter, height) -> {
			return  diameter<height;
		};

		System.out.println(comparisonOfTwoNumbers.func(15, 10.0));

	}
}
