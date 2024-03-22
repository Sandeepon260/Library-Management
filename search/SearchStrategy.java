package search;
import items.*;

import java.util.List;
// Sandeepon Saha: This is the interface for the strategies that will get implemented for the concrete strategy classes. 
public interface SearchStrategy {
	public List<String> search(List<String> LibraryItems, String search);
}
