package search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class searchByTitle implements SearchStrategy{

	@Override
	public List<Book> search(List<Book> books, String search) {
		List<Book> result = new ArrayList<>();
		for (Book book: books) {
			if(search.equalsIgnoreCase(book.getTitle())) {
				result.add(book);
				return result;
			}
		}
		return result;
	}

	
	public List<Book> recommendations(List<Book> books, String search) {
		// TODO Auto-generated method stub
		// Getting the words from the search in a list 
		List<String> words = words(search);
		List<Book> recommendations = new ArrayList<>();
		Map<Book,Integer> booktoMatchCount = new HashMap<>();
		int matchCount;
		int highestMatch = 0; //Highest number of words matched to the titles
		int secondMatch = 0; // Second highest
		int thirdMatch = 0; // Third highest
		
		
		for(Book book: books) {
			matchCount = 0;
			List<String> title = words(book.getTitle());
			for(String word: words) {
				if(title.contains(word)) {
					matchCount++;
				}
			}
			booktoMatchCount.put(book, matchCount); // Mapping the books with the number of words matched in the title as the search
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
		//Getting the books that have the top 3 highest number of words matched to the title to produce recommendations
		if(highestMatch == 0) {
			return null; // No matches 
		} else {
			for(Map.Entry<Book, Integer> entry: booktoMatchCount.entrySet()) {
				Book book = entry.getKey();
				Integer match = entry.getValue();
				if(match == highestMatch) {
					recommendations.add(book);
				}
				if(secondMatch != 0) {
					if(match == secondMatch) {
						recommendations.add(book);
					}
					if(thirdMatch != 0) {
						if(match == thirdMatch) {
							recommendations.add(book);
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
					if(!(word.equalsIgnoreCase("the") | word.equalsIgnoreCase("and")))
					words.add(word.toLowerCase()); //Ignoring one and 2 letter words such as "of", "an", "to" for text similarity
				}				
				word = "";
			}
		}
		return words;
	}
	
	
}
