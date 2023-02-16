package com.shiva.pojo;

public class Programe1 
{
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setId(101);
		e.name = "shiva";
		e.salary = 3453.00;
		
		Employee e1 = new Employee();
		e1.setId(102);
		e1.name = "booby";
		e1.salary = 3453.00;
		
		Employee e2 = new Employee();
		e2.setId(103);
		e2.name = "shi";
		e2.salary = 3453.00;
		
		Employee [] employees = new Employee[] {e, e1, e2,};
		
	}
}
