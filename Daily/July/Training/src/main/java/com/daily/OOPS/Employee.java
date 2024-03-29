/*July 20, 2022*/

package com.daily.OOPS;

public class Employee
{
	int empID;
	String empName;
	
	void insertEmp(int empID, String empName)
	{
		this.empID = empID;
		this.empName = empName;
	}
	
	void print()
	{
		System.out.println(empID + " " + empName);
	}
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.empID = 100;
		e1.empName = "Chris";
		e2.empID = 101;
		e2.empName = "Marlon";
		
		System.out.println(e1.empID + " " + e1.empName);
		System.out.println(e2.empID + " " + e2.empName);
		
		e1.insertEmp(102, "Huy");
		e2.insertEmp(103, "Tyler");
		e1.print();
		e2.print();
	}
}