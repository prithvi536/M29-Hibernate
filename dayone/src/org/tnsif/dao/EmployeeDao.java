package org.tnsif.dao;

import org.tnsif.entities.Employee;

public interface EmployeeDao {

	//user-defined method for crud
	
	void addEmployee(Employee emp);
	Employee getEmployee(int id);
	void updateEmployee(Employee emp);
	void deleteEmployee(Employee emp);
	
	
	//JPA transaction
	void beginTransaction(); //begin
	void commitTransaction(); //close
	
}
