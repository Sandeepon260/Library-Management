package items;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
abstract class LibraryItem {
    private static int nextId = 1;
    private int itemId;
    private String location;
    private boolean purchasable;

    public LibraryItem(String location, boolean purchasable) {
        this.itemId = nextId++;
        this.location = location;
        this.purchasable = purchasable;
        addToDatabase();
    }
    

    private void addToDatabase() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("library.csv", true))) {
            writer.write( itemId + "," +
                         location + "," +
                         purchasable + "," +
                         getDetails() + "\n");
            System.out.println("Item added to the database.");
        } catch (IOException e) {
            System.err.println("Error writing to the database: " + e.getMessage());
        }
    }

    public abstract String getDetails();

    public int getItemId() {
        return itemId;
    }

    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
    	this.location = location;
    }
    
    public boolean isPurchasable() {
        return purchasable;
    }
}