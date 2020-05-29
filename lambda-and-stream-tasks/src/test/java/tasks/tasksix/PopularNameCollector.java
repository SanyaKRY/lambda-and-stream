package tasks.tasksix;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PopularNameCollector implements Collector<Person, List<Person>, String> {

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
	public Function<List<Person>, String> finisher() {
		return (list) -> {
			return list.stream()
					.map(person -> person.name)
					.collect(Collectors.groupingBy(name -> name, Collectors.counting()))
			        .entrySet()
			        .stream()
			        .max(Comparator.comparing(Entry::getValue))
			        .get()
			        .getKey();
		};	
	}

	@Override
	public Set<Characteristics> characteristics() {
		return EnumSet.of(Characteristics.CONCURRENT);
	}

}
