package BookManagement;

public class Book {
	private String title;
	private String author;
	private int noofpages;
	private double price;
	
	
	
	public Book(String title, String author, int i, double price) {
		super();
		this.title = title;
		this.author = author;
		this.noofpages = i;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNoofpages() {
		return noofpages;
	}
	public void setNoofpages(int noofpages) {
		this.noofpages = noofpages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", noofpages=" + noofpages + ", price=" + price + "]";
	}
	
	

		
	
	
	

}
