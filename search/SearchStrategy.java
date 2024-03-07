package search;

import java.util.List;

public interface SearchStrategy {
	public Book matchSame(List<Book> books, String search);
	public List<Book> recommendations(List<Book> books, String search);
}
