package tasks.taskseven;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class IntSummaryStatisticsCollector implements Collector<Integer, List<Integer>, IntSummaryStatistics> {

	@Override
	public Supplier<List<Integer>> supplier() {
		return ArrayList<Integer>::new;
	}

	@Override
	public BiConsumer<List<Integer>, Integer> accumulator() {
		return List::add;
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		return (left, right) -> {
            left.addAll(right);
            return left;
        };
	}

	@Override
	public Function<List<Integer>, IntSummaryStatistics> finisher() {
		return (list) -> {
			
			long max = mapToInt(list)
				      .max()
				      .orElseThrow(NoSuchElementException::new);
			
			long min = mapToInt(list)
				      .min()
				      .orElseThrow(NoSuchElementException::new);
			
			long sum = mapToInt(list)
				      .sum();
			
			double average = mapToInt(list)
				      .average()
				      .orElseThrow();
			
			long count = mapToInt(list)
				      .count();

			return new IntSummaryStatistics(sum, count, average, min, max);
		};
	}
	
	
	public static IntStream mapToInt(List<Integer> list) {
		return list.stream().mapToInt(number -> number);
	}

	@Override
	public Set<Characteristics> characteristics() {
		return EnumSet.of(Characteristics.CONCURRENT);
	}	

}
