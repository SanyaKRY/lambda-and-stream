package tests;

import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import tasks.taskseven.IntSummaryStatistics;
import tasks.taskseven.IntSummaryStatisticsCollector;

public class TestSevenTask {
	
	@Test
	public void sevenTaskTest() {		
		IntSummaryStatistics intSummaryStatistics = Stream.iterate(0, i -> i + 5).limit(100).parallel().collect(new IntSummaryStatisticsCollector());
		Assert.assertEquals(intSummaryStatistics.getSum(), 24750);
	}

}
