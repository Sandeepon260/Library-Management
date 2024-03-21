package items;

//@author: Mehregan Mesgari

public class main {
    public static void main(String[] args) {
        // Creating items
        LibraryItem book = LibraryItemFactory.createItem("book", "Shelf A", null, true, false, "Harry Potter", "J.K. Rowling");
        LibraryItem magazine = LibraryItemFactory.createItem("magazine", "Magazine Rack", null, false, false, "National Geographic", "NY");
        LibraryItem cd = LibraryItemFactory.createItem("cd", "CD Section", null, true, false, "Thriller", "Michael Jackson");
        System.out.println(book.getItemId());
    }
}
