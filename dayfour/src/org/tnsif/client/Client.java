package org.tnsif.client;

import org.tnsif.service.BookService;
import org.tnsif.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service = new BookServiceImpl();
		System.out.println("Book with specific ID:");
		System.out.println(service.getBookID(104));
		
		System.out.println("Book with specific Author:");
		System.out.println(service.getAuthorBooks("Prithvi Patil"));
		
		System.out.println("Book with specific Title:");
		System.out.println(service.getBookByTitle("AI"));
		
		System.out.println("Book Count: ");
		System.out.println(service.getBookCount());
		
		System.out.println("Book with specific price range:");
		System.out.println(service.getBookByPrice(1000, 2000));


	}

}
