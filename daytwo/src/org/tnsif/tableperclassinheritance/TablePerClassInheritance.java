package org.tnsif.tableperclassinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.tnsif.singletableinheritance.Employee;
import org.tnsif.singletableinheritance.Manager;

public class TablePerClassInheritance {

	public static void main(String[] args) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			
			Citizen c = new Citizen();
			c.setAdhaarNo(564743903978L);
			c.setArea("Pimpri");
			c.setCity("Pune");
			em.persist(c);
			
			Citizen c1 = new Citizen();
			c1.setAdhaarNo(674743903978L);
			c1.setArea("Mumbra");
			c1.setCity("Mumbai");
			em.persist(c1);
			
			Person p = new Person();
			p.setAdhaarNo(674743904378L);
			p.setArea("Gangapur");
			p.setCity("Nashik");
			p.setContactNo(9893998989L);
			p.setName("Prithvi");
			em.persist(p);
			
			
			
			em.getTransaction().commit();
			System.out.println("Added Sucessfully");
			em.close();
			factory.close();
			
			
		}

	}


