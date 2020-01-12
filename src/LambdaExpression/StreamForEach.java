package LambdaExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamForEach {
	public static void main(String[] args) {
		List<String>lists=new ArrayList<String>();
		
		lists.add("kader");lists.add("yacine");
		lists.add("yahyaoui");lists.add("nesrine");
		
		for (String s : lists) {
			System.out.println("lists  " +s);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		lists.forEach((t)->System.out.println("lists "+t));
		
		
		Map<String,Integer> maps=new HashMap<String, Integer>();
		
		maps.put("kader", 12);maps.put("yacine", 18);
		maps.put("yahyaoui", 1);maps.put("nesrine", 14);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		maps.forEach((k,v)->System.out.println("key "+ " "+ k +" "+ "value "+v));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		maps.entrySet().stream().forEach((m)->System.out.println(m));
		
	}

}
