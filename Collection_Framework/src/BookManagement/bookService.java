package BookManagement;

import java.util.ArrayList;
import java.util.List;

public class bookService {
	
	private List<Book> booklist;
	
	bookService() {
		booklist=new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		if(book!=null) {
			booklist.add(book); 
			System.out.println("Data added successfully");
		}else {
		System.out.println("Book object does not exist");
		}
	}
	
	
	public void removeBook(String title) {
		for(Book book: booklist) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				booklist.remove(book);
				System.out.println("Book removed successfully");
				return;
			}
		}
		System.out.println("Book Not found");
	}	
	
	public void updateBook(String title, String newAuthor, int newPages, double newPrice) {
	    for (Book book : booklist) {
	        if (book.getTitle().equalsIgnoreCase(title)) {
	            book.setAuthor(newAuthor);
	            book.setNoofpages(newPages);
	            book.setPrice(newPrice);
	            System.out.println("Book updated successfully!");
	            return;
	        }
	    }
	    System.out.println("Book not found!");
	}
	
	public List<Book> DisplayAllBooks(){
		return booklist;
	}
	
	public void DisplayBook(String title) {
	    for (Book book : booklist) {
	        if (book.getTitle().equalsIgnoreCase(title)) {
	            System.out.println(book);
	            return;
	        }
	    }
	    System.out.println("Book not found!");
	}


}
