package com.cg.practiceDay2.exercise7;

public class Employee 
{
	private int empID, deptNo;
	private double salary;
	private String name, mngrName;
	
	public int getEmpID() 
	{
		return empID;
	}
	public void setEmpID(int empID) 
	{
		this.empID = empID;
	}
	public int getDeptNo() 
	{
		return deptNo;
	}
	public void setDeptNo(int deptNo) 
	{
		this.deptNo = deptNo;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getMngrName() 
	{
		return mngrName;
	}
	public void setMngrName(String mngrName) 
	{
		this.mngrName = mngrName;
	}
	@Override
	public String toString() 
	{
		return "Employee [empID=" + empID + ", deptNo=" + deptNo + ", salary=" + salary + ", name=" + name
				+ ", mngrName=" + mngrName + "]";
	}
	
	
}
