package com.wipro.service;

import java.util.ArrayList;
import java.util.List;

import com.wipro.bean.EmployeeBean;

public class EmployeeService {
	private List<EmployeeBean> listEmp=new ArrayList<>();
	public boolean insertEmployee(EmployeeBean bean)
	{
		return false;
		
	}
	public String insertEmployeeByPosition(EmployeeBean bean,int position)
	{
		return null;
		
	}
	public List<EmployeeBean> fetchAllEmployee()
	{
		return listEmp;
		
	}
	public boolean updateEmployeeByEmpID(int empID)
	{
		return false;
		
	}
	public boolean updateEmployeeByEmpID(EmployeeBean bean)
	{
		return false;
		
	}
	public boolean EmployeeByEmpID(int empID)
	{
		return false;
		
	}
}
