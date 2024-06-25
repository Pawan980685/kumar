package com.nt;

public class Employee {
	
	private String name;
	private Double salary;
	private String Dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public Employee(String name, Double salary, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		Dept = dept;
	}
	

}
