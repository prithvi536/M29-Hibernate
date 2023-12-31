package org.tnsif.bidirectional;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Order_master")
public class Order {

	@Id
	private int orderId;
	@Temporal(TemporalType.DATE)
	private Date purchaseDate;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Product>products=new HashSet<>();
	
	public void addOrder(Product products) {
		this.getProducts().add(products);
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
}
