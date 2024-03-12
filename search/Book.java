package search;

class Book extends LibraryItem {
    private String title;
    private String author;
    

    public Book(String location, boolean purchasable, String title, String author) {
        super("Book",location, purchasable);
        this.title = title;
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "Book: " + title + " by " + author + ". Location: " + getLocation() + ". Purchasable: " + isPurchasable();
    }
    
    public String getTitle() {
    	return this.title;
    }
    public String getAuthor() {
    	return this.author;
    }


}
