//public class Book {
//    static int TotalBooks = 100; // Initialize once, not in the constructor
//
//    String title;
//    String author = "Land";
//
//    // Constructor (no need to set TotalBooks here)
//    Book() {
//        // TotalBooks is already initialized statically
//    }
//
//    // Method to borrow a book (decrement the total number of books)
//    public void Borrow() {
//        TotalBooks--;
//    }
//
//    // Method to return a book (increment the total number of books)
//    public void Returned() {
//        System.out.println("Book returned");
//        TotalBooks++;
//    }
//
//    // Method to get the total number of books
//    public static int getTotalBooks() {
//        return TotalBooks;
//    }
//
//    public static void main(String[] args) {
//        Book mybook = new Book(); // Creating a new book instance
//        System.out.println(mybook.author); // Output the author
//        System.out.println(mybook.getTotalBooks()); // Output the total number of books (should be 100)
//
//        mybook.Borrow(); // Borrow a book
////        System.out.println(mybook.getTotalBooks()); // Output the updated total number of books (should be 99)
//
//        System.out.println(getTotalBooks());
//
//    }
//}

public class Book {
    static int totalBooks = 0; // Counter for total number of book instances

    String title;
    String author;
    String isbn;

    // Constructor to initialize the instance variables
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++; // Increment the total book counter whenever a new book instance is created
    }

    // Method to borrow a book (decrement the total number of books)
    public void borrowBook() {
        if (totalBooks > 0) {
            totalBooks--;
            System.out.println("Book borrowed: " + this.title);
        } else {
            System.out.println("No books available to borrow.");
        }
    }

    // Method to return a book (increment the total number of books)
    public void returnBook() {
        totalBooks++;
        System.out.println("Book returned: " + this.title);
    }

    // Static method to get the total number of books
    public static int getTotalBooks() {
        return totalBooks;
    }

    public static void main(String[] args) {
        // Creating new book instances
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "0987654321");

        // Output the total number of books
        System.out.println("Total books in library: " + Book.getTotalBooks()); // Should output 2

        // Borrow a book and output the updated total number of books
        book1.borrowBook();
        System.out.println("Total books in library after borrowing: " + Book.getTotalBooks()); // Should output 1

        // Return a book and output the updated total number of books
        book1.returnBook();
        System.out.println("Total books in library after returning: " + Book.getTotalBooks()); // Should output 2
    }
}
















