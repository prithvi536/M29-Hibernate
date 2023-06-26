package org.tnsif.joinedtableinheritance;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

//parent class
@Entity
@Table(name="Vehicle")
@Inheritance(strategy=InheritanceType.JOINED)
public class Vehicle {
	@Id
	private int vehicleNo;
	private int speed;
	private String type;
	private float price;
	
	//getters & setters
	public int getvehicleNo() {
		return vehicleNo;
	}
	public void setvehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
