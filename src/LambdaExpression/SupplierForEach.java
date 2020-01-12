package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierForEach {

	public static void main(String[] args) {
		Supplier<String>supplier=()->"Functional Interface...";
		//System.out.println(supplier.get());
		
		List<String> list=Arrays.asList("1","a","al");
		list.stream().findAny().orElseGet(supplier);

	}

}
