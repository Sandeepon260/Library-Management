package search;

import java.util.List;

public class SearchContext {
	private SearchStrategy strategy;
	
	public SearchContext(SearchStrategy strategy) {
		this.strategy = strategy;
	}
	public List<Book> search(List<Book> books, String search){
		return strategy.search(books, search);
	}
}
