package com.cg.eis.bean;
public class Employee {
	int id;
	String name;
	double salary;
	Designations designation;
	InsuranceSchemes insuranceSchemes=null;
	public Employee(int id, String name,double salary, Designations designation,
			InsuranceSchemes insuranceSchemes) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceSchemes = insuranceSchemes;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", designation=" + designation + ", insuranceSchemes="
				+ insuranceSchemes + "]";
	}
}
