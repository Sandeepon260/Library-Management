package search;

import java.util.List;

public interface SearchStrategy {
	public List<Book> search(List<Book> books, String search);
}
