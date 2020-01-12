package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamSortList {
	
	public static void main(String[] args) {
		
		List<Integer> lists=new ArrayList<Integer>();
		lists.add(12);lists.add(121);lists.add(-5);
		lists.add(11);lists.add(50);
		
		Collections.sort(lists);//ASENDING horizontal
		System.out.println(lists);
		
		Collections.reverse(lists);
		System.out.println(lists);
		
		lists.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));// decending vertical 
		System.out.println("*******************************");
		lists.stream().sorted().forEach(s->System.out.println(s));
	    
		List<Book> list= new BookDAO().getBooks();
		Collections.sort(list, (b1,b2)->b1.getPages()-b2.getPages());
		System.out.println(list);
		
		System.out.println("************************************************");
		list.stream().sorted((b1,b2)->(b1.getPages()-b2.getPages())).forEach(System.out::println);
		System.out.println("************************************************");
		list.stream().sorted(Comparator.comparing(b->b.getPages())).forEach(System.out::println);
		System.out.println("************************************************");
		list.stream().sorted(Comparator.comparing(Book::getName)).forEach(System.out::println);
	
	     
	}

}
