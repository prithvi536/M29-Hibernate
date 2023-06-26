package org.tnsif.tableperclassinheritance;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

//parent class
@Entity
@Table(name="Citizen")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Citizen {
	@Id
	private long adhaarNo;
	private String city;
	private String area;
	
	//getters & setters
	public long getAdhaarNo() {
		return adhaarNo;
	}
	public void setAdhaarNo(long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	

}
