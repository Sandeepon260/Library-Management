package search;
import items.*;

import java.util.List;

public class SearchContext {
	private SearchStrategy strategy;
	
	public SearchContext(SearchStrategy strategy) {
		this.strategy = strategy;
	}
	public List<String> search(List<String> LibraryItems, String search){
		return strategy.search(LibraryItems, search);
	}
}
