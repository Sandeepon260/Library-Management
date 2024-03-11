package items;
public class Book extends LibraryItem {
    private String author;

    public Book(String location, boolean purchasable, String title, String author) {
        super("Book",location, purchasable, title);
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "Book: " + title + " by " + author + ". Location: " + getLocation() + ". Purchasable: " + isPurchasable();
    }
   
    public String getAuthor() {
    	return this.author;
    }


}
