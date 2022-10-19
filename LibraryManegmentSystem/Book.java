package LibraryManegmentSystem;

public class Book {
	
	private String book_name;
	private int price;
	private int book_no ;
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public Book(String book_name, int price, int book_no) {
		super();
		this.book_name = book_name;
		this.price = price;
		this.book_no = book_no;
	}
	@Override
	public String toString() {
		return "Book [book_name=" + book_name + ", price=" + price + ", book_no=" + book_no + "]";
	}
	 

}
