package items;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LibraryItemFactory {
    private static final String DATABASE_FILE = "library.csv";

    public static LibraryItem createItem(String itemType, String location, String price, boolean rented, boolean purchasable, String title, String author) {
        LibraryItem item;
        switch (itemType.toLowerCase()) {
            case "book":
                item = new Book(location, price, rented, purchasable, title, author);
                break;
            case "magazine":
                item = new Magazine(location, price, rented, purchasable, title, author);
                break;
            case "cd":
                item = new CD(location, price, rented, purchasable, title, author);
                break;
            default:
                throw new IllegalArgumentException("Invalid item type");
        }
        addToDatabase(item);
        return item;
    }

    private static void addToDatabase(LibraryItem item) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATABASE_FILE, true))) {
            // ID, Type, Title, Author, Purchasable, Price, Rented
            String lineToWrite = item.getItemId() + "," + item.getClass().getSimpleName() + "," + item.getTitle() + "," +
            item.getAuthor() + "," + item.isPurchasable() + "," + item.getPrice() + "," + item.isRented();
            writer.write(lineToWrite + "\n");
            System.out.println("Item added to the database.");
        } catch (IOException e) {
            System.err.println("Error writing to the database: " + e.getMessage());
        }
    }
}
