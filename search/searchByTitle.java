package search;
import items.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class searchByTitle implements SearchStrategy{

	@Override
	public List<LibraryItem> search(List<LibraryItem> LibraryItems, String search) {
		List<LibraryItem> result = new ArrayList<>();
		for (LibraryItem LibraryItem: LibraryItems) {
			if(search.equalsIgnoreCase(LibraryItem.getTitle())) {
				result.add(LibraryItem);
				return result;
			}
		}
		return result;
	}

	
//	public List<LibraryItem> recommendations(List<LibraryItem> LibraryItems, String search) {
//		// TODO Auto-generated method stub
//		// Getting the words from the search in a list 
//		List<String> words = words(search);
//		List<LibraryItem> recommendations = new ArrayList<>();
//		Map<LibraryItem,Integer> LibraryItemtoMatchCount = new HashMap<>();
//		int matchCount;
//		int highestMatch = 0; //Highest number of words matched to the titles
//		int secondMatch = 0; // Second highest
//		int thirdMatch = 0; // Third highest
//		
//		
//		for(LibraryItem LibraryItem: LibraryItems) {
//			matchCount = 0;
//			List<String> title = words(LibraryItem.getTitle());
//			for(String word: words) {
//				if(title.contains(word)) {
//					matchCount++;
//				}
//			}
//			LibraryItemtoMatchCount.put(LibraryItem, matchCount); // Mapping the LibraryItems with the number of words matched in the title as the search
//			// Updating the highest number of words matched to the titles and the search words
//			if(matchCount > highestMatch) {
//				thirdMatch = secondMatch;
//				secondMatch = highestMatch;
//				highestMatch = matchCount;
//			} else if (matchCount > secondMatch) {
//				thirdMatch = secondMatch;
//				secondMatch = matchCount;
//			} else if (matchCount > thirdMatch) {
//				thirdMatch = matchCount;
//			}
//		}
//		//Getting the LibraryItems that have the top 3 highest number of words matched to the title to produce recommendations
//		if(highestMatch == 0) {
//			return null; // No matches 
//		} else {
//			for(Map.Entry<LibraryItem, Integer> entry: LibraryItemtoMatchCount.entrySet()) {
//				LibraryItem LibraryItem = entry.getKey();
//				Integer match = entry.getValue();
//				if(match == highestMatch) {
//					recommendations.add(LibraryItem);
//				}
//				if(secondMatch != 0) {
//					if(match == secondMatch) {
//						recommendations.add(LibraryItem);
//					}
//					if(thirdMatch != 0) {
//						if(match == thirdMatch) {
//							recommendations.add(LibraryItem);
//						}
//					}
//				}
//			}
//		}
//		
//		
//		return recommendations;
//		
//	}
	
	public List<String> words(String search){
		List<String> words = new ArrayList<>();
		String word = "";
		
		for(int i = 0; i < search.length(); i++) {
			char current = search.charAt(i);
			if(Character.isLetter(current)) {
				word = word + current;
			} else {
				if(!(word.length() <= 2)) {
					if(!(word.equalsIgnoreCase("the") | word.equalsIgnoreCase("and")))
					words.add(word.toLowerCase()); //Ignoring one and 2 letter words such as "of", "an", "to" for text similarity
				}				
				word = "";
			}
		}
		return words;
	}
	
	
}
