package com.productManagement.paydaybank.Entities;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private int price;
	@Column(name="available")
	private int available;
	@Column(name="description")
	private String description;
	
	public Products() { }
	
	public Products(int id, String name, int price, int available, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.available = available;
		this.description = description;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getAvailable() {
		return available;
	}
	
	public void setAvailable(int available) {
		this.available = available;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}