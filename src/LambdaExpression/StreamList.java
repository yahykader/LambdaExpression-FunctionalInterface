package LambdaExpression;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamList {
	
	public static void main(String[] args) {
		List<Book>books=new BookDAO().getBooks();
		System.out.println("----------------------------------------");
		Collections.sort(books, (b1,b2)->b1.getPages()-(b2.getPages()));
		System.out.println(books);
		
		System.out.println("-----------------------------------------");
		books.stream().sorted((b1,b2)->b1.getPages()-b2.getPages()).forEach((s)->System.out.println(s));
		System.out.println("-----------------------------------------");
		books.stream().sorted((b1,b2)->b1.getPages()-b2.getPages()).forEach(System.out::println);
		System.out.println("-----------------------------------------");
		books.stream().sorted(Comparator.comparing(b->b.getName())).forEach(System.out::println);
		System.out.println("-----------------------------------------");
		books.stream().sorted(Comparator.comparing(Book::getName)).forEach(System.out::println);
		System.out.println("-----------------------------------------");	
	}
}
