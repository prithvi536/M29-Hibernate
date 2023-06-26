package org.tnsif.dao;

import java.util.List;

import org.tnsif.entities.Book;

public interface BookDao {
	Book getBookID(int id); //single entity
	List<Book>getAllBooks(); //all the books
	Long getBookCount(); //count
	List<Book>getAuthorBooks(String author); //particular author
	List<Book>getBookByTitle(String title); //particular title
	List<Book>getBookByPrice(double low, double high); //price rangr
	
	
}
