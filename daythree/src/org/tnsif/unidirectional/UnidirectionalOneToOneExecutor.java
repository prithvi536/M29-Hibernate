package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UnidirectionalOneToOneExecutor {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Customer c =new Customer();
		c.setCustomerName("Prithviraj Patil");
		
		Address a =new Address();
		a.setPin(401501);
		a.setCity("Pune");
		a.setState("Maharashtra");
		
		c.setAddress(a);
		em.persist(c);
		
		em.getTransaction().commit();
		System.out.println("Added Sucessfully");
		em.close();
		factory.close();
		
		
	}


}
