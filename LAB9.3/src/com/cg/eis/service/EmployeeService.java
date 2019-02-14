package com.cg.eis.service;

import com.cg.eis.bean.*;

public interface EmployeeService 
{
	public abstract void addEmployeeDetails(int id,String name,double salary,Designations  designation, InsuranceSchemes insuranceScheme);
	
	public abstract InsuranceSchemes showInsuranceSchemes(int id, double salary,Designations  designation);
	
	public abstract String dispEmployeeDetails(int id);
	
}
