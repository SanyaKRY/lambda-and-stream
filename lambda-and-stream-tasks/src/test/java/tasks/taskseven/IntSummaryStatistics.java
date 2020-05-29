package tasks.taskseven;

public class IntSummaryStatistics {
	
	long sum;
	long count;
	double average;
	long min;
	long max;
	
	public IntSummaryStatistics(long sum, long count, double average, long min, long max) {
		super();
		this.sum = sum;
		this.count = count;
		this.average = average;
		this.min = min;
		this.max = max;
	}
		
	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public long getMin() {
		return min;
	}

	public void setMin(long min) {
		this.min = min;
	}

	public long getMax() {
		return max;
	}

	public void setMax(long max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "sum: " + sum + " count: " + count + " average: " + average + " min: " + min + " max: " + max;
	}
	
}
