package search;
import items.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class searchByTitle implements SearchStrategy{

	@Override
	public List<String> search(List<String> titles, String search) {
		List<String> result = new ArrayList<>();
		for (String title: titles) {
			System.out.println("title: "+ title.toLowerCase() + " search: " + search.toLowerCase() + search.toLowerCase().equals(title.toLowerCase()));
			if(search.trim().toLowerCase().equals(title.trim().toLowerCase())) {
				result.add(title);
				return result;
			}
		}
		return result;
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
