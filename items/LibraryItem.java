package items;

abstract class LibraryItem {
    private static int nextId = 1;
    private int itemId;
    private String location;
    private boolean purchasable;

    public LibraryItem(String location, boolean purchasable) {
        this.itemId = nextId++;
        this.location = location;
        this.purchasable = purchasable;
    }

    public abstract String details();

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