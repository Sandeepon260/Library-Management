package items;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class LibraryItem {
    private static int nextId = 1;
    protected int itemId; // Instance variable

    protected String itemType;
    protected String location;
    protected boolean purchasable;

    public LibraryItem(String itemType, String location, boolean purchasable) {
        this.itemId = nextId++; 
        this.itemType = itemType;
        this.location = location;
        this.purchasable = purchasable;
    }

 

    public abstract String getDetails();

    public int getItemId() {
        return itemId;
    }

    public String getItemType() {
        return itemType;
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
