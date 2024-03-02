package libraryManagement;

import items.LibraryItemFactory;
import items.LibraryItem;

public class Main {
    public static void main(String[] args) {
        // Create a library instance
        Library library = new Library();

      //   Add items to the library
//        library.addItem("book", "Harry Potter and the Philosopher's Stone", "J.K. Rowling, fantasy");
//        library.addItem("magazine", "National Geographic", "Travel, Nature");
//        library.addItem("cd", "Thriller", "Michael Jackson, pop");
//
//        // Display initial items
        System.out.println("Initial Items:");
    
        // Enable rental for item with ID 1
        library.enableRental(1);
////
////        // Disable rental for item with ID 3
        library.disableRental(3);

        // Display items after enabling and disabling rentals
        System.out.println("\nItems after enabling and disabling rentals:");
    }

   
}

