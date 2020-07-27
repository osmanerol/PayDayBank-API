package com.productManagement.paydaybank.Entities;

import javax.persistence.*;

@Entity
@Table(name="managers")
public class Manager {
	@Id
	@Column(name="username")
	private String username;
	@Column(name="fullname")
	private String fullname;
	@Column(name="title")
	private String title;
	@Column(name="password")
	private String password;
	
	public Manager() { }
	
	public Manager(String username, String fullname, String title, String password) {
		super();
		this.username = username;
		this.fullname = fullname;
		this.title = title;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
