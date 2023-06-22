package org.tnsif.service;

import org.tnsif.entities.Employee;

public interface EmployeeService {
	void createEmployee(Employee emp);
	Employee retrieveEmployee(int id);
	void updateEmployee(Employee emp);
	void remmoveEmployee(Employee emp);
}
