package items;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//@author: Mehregan Mesgari

public abstract class LibraryItem {
    private static int nextId = 1;
    protected int itemId; // Instance variable

    protected String itemType;
    protected String location;
    protected boolean purchasable;
    protected String title;

    //req8 - fardad
    protected String borrowerEmail; // New field to store the email of the borrower

    public LibraryItem(String itemType, String location, boolean purchasable) {
        this.itemId = nextId++; 
        this.itemType = itemType;
        this.location = location;
        this.purchasable = purchasable;
        
        // req 8 - fardad
        this.borrowerEmail = ""; // Initialize borrowerEmail to null
        this.title = title; // added 
    }


 
    public String getTitle() {
    	return this.title;
    }
    

    // req 8 - fardad
     @Override
	public String toString() {
		return "LibraryItem [itemId=" + itemId + ", itemType=" + itemType + ", location=" + location + ", purchasable="
				+ purchasable + ", borrowerEmail=" + borrowerEmail + ", title=" + title + "]";
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

    public void setIsPurchasable(boolean val) {
    	this.purchasable = val;
    }

    // new methods that fardad added
    
    public String getBorrowerEmail() {
        return borrowerEmail;
    }

    public void setBorrowerEmail(String borrowerEmail) {
        this.borrowerEmail = borrowerEmail;
    }
    
    

    
}
