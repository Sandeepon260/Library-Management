package search;
import items.*;

import java.util.List;

public interface SearchStrategy {
	public List<LibraryItem> search(List<LibraryItem> LibraryItems, String search);
}
