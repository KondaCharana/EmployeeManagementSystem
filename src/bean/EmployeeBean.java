package com.wipro.bean;

public class EmployeeBean{
	private int empID;
	private String name;
	private float salary;
	private String designation;
	public EmployeeBean(int empID,String name,float salary,String designation)
	{
		super();
		this.empID=empID;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
	}
	public int getempID()
	{
		return empID;
		
	}
	public String getname()
	{
		return name;
		
	}
	public float getsalary()
	{
		return salary;
		
	}
	public String getdesignation()
	{
		return designation;
		
	}
	public int compareTo(EmployeeBean emp) {
		return this.name.compareTo(emp.getname()) * -1;
	}
	public String toString()
	{
		return "EmployeeBean[empID="+empID+"]";
	}
	
	
}
