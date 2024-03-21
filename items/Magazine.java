package items;

//@author: Mehregan Mesgari

class Magazine extends LibraryItem {
    private String publisher;

    public Magazine(String location, String price, boolean purchasable, boolean purchasable2, String title,String publisher) {
        super("Magazine",location, purchasable, title, publisher, purchasable, publisher);
        this.publisher = publisher; 
    }

    @Override
    public String getDetails() {
        return "Magazine: " + title + ". Location: " + getLocation() + ". Purchasable: " + isPurchasable();
    }

    public String getPublisher() {
    	return this.publisher;
    }
	
}
