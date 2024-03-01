package items;

class LibraryItemFactory {
    public static LibraryItem createItem(String itemType, String location, boolean purchasable, String arg0, String arg1) {
        switch (itemType) {
            case "book":
                return new Book(location, purchasable, arg0, arg1);
            case "magazine":
                return new Magazine(location, purchasable, arg0,arg1);
            case "cd":
                return new CD(location, purchasable, arg0, arg1);
            default:
                throw new IllegalArgumentException("Invalid item type");
        }
    }
}