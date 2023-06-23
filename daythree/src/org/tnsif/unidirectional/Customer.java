package org.tnsif.unidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int custId;
	
	private String customerName;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;

	//default constructor
	public Customer() {
		System.out.println("Unidirectonal one to one relationship");
	}

	//parameterized consttructor
	public Customer(int custId, String customerName, Address address) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.address = address;
	}
	
	//getters & setters
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	//tostring
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + ", address=" + address + "]";
	}
}
