package tasks.tasksix;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class AverageAgeCollector implements Collector<Person, List<Person>, Integer> {

	@Override
	public Supplier<List<Person>> supplier() {
		return ArrayList<Person>::new;
	}

	@Override
	public BiConsumer<List<Person>, Person> accumulator() {
		return List::add;
	}

	@Override
	public BinaryOperator<List<Person>> combiner() {
		return (left, right) -> {
            left.addAll(right);
            return left;
        };
	}

	@Override
	public Function<List<Person>, Integer> finisher() {
		return (list) -> {
			int sum = 0;
			for (Person person : list) {
				sum += person.age;
			}
			return sum / list.size();
		};	
	}

	@Override
	public Set<Characteristics> characteristics() {
		return EnumSet.of(Characteristics.CONCURRENT);
	}
	    
}
