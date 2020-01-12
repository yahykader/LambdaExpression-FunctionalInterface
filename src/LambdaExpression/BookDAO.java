package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookDAO {
	
	public static List<Book> getBooks(){
		List<Book> books=new ArrayList<>();
		books.add(new Book(1L,"JAVA",1245));
		books.add(new Book(2L,"SPRING",500));
		books.add(new Book(3L,"HIBERNATE",124));
		books.add(new Book(4L,"BIGDATA",145));
		books.add(new Book(5L,"ANGULAR",450));
		return books;
	}
	
	public List<Book> getBookinSort(){
		List<Book> books=this.getBooks();
		Collections.sort(books, (o1,o2)->o1.getName().compareTo(o2.getName()));
		//Collections.sort(books, new MyComparator());
		return books;
	}

}
/*
class MyComparator implements Comparator <Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}
	(o1,o2)->{
	   o1.getNames().compareTo(o2.getNames());
	}
	
}
*/