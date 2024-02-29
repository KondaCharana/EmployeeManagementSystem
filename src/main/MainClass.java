package com.wipro.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.wipro.bean.EmployeeBean;

public class MainClass {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter number of employees: ");
		int empCount = sc.nextInt();
		sc.nextLine();
		List<EmployeeBean> empList = new ArrayList<>();
		for (int i = 0; i < empCount; i++) {
			System.out.println("Enter details for employee#" + (i + 1));
			System.out.print("EmployeeID: ");
			int empID = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			float salary = sc.nextFloat();
			System.out.print("Designation: ");
			String designation = sc.nextLine();
			empList.add(new EmployeeBean(empID,name,salary,designation));
			
	}
		//Collection.sort(empList);
		Iterator<EmployeeBean> itr=empList.iterator();
		while(itr.hasNext())
		{
			EmployeeBean emp=itr.next();
			System.out.format("%15s %15s %15s %15s\n",emp.getempID(),emp.getname(),emp.getsalary(),emp.getdesignation());
		}
		sc.close();
	}
}
