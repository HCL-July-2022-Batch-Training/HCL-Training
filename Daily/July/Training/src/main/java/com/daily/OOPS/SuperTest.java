/*July 20, 2022*/

package com.daily.OOPS;

class Insurance
{	
	Insurance()
	{
		System.out.println("Calling Insurance zero arg constructor");
	}
	
	String insName = "Progressive";
	
	void insDetails()
	{
		System.out.println("Insurance Details");
	}
}

public class SuperTest extends Insurance
{
	String insName = "Aetna";
	
	SuperTest()
	{
		System.out.println("Calling Insurance zero arg constructor");
	}
	
	void insDetails()
	{
		System.out.println("Super test Insurance Details");
	}
	
	void print()
	{
		System.out.println(insName);
		System.out.println(super.insName);
	}
	
	void call()
	{
		super.insDetails();
	}
	
	public static void main(String[] args)
	{
		Insurance s = new SuperTest();
	//	s.print();
		s.insDetails();
		
		SuperTest s1 = new SuperTest();
		s1.call();
	}
}
