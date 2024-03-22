package search;
import items.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Sandeepon Saha: concrete strategy class to generate the recommendations based on the user input. The text similarity algorithm used here is to find matches of the words from the search prompt within the titles of the book to find similarities and generate recommendations. 
public class recommendations implements SearchStrategy {

	@Override
	public List<String> search(List<String> titles, String search) {
		// TODO Auto-generated method stub
		List<String> words = words(search);
		List<String> recommendations = new ArrayList<>();
		Map<String,Integer> LibraryItemtoMatchCount = new HashMap<>();
		int matchCount;
		int highestMatch = 0; //Highest number of words matched to the titles
		int secondMatch = 0; // Second highest
		int thirdMatch = 0; // Third highest
		
		
		for(String title: titles) {
			matchCount = 0;
			List<String> name = words(title);
			for(String word: words) {
				if(name.contains(word)) {
					matchCount++;
				}
			}
			if(matchCount > 0) {
				if(!recommendations.contains(title)) {
					recommendations.add(title);
				}
				
			}
			LibraryItemtoMatchCount.put(title, matchCount); // Mapping the LibraryItems with the number of words matched in the title as the search
			// Updating the highest number of words matched to the titles and the search words
			if(matchCount > highestMatch) {
				thirdMatch = secondMatch;
				secondMatch = highestMatch;
				highestMatch = matchCount;
			} else if (matchCount > secondMatch) {
				thirdMatch = secondMatch;
				secondMatch = matchCount;
			} else if (matchCount > thirdMatch) {
				thirdMatch = matchCount;
			}
		}
		
		//Getting the LibraryItems that have the top 3 highest number of words matched to the title to produce recommendations
		if(highestMatch == 0) {
					return recommendations; // No matches 
				} else {
					for(Map.Entry<String, Integer> entry: LibraryItemtoMatchCount.entrySet()) {
						String title = entry.getKey();
						Integer match = entry.getValue();
						if(match == highestMatch) {
//							boolean check = true;
							if(!recommendations.contains(title)) {
								recommendations.add(title);
							}
						}
						if(secondMatch != 0) {
							if(match == secondMatch) {
								if(!recommendations.contains(title)) {
									recommendations.add(title);
								}
								
							}
							if(thirdMatch != 0) {
								if(match == thirdMatch) {
									if(!recommendations.contains(title)) {
										recommendations.add(title);
									}
								}
							}
						}
					}
				}
				
				
				return recommendations;
	}
	public List<String> words(String search){
		List<String> words = new ArrayList<>();
		String word = "";
		
		for(int i = 0; i < search.length(); i++) {
			char current = search.charAt(i);
			if(Character.isLetter(current)) {
				word = word + current;
			} else {
				if(!(word.length() <= 2)) {
					if(!(word.equalsIgnoreCase("the") | word.equalsIgnoreCase("and") | word.equalsIgnoreCase("are")))
					words.add(word.toLowerCase()); //Ignoring one and 2 letter words such as "of", "an", "to" for text similarity
				}				
				word = "";
			}
		}
		// Add the last word after the loop finishes (if it exists)
	    if(!(word.length() <= 2)) {
	        if(!(word.equalsIgnoreCase("the") | word.equalsIgnoreCase("and") | word.equalsIgnoreCase("are")))
	            words.add(word.toLowerCase());
	    }
		return words;
	}

}
