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

    private boolean isRented = false;
    private LocalDate rentalDate;
    private LocalDate dueDate;
    private String rentedBy; // Updated to use instead of borrowerEmail

    //req8 - fardad
    protected String borrowerEmail; // New field to store the email of the borrower

   public LibraryItem(String itemType, String location, boolean purchasable, String title) {
        this.itemId = nextId++;
        this.itemType = itemType;
        this.location = location;
        this.purchasable = purchasable;
        this.borrowerEmail = ""; // Initialize borrowerEmail to null
        this.title = title; // added 
    }

// Methods to rent and return items, including updating the database
    public void rentItem(LocalDate startDate, int rentalPeriodDays, String userEmail) {
        this.isRented = true;
        this.rentalDate = startDate;
        this.dueDate = startDate.plusDays(rentalPeriodDays);
        this.rentedBy = userEmail;
        updateDatabase();
    }

    public void returnItem() {
        this.isRented = false;
        this.rentalDate = null;
        this.dueDate = null;
        this.rentedBy = null;
        updateDatabase();
    }
 
    public String getTitle() {
    	return this.title;
    }
    
 // Update the database with the item's rental status
    private void updateDatabase() {
        // Path to your CSV database
        Path path = Paths.get("path/to/library.csv");
        try {
            List<String> fileContent = new ArrayList<>(Files.readAllLines(path));
            for (int i = 0; i < fileContent.size(); i++) {
                if (fileContent.get(i).startsWith(String.valueOf(itemId))) {
                    String[] splitLine = fileContent.get(i).split(",");
                    splitLine[5] = Boolean.toString(isRented);
                    splitLine[6] = isRented ? rentalDate.toString() : "";
                    splitLine[7] = isRented ? dueDate.toString() : "";
                    splitLine[8] = rentedBy != null ? rentedBy : "";
                    fileContent.set(i, String.join(",", splitLine));
                    break;
                }
            }
            Files.write(path, fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Existing methods...
    @Override
    public String toString() {
        // Update toString() to include new rental attributes
        return String.format("LibraryItem [itemId=%d, itemType=%s, location=%s, purchasable=%b, title=%s, isRented=%b, rentalDate=%s, dueDate=%s, rentedBy=%s]",
                itemId, itemType, location, purchasable, title, isRented, rentalDate, dueDate, rentedBy);
    }

    public abstract String getDetails();

 //    // req 8 - fardad
 //     @Override
	// public String toString() {
	// 	return "LibraryItem [itemId=" + itemId + ", itemType=" + itemType + ", location=" + location + ", purchasable="
	// 			+ purchasable + ", borrowerEmail=" + borrowerEmail + ", title=" + title + "]";
	// }


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
