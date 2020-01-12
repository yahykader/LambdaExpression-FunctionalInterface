package LambdaExpression;

import java.util.List;
import java.util.stream.Collectors;

public class Expampleservice {
	
	/*public static List<Book> getBooksNbresPages(int input){
		if(input==200) {
			return BookDAO.getBooks().stream().filter(b->b.getPages()>200).collect(Collectors.toList());
		}else {
			return BookDAO.getBooks().stream().filter(b->b.getPages()<200).collect(Collectors.toList());
		}
		
	}
	*/
	public static List<Book> getBooksNbresPages(int input){
		return (input==200) 
			?BookDAO.getBooks().stream().filter(b->b.getPages()>200).collect(Collectors.toList())
			:BookDAO.getBooks().stream().filter(b->b.getPages()<200).collect(Collectors.toList());
		}
	
	public static void main(String[] args) {
		System.out.println(getBooksNbresPages(199));
	}

}
