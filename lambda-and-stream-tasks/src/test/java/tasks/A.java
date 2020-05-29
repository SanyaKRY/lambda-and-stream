package tasks;

import java.util.function.BiFunction;
import java.util.function.Function;

public class A {	
	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		Function<Integer, Double> curriedBiFirst =calculate.curryFirst(5.0);
		
		
		System.out.println(curriedBiFirst.apply(10));
		
	}
}

interface CurriedBiFunction<T,U,R> extends BiFunction<T,U,R>{
	
	default Function<U,R> curryFirst(T t){	
		return u ->apply(t,u);
	}
	
	default Function<T,R> currySecond(U u){
		return t ->apply(t,u);
	}
	
}

class Calculate implements CurriedBiFunction<Double, Integer, Double>{

	@Override
	public Double apply(Double t, Integer u) {
		return u-t;
	}


	
}