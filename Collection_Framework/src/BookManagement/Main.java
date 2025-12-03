package BookManagement;

public class Main {
    public static void main(String[] args) {

        bookService service = new bookService();

        // 1. Add books
        service.addBook(new Book("Atomic Habits", "James Clear", 500, 300));
        service.addBook(new Book("Ikigai", "Rakesh", 700, 400));

        // 2. Display all books
        System.out.println("\nAll Books:");
        service.DisplayAllBooks().forEach(System.out::println);

        // 3. Remove book
        System.out.println("\nRemoving book: Atomic Habits");
        service.removeBook("Atomic Habits");
//        service.DisplayAllBooks().forEach(System.out::println);

        // 4. Update book
        service.updateBook("Ikigai", "Hector Garcia", 750, 450);
        service.DisplayAllBooks().forEach(System.out::println);

        // 5. Display single book
        System.out.println("\nSearching for Ikigai:");
        service.DisplayBook("Ikigai");

        System.out.println("\nSearching for NonExistingBook:");
        service.DisplayBook("NonExistingBook");
    }
}
