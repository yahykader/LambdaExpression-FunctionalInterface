package LambdaExpression;

public class Book {
	private Long id;
	private String name;
	private int pages;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(Long id, String name, int pages) {
		super();
		this.id = id;
		this.name = name;
		this.pages = pages;
	}
    
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pages=" + pages + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	

}
