package search;
import items.*;

import java.util.List;

public interface SearchStrategy {
	public List<String> search(List<String> LibraryItems, String search);
}
