package com.user.entity;

public class User {
    
	private int id;
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String name;
    private String email;
    
    
    
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
    
}