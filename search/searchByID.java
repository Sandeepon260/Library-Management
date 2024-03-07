package search;

import java.util.ArrayList;
import java.util.List;

public class searchByID implements SearchStrategy {

	@Override
	public Book matchSame(List<Book> books, String search) {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(search);
		for(Book book: books) {
			if(book.getItemId() == id) {
				return book;
			}
		}
		return null;
	}

	@Override
	public List<Book> recommendations(List<Book> books, String search) {
		// TODO Auto-generated method stub
		Book book = this.matchSame(books, search);
		List<Book> recommendations = new ArrayList<>();
		if(!book.equals(null)) {
			for(Book check: books) {
				if(check.genre.equals(book.genre)) {
					recommendations.add(check);
				}
			}
			return recommendations;
		}
		return null;
	}

}
