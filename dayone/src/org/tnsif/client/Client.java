package org.tnsif.client;

import org.tnsif.entities.Employee;
import org.tnsif.service.EmployeeService;
import org.tnsif.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeServiceImpl();
		Employee emp =new Employee();
		
		//create
	    /*emp.setId(102);
		emp.setName("Prithvi");
		service.createEmployee(emp);
		System.out.println("Data added sucessfully");
		*/
		
		//update
		/*emp= service.retrieveEmployee(101);
		emp.setName("Prithvi Patil");
		service.updateEmployee(emp);
		System.out.println("Data updated sucessfully");
*/
		
		//delete
		/*emp= service.retrieveEmployee(102);
		service.remmoveEmployee(emp);
		System.out.println("Data deleted sucessfully");
		*/
		
		//retreive
		emp= service.retrieveEmployee(101);
		System.out.println("Emp Id: "+emp.getId());
		System.out.println("Emp Name: "+emp.getName());

	}

}
