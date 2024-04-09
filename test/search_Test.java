package test;



import static org.junit.Assert.*;

import java.util.*;
import org.junit.*;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import search.*;
import items.*;

import search.SearchContext;
import search.SearchStrategy;
import search.recommendations;
import search.searchByTitle;

import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class search_Test {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	protected List<Integer> mylist;
	protected List<Integer> list;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	
	// Search test cases
	
	@Test
	public void test_00_01_SearchContext() {
		
		SearchStrategy searchByTitleStrategy = new searchByTitle();

        SearchContext searchContext = new SearchContext(searchByTitleStrategy);
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        
        searchContext.search(LibraryItems, "Book");
        assertEquals("search unsuccessful",searchContext.search(LibraryItems, "Book").size(),1);
	}
	
	@Test
	public void test_00_02_SearchContext() {
		
		SearchStrategy searchByTitleStrategy = new searchByTitle();

        SearchContext searchContext = new SearchContext(searchByTitleStrategy);
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        
        
        assertEquals("search unsuccessful",searchContext.search(LibraryItems, "Help").isEmpty(),true);
	}
	
	@Test
	public void test_00_01_recommendationsStrategy() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book 2");
        
        
        assertEquals("search unsuccessful",recommendationsStrategy.search(LibraryItems, "Book").isEmpty(),false);
	}
	
	@Test
	public void test_00_02_recommendationsStrategy() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book 2");
        LibraryItems.add("Book 2");
        LibraryItems.add("Book 2");
        
        
        assertEquals("search unsuccessful",recommendationsStrategy.search(LibraryItems, "Book").isEmpty(),false);
	}
	
	@Test
	public void test_00_03_recommendationsStrategy() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

       
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book 2");
        LibraryItems.add("Book 2");
        LibraryItems.add("Book 2");
        
        
        assertEquals("search unsuccessful",recommendationsStrategy.search(LibraryItems, "Magazine").isEmpty(),false);
	}
	
	@Test
	public void test_00_04_recommendationsStrategy() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book 2");
        LibraryItems.add("Book 3");
        LibraryItems.add("Book 4");
        
        
        assertEquals("search unsuccessful",recommendationsStrategy.search(LibraryItems, "Helo").isEmpty(),true);
	}
	
	@Test
	public void test_00_05_recommendationsStrategy() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book 2");
        LibraryItems.add("Book 3");
        LibraryItems.add("Book 4");
        
        
        assertEquals("search unsuccessful",recommendationsStrategy.search(LibraryItems, "book 2").isEmpty(),false);
	}
	
	
	@Test
	public void test_00_06_recommendationsStrategy() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book help");
        LibraryItems.add("Book help nice");
        LibraryItems.add("Book 4");
        
        
        assertEquals("search unsuccessful",recommendationsStrategy.search(LibraryItems, "book help nice").isEmpty(),false);
	}
	
	@Test
	public void test_00_07_recommendationsStrategy() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book help");
        LibraryItems.add("Book help nice");
        LibraryItems.add("Book 4");
        
        
        assertEquals("search unsuccessful",recommendationsStrategy.search(LibraryItems, "book help ").isEmpty(),false);
	}
	
	@Test
	public void test_00_08_recommendationsStrategy() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book help");
        LibraryItems.add("Book help nice");
        LibraryItems.add("Book 4");
        
        
        assertEquals("search unsuccessful",recommendationsStrategy.search(LibraryItems, "book me").isEmpty(),false);
	}
	
	@Test
	public void test_00_09_recommendationsStrategy() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book help");
        LibraryItems.add("Book help nice");
        LibraryItems.add("Book 4");
        
        
        assertEquals("search unsuccessful",recommendationsStrategy.search(LibraryItems, "").isEmpty(),true);
	}
	
	@Test
	public void test_00_10_recommendationsStrategy() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        
        
        List<String> LibraryItems = new ArrayList<>();
        
        
        
        assertEquals("search unsuccessful",recommendationsStrategy.search(LibraryItems, "").isEmpty(),true);
	}
	
	
	@Test
	public void test_00_03_SearchContext() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        SearchContext searchContext = new SearchContext(recommendationsStrategy);
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book 2");
        
        
        assertEquals("search unsuccessful",searchContext.search(LibraryItems, "Book").isEmpty(),false);
	}
	
	@Test
	public void test_00_04_SearchContext() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        SearchContext searchContext = new SearchContext(recommendationsStrategy);
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book 2");
        LibraryItems.add("Book 2");
        LibraryItems.add("Book 2");
        
        
        assertEquals("search unsuccessful",searchContext.search(LibraryItems, "Book").isEmpty(),false);
	}
	
	@Test
	public void test_00_05_SearchContext() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        SearchContext searchContext = new SearchContext(recommendationsStrategy);
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book 2");
        LibraryItems.add("Book 2");
        LibraryItems.add("Book 2");
        
        
        assertEquals("search unsuccessful",searchContext.search(LibraryItems, "Magazine").isEmpty(),false);
	}
	
	@Test
	public void test_00_06_SearchContext() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        SearchContext searchContext = new SearchContext(recommendationsStrategy);
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book 2");
        LibraryItems.add("Book 3");
        LibraryItems.add("Book 4");
        
        
        assertEquals("search unsuccessful",searchContext.search(LibraryItems, "Helo").isEmpty(),true);
	}
	
	@Test
	public void test_00_07_SearchContext() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        SearchContext searchContext = new SearchContext(recommendationsStrategy);
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book 2");
        LibraryItems.add("Book 3");
        LibraryItems.add("Book 4");
        
        
        assertEquals("search unsuccessful",searchContext.search(LibraryItems, "book 2").isEmpty(),false);
	}
	
	
	@Test
	public void test_00_08_SearchContext() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        SearchContext searchContext = new SearchContext(recommendationsStrategy);
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book help");
        LibraryItems.add("Book help nice");
        LibraryItems.add("Book 4");
        
        
        assertEquals("search unsuccessful",searchContext.search(LibraryItems, "book help nice").isEmpty(),false);
	}
	
	@Test
	public void test_00_09_SearchContext() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        SearchContext searchContext = new SearchContext(recommendationsStrategy);
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book help");
        LibraryItems.add("Book help nice");
        LibraryItems.add("Book 4");
        
        
        assertEquals("search unsuccessful",searchContext.search(LibraryItems, "book help ").isEmpty(),false);
	}
	
	@Test
	public void test_00_10_SearchContext() {
		
		
		SearchStrategy recommendationsStrategy = new recommendations();

        SearchContext searchContext = new SearchContext(recommendationsStrategy);
        
        List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        LibraryItems.add("Book help");
        LibraryItems.add("Book help nice");
        LibraryItems.add("Book 4");
        
        
        assertEquals("search unsuccessful",searchContext.search(LibraryItems, "book me").isEmpty(),false);
	}
	
	
	
	
	
	
	@Test
	public void test_00_01_SearchByTitle() {
		
		searchByTitle searchByTitleStrategy = new searchByTitle();
           
        
        assertEquals("search unsuccessful",searchByTitleStrategy.words("he").size(),0);
	}
	
	@Test
	public void test_00_02_SearchByTitle() {
		
		searchByTitle searchByTitleStrategy = new searchByTitle();
        
        
        assertEquals("search unsuccessful",searchByTitleStrategy.words("help").size(),1);
	}
	
	@Test
	public void test_00_03_SearchByTitle() {
		
		searchByTitle searchByTitleStrategy = new searchByTitle();
        
        
        
        assertEquals("search unsuccessful",searchByTitleStrategy.words("help wanted").size(),2);
	}
	
	@Test
	public void test_00_04_SearchByTitle() {
		
		searchByTitle searchByTitleStrategy = new searchByTitle();
        
        
        
        assertEquals("search unsuccessful",searchByTitleStrategy.words("he wanted").size(),1);
	}
	
	@Test
	public void test_00_05_SearchByTitle() {
		
		searchByTitle searchByTitleStrategy = new searchByTitle();
        
        
        
        assertEquals("search unsuccessful",searchByTitleStrategy.words("the wanted").size(),1);
	}
	
	@Test
	public void test_00_06_SearchByTitle() {
		
		searchByTitle searchByTitleStrategy = new searchByTitle();
        
        
        
        assertEquals("search unsuccessful",searchByTitleStrategy.words("the wanted the").size(),1);
	}
	
	@Test
	public void test_00_07_SearchByTitle() {
		
		searchByTitle searchByTitleStrategy = new searchByTitle();
		List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        
        
        assertEquals("search unsuccessful",searchByTitleStrategy.search(LibraryItems, "Help").isEmpty(),true);
        
        
       
	}
	
	@Test
	public void test_00_08_SearchByTitle() {
		
		searchByTitle searchByTitleStrategy = new searchByTitle();
		List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        
        
        assertEquals("search unsuccessful",searchByTitleStrategy.search(LibraryItems, "book").isEmpty(),false);
        
        
       
	}
	
	@Test
	public void test_00_09_SearchByTitle() {
		
		searchByTitle searchByTitleStrategy = new searchByTitle();
		List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        
        
        assertEquals("search unsuccessful",searchByTitleStrategy.search(LibraryItems, "BOOK").isEmpty(),false);
        
        
       
	}
	
	@Test
	public void test_00_10_SearchByTitle() {
		
		searchByTitle searchByTitleStrategy = new searchByTitle();
		List<String> LibraryItems = new ArrayList<>();
        
        LibraryItems.add("Book Me");
        LibraryItems.add("Magazine");
        LibraryItems.add("CD");
        
        
        assertEquals("search unsuccessful",searchByTitleStrategy.search(LibraryItems, "BOOK me").isEmpty(),false);
        
        
       
	}
	
}
