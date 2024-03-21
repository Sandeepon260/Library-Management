package items;
public class Book extends LibraryItem {
    private String author;

    public Book(String location, String price, boolean purchasable, boolean purchasable2, String title, String author) {
        super("Book",location, purchasable, title, author, purchasable, author);
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "Book: " + title + " by " + author + ". Location: " + getLocation() + ". Purchasable: " + isPurchasable();
    }
   
    public String getAuthor() {
    	return this.author;
    }
    
    public String getTitle() {
    	return this.title;
    }


}
