package com.user.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="user")
public class User {

	@Id
	private int id;

	private String first_Name;
	private String last_Name;
	private String email;
	
	
	
	public User(int id, String first_Name, String last_Name, String email) {
		super();
		this.id = id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLastName() {
		return last_Name;
	}
	public void setLastName(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + first_Name + ", lastName=" + last_Name + ", email=" + email + "]";
	}
	
	
	
}
