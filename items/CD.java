package items;

class CD extends LibraryItem {
    private String title;
    private String artist;

    public CD(String location, boolean purchasable, String title, String artist) {
        super(location, purchasable);
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String getDetails() {
        return "CD: " + title + " by " + artist + ". Location: " + getLocation() + ". Purchasable: " + isPurchasable();
    }
}