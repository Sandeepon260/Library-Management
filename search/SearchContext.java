package search;
import items.*;
/
import java.util.List;
// Sandeepon Saha: This is the context class for the Strategy design pattern which allows the client code to set strategies to switch.  
public class SearchContext {
	private SearchStrategy strategy;
	
	public SearchContext(SearchStrategy strategy) {
		this.strategy = strategy;
	}
	public List<String> search(List<String> LibraryItems, String search){
		return strategy.search(LibraryItems, search);
	}
}
