package items;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


//@author: Mehregan Mesgari

public class LibraryItemFactory {
    private static final String DATABASE_FILE = "library.csv";


    public static LibraryItem createItem(String itemType, String location, boolean purchasable, String title, String author) {
        LibraryItem item;
        switch (itemType.toLowerCase()) {
            case "book":
                item = new Book(location, purchasable, title, author);
                break;
            case "magazine":
                item = new Magazine(location, purchasable, title, author);
                break;
            case "cd":
                item = new CD(location, purchasable, title, author);
                break;
            default:
                throw new IllegalArgumentException("Invalid item type");
        }
        addToDatabase(item); 
        return item;
    }
    

    private static void addToDatabase(LibraryItem item) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATABASE_FILE, true))) {
            String lineToWrite = item.getItemId() + ","; // ID
            if (item instanceof Book) {
                // For Books, we add Title and Author
                Book book = (Book) item;
                lineToWrite += book.getTitle() + "," + book.getAuthor() + ",";
            } else if (item instanceof Magazine) {
                // For Magazines, we might only add Title since it doesn't have an author in your design
                Magazine magazine = (Magazine) item;
                lineToWrite += magazine.getTitle() + ",,"; // Double comma for missing author
            } else if (item instanceof CD) {
                // For CDs, we might only add Title since it doesn't have an author in your design
                CD cd = (CD) item;
                lineToWrite += cd.getTitle() + ",,"; // Double comma for missing author
            }
            
            lineToWrite += item.isPurchasable(); // Whether the item is purchasable
            writer.write(lineToWrite + "\n");
            System.out.println("Item added to the database.");
        } catch (IOException e) {
            System.err.println("Error writing to the database: " + e.getMessage());
        }
    }
  
    
    
    
}

