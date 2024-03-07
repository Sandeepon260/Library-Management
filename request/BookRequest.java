package request;

public class BookRequest implements Comparable<BookRequest> {
    private String bookTitle;
    private String requester;
    private int priority; // Lower numbers indicate higher priority

    public BookRequest(String bookTitle, String requester, int priority) {
        this.bookTitle = bookTitle;
        this.requester = requester;
        this.priority = priority;
    }

    @Override
    public int compareTo(BookRequest other) {
        return Integer.compare(this.priority, other.priority);
    }

    // Getters
    public String getBookTitle() { return bookTitle; }
    public String getRequester() { return requester; }
    public int getPriority() { return priority; }

}