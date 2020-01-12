package LambdaExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamFilter {

	public static void main(String[] args) {
		List<String> lists=new ArrayList<String>();
		
		lists.add("kader");lists.add("yacine");
		lists.add("yahyaoui");lists.add("nesrine");
		
		/*for (String s : lists) {
			if(s.startsWith("y")) {
				System.out.println(" le chaine commence par y est  :"+s);
			}
		}*/
		
		lists.stream().filter((s)->s.startsWith("y")).forEach(System.out::println);
        
		Map<String,Integer> maps=new HashMap<String, Integer>();
		
		maps.put("kader", 12);maps.put("yacine", 18);
		maps.put("yahyaoui", 1);maps.put("nesrine", 14);
		
		maps.entrySet().stream().filter((m)->m.getKey().startsWith("y")).forEach(System.out::println);		
		
	}

}
