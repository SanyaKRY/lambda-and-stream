package tasks.taskseven;

import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
						 
		IntSummaryStatistics intSummaryStatistics = Stream.iterate(0, i -> i + 5).limit(100).parallel().collect(new IntSummaryStatisticsCollector());		
		System.out.println(intSummaryStatistics.toString());
		
	}
}
