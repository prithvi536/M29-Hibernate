package org.tnsif.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.tnsif.entities.Book;

public class BookDaoImpl implements BookDao {

	//obj creation to access all crud ops
	private EntityManager em;
	
	//constructor
	public BookDaoImpl() {
		em= JPAUtil.getEntityManager();
	}
	
	@Override
	public Book getBookID(int id) {
		Book book =em.find(Book.class, id);
		return book;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBooks() {
		Query query =em.createNamedQuery("get all books");
		List<Book>b1= query.getResultList();
		return b1;
	}

	@Override
	public Long getBookCount() {
		String query= "SELECT COUNT(book.id) FROM Book book";
		TypedQuery<Long>t1= em.createQuery(query,Long.class);
		Long count =t1.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		String query= "SELECT book FROM Book book WHERE book.author= :pAuthor";
		TypedQuery<Book>t1= em.createQuery(query,Book.class);
		t1.setParameter("pAuthor", author);
		List<Book>b1= t1.getResultList();
		return b1;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		String query= "SELECT book FROM Book book WHERE book.title = :pTitle";
		TypedQuery<Book>t1= em.createQuery(query,Book.class);
		t1.setParameter("pTitle",title);
		List<Book>b1= t1.getResultList();
		return b1;
	}

	@Override
	public List<Book> getBookByPrice(double low, double high) {
		String query= "SELECT book FROM Book book WHERE book.price between :low and :high";
		TypedQuery<Book>t1= em.createQuery(query,Book.class);
		t1.setParameter("low",low);
		t1.setParameter("high", high);
		List<Book>b1= t1.getResultList();
		return b1;
	}

}
