package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class ForeachConsumer {
	public static void main(String[] args) {
		/*Consumer<Integer> consumer=(t)->System.out.println("printing   "+ t);
			consumer.accept(10);
			*/
			
		List<Integer> list=Arrays.asList(12,25,45,78,58);	
		list.forEach((t)->System.out.println("printing "+t));
		list.stream().forEach((c)->System.out.println(c));
		
		
	}


}
