package libraryManagement;

import items.LibraryItemFactory;
import items.LibraryItem;

public class Main {
    public static void main(String[] args) {
        // Create a library instance
        Library library = new Library();

 //        Add items to the library
        library.addItem("book", "Harry Potter and the Philosopher's Stone", "J.K. Rowling, fantasy");
        library.addItem("magazine", "National Geographic", "Travel, Nature");
        library.addItem("cd", "Thriller", "Michael Jackson, pop");

        // Display initial items
        System.out.println("Initial Items:");
    
        // Enable rental for item with ID 1
        library.enableRental(1);
////
////        // Disable rental for item with ID 3
        library.disableRental(3);

        // Display items after enabling and disabling rentals
        System.out.println("\nItems after enabling and disabling rentals:");



        // req 8 - fardad
        
        // Create a StudentLibrary instance
        StudentLibrary studentLibrary = new StudentLibrary();

        // Add a book to the library
        studentLibrary.addItem("book", "Introduction to Programming", "Computer Science, true, Introduction to Programming, John Doe, jose@gmail.com");
        studentLibrary.addItem("book", "Introduction to Java", "Computer Science, true, Introduction to Programming, John Doe, joseph@gmail.com");

        // Set the book as borrowed by a student
        LibraryItem borrowedBook = studentLibrary.findItemByTitle("Introduction to Programming");
        if (borrowedBook != null) {
            borrowedBook.setBorrowerEmail("jose@gmail.com");
        }
        LibraryItem borrowedBook1 = studentLibrary.findItemByTitle("Introduction to Java");
        if (borrowedBook1 != null) {
            borrowedBook1.setBorrowerEmail("joseph@gmail.com");
        }

        ////Demonstrate returning the book
        if (borrowedBook != null) {
            studentLibrary.returnItem(borrowedBook.getItemId());
        }

        // Display virtual copies available to the student
        displayVirtualCopies(studentLibrary, "jose@gmail.com");
        displayVirtualCopies(studentLibrary, "joseph@gmail.com");

        //req 8 done
    }

    // req 8 - fardad
    // Method to display virtual copies available to a student
    private static void displayVirtualCopies(StudentLibrary studentLibrary, String studentEmail) {
        System.out.println("Virtual copies available to student '" + studentEmail + "': "
                + studentLibrary.getVirtualCopies(studentEmail));
    }

   
}

