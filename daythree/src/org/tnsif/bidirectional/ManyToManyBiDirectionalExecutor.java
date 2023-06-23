package org.tnsif.bidirectional;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToManyBiDirectionalExecutor {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Product p =new Product();
		p.setProductId(123);
		p.setProductName("Watch");
		p.setPrice(2999.00f);
		
		Product p1 =new Product();
		p1.setProductId(124);
		p1.setProductName("Charger");
		p1.setPrice(299.00f);
		
		Order o =new Order();
		o.setOrderId(99);
		o.setPurchaseDate(new Date());
		
		Order o1 =new Order();
		o1.setOrderId(100);
		o1.setPurchaseDate(new Date());
		
		o.addOrder(p1);
		o1.addOrder(p);
		
		em.persist(o);
		em.persist(o1);
		
		
		em.getTransaction().commit();
		System.out.println("Added Sucessfully");
		em.close();
		factory.close();
	}

}
