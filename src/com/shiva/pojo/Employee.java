package com.shiva.pojo;

public class Employee {
	private int id;
	public String name;
	protected double salary;
	
	public Employee() {
		System.out.println("no arg constructor is called");
	}
	
	public Employee(int id) {
		this.id =id;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public int getID() {
		return id;
	}
	
	
}
