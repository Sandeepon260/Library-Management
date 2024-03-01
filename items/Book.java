package items;
class Book extends LibraryItem {
    private String title;
    private String author;

    public Book(String location, boolean purchasable, String title, String author) {
        super(location, purchasable);
        this.title = title;
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "Book: " + title + " by " + author + ". Location: " + getLocation() + ". Purchasable: " + isPurchasable();
    }
}
