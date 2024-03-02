package items;

public class main {
    public static void main(String[] args) {
        // Creating items
        LibraryItem book = LibraryItemFactory.createItem("book", "Shelf A", true, "Harry Potter", "J.K. Rowling");
        LibraryItem magazine = LibraryItemFactory.createItem("magazine", "Magazine Rack", false, "National Geographic", "NY");
        LibraryItem cd = LibraryItemFactory.createItem("cd", "CD Section", true, "Thriller", "Michael Jackson");
    }
}
