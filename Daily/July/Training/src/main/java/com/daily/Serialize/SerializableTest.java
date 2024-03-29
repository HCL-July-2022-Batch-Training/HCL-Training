/*July 21, 2022*/

package com.daily.Serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")	//Added this line in to get rid of notification.
class Student implements Serializable
{
	String stuName;
	String stuAddress;
	transient int stuSSN;	//Not serialized.
	
	public void display()
	{
		System.out.println(stuName + " " + stuAddress + " " + stuSSN);
	}
}

public class SerializableTest
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.stuName = "Chris";
		s1.stuAddress = "Hutto";
		s1.stuSSN = 123456789;
		
		try
		{
			FileOutputStream fos = new FileOutputStream("Student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s1);
			
			fos.close();	//Prevent leaks.
			oos.close();	//Prevent leaks.
			
			System.out.println("Student objects serialized data is saved in 'Student.ser'");
			
		}catch(Exception e) {e.printStackTrace();}
	}
}