package items;

//@author: Mehregan Mesgari

public class CD extends LibraryItem {
    private String artist;

    public CD(String location, String price, boolean purchasable, boolean purchasable2, String title, String artist) {
        super("CD",location, purchasable, title, artist, purchasable, artist);
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
