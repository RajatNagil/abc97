package com.cg.eis.service;

import com.cg.eis.bean.Designations;
import com.cg.eis.bean.Employee;
import com.cg.eis.bean.InsuranceSchemes;

public class EmployeeInsuranceSystemService implements EmployeeService {
	private Employee empList[];

	public EmployeeInsuranceSystemService(int noOfEmp) {
		this.empList = new Employee[noOfEmp];
	}
	@Override
	public void addEmployeeDetails(int id, String name, double salary,
			Designations designation, InsuranceSchemes insuranceScheme) {
	
		if (id >= 0 && id < this.empList.length) {
			this.empList[id] = new Employee(id, name, salary, designation,
					insuranceScheme);
		}
	}
	@Override
	public InsuranceSchemes showInsuranceSchemes(int id, double salary,
			Designations designation) 
	{
		if (id >= 0 && id < this.empList.length) 
		{
			if (salary >= 40000 && designation == Designations.Manager) 
			{
				return InsuranceSchemes.SchemeA;
			} 
			else if (salary >= 20000 && salary < 40000
					&& designation == Designations.Programmer) 
			{
				return InsuranceSchemes.SchemeB;
			} 
			else if (salary >= 5000 && salary < 20000
					&& designation == Designations.SystemAssociate)
			{
				return InsuranceSchemes.SchemeC;
			} 
			else if (salary < 5000 && designation == Designations.Clerk) 
			{
				return InsuranceSchemes.NoSchemes;
			}
		}
		return null;
	}
	@Override
	public String dispEmployeeDetails(int id) {
		if (id >= 0 && id < this.empList.length)
			return empList[id].toString();
		return null;
	}
}
