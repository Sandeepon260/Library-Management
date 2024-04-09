package test;
import search.*;



import static org.junit.Assert.*;

import java.util.*;
import org.junit.*;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import items.*;
import items.Book;
import items.CD;
import items.LibraryItem;
import items.LibraryItemFactory;
import items.Magazine;


import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class libraryItem_Test {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	protected List<Integer> mylist;
	protected List<Integer> list;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	
	// Items test cases
	
	@Test
	public void test_00_01_Book() {
		
		LibraryItem book = (Book) LibraryItemFactory.createItem("book", "location", "price", true, true, "novel", "me");
		assertEquals("details is not correct",book.getDetails(), "Book: novel by me. Location: location. Purchasable: true");
	}
	
	@Test
	public void test_00_02_Book() {
		
		Book book = (Book) LibraryItemFactory.createItem("book", "location", "price", true, true, "novel", "me");
		assertEquals("Author is not correct",book.getAuthor(), "me");
	}
	
	@Test
	public void test_00_03_Book() {
		
		Book book = (Book) LibraryItemFactory.createItem("book", "location", "price", true, true, "novel", "me");
		assertEquals("Title is not correct",book.getTitle(), "novel");
	}
	
	@Test
	public void test_00_01_LibraryItemFactory() {
		try {
			LibraryItem item =  LibraryItemFactory.createItem("boo", "location", "price", true, true, "novel", "me");
		} catch(IllegalArgumentException e) {
			assertEquals("Invalid item type", e.getMessage());
		}
		
		
	}
	
	@Test
	public void test_00_01_Magazine() {
		
		LibraryItem magazine = LibraryItemFactory.createItem("magazine", "location", "price", true, true, "magazine", "me");
		assertEquals("details is not correct",magazine.getDetails(), "Magazine: magazine. Location: location. Purchasable: true");
	}
	
	@Test
	public void test_00_02_Magazine() {
		
		Magazine magazine = (Magazine) LibraryItemFactory.createItem("magazine", "location", "price", true, true, "magazine", "me");
		assertEquals("Author is not correct",magazine.getPublisher(), "me");
	}
	
	@Test
	public void test_00_03_Magazine() {
		
		Magazine magazine = (Magazine) LibraryItemFactory.createItem("magazine", "location", "price", true, true, "magazine", "me");
		assertEquals("Title is not correct",magazine.getTitle(), "magazine");
	}
	
	@Test
	public void test_00_01_CD() {
		
		LibraryItem cd = LibraryItemFactory.createItem("cd", "location", "price", true, true, "hello", "me");
		assertEquals("details is not correct",cd.getDetails(), "CD: hello by me. Location: location. Purchasable: true");
	}
	
	@Test
	public void test_00_02_CD() {
		
		CD cd = (CD) LibraryItemFactory.createItem("cd", "location", "price", true, true, "hello", "me");
		assertEquals("Author is not correct",cd.getArtist(), "me");
	}
	
	@Test
	public void test_00_03_CD() {
		
		CD cd = (CD) LibraryItemFactory.createItem("cd", "location", "price", true, true, "hello", "me");
		assertEquals("Title is not correct",cd.getTitle(), "hello");
	}
	
}
