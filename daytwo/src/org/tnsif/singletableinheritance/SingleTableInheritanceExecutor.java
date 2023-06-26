package org.tnsif.singletableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceExecutor {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee emp =new Employee();
		emp.setEmpName("Prithviraj Patil");
		emp.setSalary(30000.90f);
		em.persist(emp);
		
		Employee emp1 =new Employee();
		emp1.setEmpName("Mau Patil");
		emp1.setSalary(25000.90f);
		em.persist(emp1);
		
		Manager m= new Manager();
		m.setEmpName("Sai Patil");
		m.setSalary(50000.90f);
		m.setDeptName("HR");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("Added Sucessfully");
		em.close();
		factory.close();
		
		
	}

}
