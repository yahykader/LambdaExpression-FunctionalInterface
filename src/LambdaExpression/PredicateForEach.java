package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateForEach {

	public static void main(String[] args) {
		Predicate<Integer> predicate=(t)->t%2==0;
		System.out.println(predicate.test(10));
		
		List<Integer> list=Arrays.asList(12,14,47,45,789,76);
		list.stream().filter((t)-> t>12).forEach(System.out::println);
		
	}


}
