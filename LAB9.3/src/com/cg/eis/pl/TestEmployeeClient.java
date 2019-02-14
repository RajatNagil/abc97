
package com.cg.eis.pl;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.cg.eis.bean.*;
import com.cg.eis.service.EmployeeInsuranceSystemService;

public class TestEmployeeClient {

	public static void main(String[] args) throws IOException {
			int choice;
			String name;
			double salary;
			Designations designation = null;
			InsuranceSchemes ischeme=null;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number of Employees: ");
			int n = sc.nextInt();
			EmployeeInsuranceSystemService emp = new EmployeeInsuranceSystemService(n);
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Employee Name: ");
				name = sc.next();
				System.out.println("Enter the Salary: ");
				salary = sc.nextDouble();
				System.out.println("Enter the Designation:");
				System.out.println("..........Choice............");
				System.out.println("1.Clerk\n2.SystemAssociate\n3.Programmer\n4.Manager\n");
				System.out.println("Enter your choice");
				choice =sc.nextInt();
				switch(choice)
				{
				case 1: designation = Designations.Clerk;break;
				case 2:	designation = Designations.SystemAssociate;break;
				case 3: designation = Designations.Programmer;break;
				case 4: designation = Designations.Manager;break;
				default: System.out.println("Invalid Choice.");break;
				
				}
				ischeme = emp.showInsuranceSchemes(i, salary, designation);
				emp.addEmployeeDetails(i, name, salary, designation, ischeme);	

			}
			System.out.println("Employee Details are: ");
			for(int i=0;i<n;i++)
			{
				System.out.println(emp.dispEmployeeDetails(i));
			}
			sc.close();
	}		

}
