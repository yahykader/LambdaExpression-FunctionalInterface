package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StreamSortMap {
		
    public static void main(String[] args) {
    	Map<String, Integer> map=new HashMap<>();	
    	map.put("abdelkader", 8);
    	map.put("kader", 10);
    	map.put("yahiaoui", 12);
    	map.put("yacine", 17);
    	
    	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    	
    	//List<Entry<String,Integer>>entries=new ArrayList<>(map.entrySet());
    	
    	/*
    	Collections.sort(entries, new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
    	for (Entry<String, Integer> entry : entries) {
			System.out.println("key  :: "+entry.getKey()+" :: value ::"+entry.getValue());
		}
    	*/
    	System.out.println("************************************");
    	/*
    	Collections.sort(entries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
    	for (Entry<String, Integer> entry : entries) {
			System.out.println("key ::" +entry.getKey()+"   value ::"+entry.getValue());
		}
    	*/
    	/*
    	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    	System.out.println("************************************");
    	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    	*/
    	Map<Book,Integer>bookMap= new TreeMap<>((o1,o2)-> o1.getPages() - o2.getPages());
    	bookMap.put(new Book(1L,"JAVA",1245), 12);
    	bookMap.put(new Book(2L,"SPRING",500), 50);
        bookMap.put(new Book(3L,"HIBERNATE",600), 6);
        
        bookMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getPages))).forEach(System.out::println);
    	
        bookMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getPages))).forEach(System.out::println);
    	
	}

}
