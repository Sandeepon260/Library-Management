package items;

class Magazine extends LibraryItem {
    private String title;
    private String publisher;

    public Magazine(String location, boolean purchasable, String title,String publisher) {
        super(location, purchasable);
        this.title = title;
        this.publisher = publisher; 
    }

    @Override
    public String getDetails() {
        return "Magazine: " + title + ". Location: " + getLocation() + ". Purchasable: " + isPurchasable();
    }
}
