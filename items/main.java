package items;

public class main {
    public static void main(String[] args) {  
        LibraryItem book = LibraryItemFactory.createItem("book", "Shelf A", true, "Harry Potter", "J.K. Rowling");
        System.out.println(book.details());

        LibraryItem magazine = LibraryItemFactory.createItem("magazine", "Magazine Rack", false, "National Geographic", "NY");
        System.out.println(magazine.details());

        LibraryItem cd = LibraryItemFactory.createItem("cd", "CD Section", true, "Thriller", "Michael Jackson");
        System.out.println(cd.details());
    }
}