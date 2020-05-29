package tasks.taskfour;

@FunctionalInterface
public interface ThreeFunction<T, U, R> {

	T func(U u, R r); 
	
}
