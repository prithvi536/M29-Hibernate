//driver class
package org.tnsif.joinedtableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JoinedTableInheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Vehicle 1
		Vehicle v=new Vehicle();
		v.setPrice(90000.0f);
		v.setSpeed(50);
		v.setType("Sedan");
		v.setvehicleNo(9880);
		
		//Vehicle 2
		Vehicle v1=new Vehicle();
		v1.setPrice(80000.0f);
		v1.setSpeed(55);
		v1.setType("Sports");
		v1.setvehicleNo(9881);
		
		//Car 1
		Car c =new Car();
		c.setBrandName("Toyota");
		c.setPrice(5200000.99f);
		c.setSpeed(90);
		c.setType("Convertible");
		c.setvehicleNo(0001);
		em.persist(v1);

		
		em.getTransaction().commit();
		System.out.println("Added Sucessfully");
		em.close();
		factory.close();
		
		
	}
	

}
