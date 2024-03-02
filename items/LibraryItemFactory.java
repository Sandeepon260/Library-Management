package items;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


//@author: Mehregan Mesgari

public class LibraryItemFactory {
    private static final String DATABASE_FILE = "library.csv";


    public static LibraryItem createItem(String itemType, String location, boolean purchasable, String arg0, String arg1) {
        LibraryItem item;
        switch (itemType.toLowerCase()) {
            case "book":
                item = new Book(location, purchasable, arg0, arg1);
                break;
            case "magazine":
                item = new Magazine(location, purchasable, arg0, arg1);
                break;
            case "cd":
                item = new CD(location, purchasable, arg0, arg1);
                break;
            default:
                throw new IllegalArgumentException("Invalid item type");
        }
        addToDatabase(item); 
        return item;
    }
    

    private static void addToDatabase(LibraryItem item) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATABASE_FILE, true))) {
            writer.write(item.getItemId() + "," +
                         item.getItemType() + "," +
                         item.getLocation() + "," +
                         (item instanceof Book ? ((Book) item).getTitle() + "," + ((Book) item).getAuthor() + "," :
                          item instanceof Magazine ? ((Magazine) item).getTitle() + "," + ((Magazine) item).getPublisher() + "," :
                          item instanceof CD ? ((CD) item).getTitle() + "," + ((CD) item).getArtist() + "," : "") +
                         item.isPurchasable() + "\n"
            );
            System.out.println("Item added to the database.");
        } catch (IOException e) {
            System.err.println("Error writing to the database: " + e.getMessage());
        }
    }
}

