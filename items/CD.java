package items;

//@author: Mehregan Mesgari

class CD extends LibraryItem {
    private String artist;

    public CD(String location, boolean purchasable, String title, String artist) {
        super("CD",location, purchasable, title);
        this.artist = artist;
    }

    @Override
    public String getDetails() {
        return "CD: " + title + " by " + artist + ". Location: " + getLocation() + ". Purchasable: " + isPurchasable();
    }

    public String getArtist() {
    	return this.artist;
    }

}
