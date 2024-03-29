/*July 21, 2022*/

package com.daily.Serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialize
{
	public static void main(String[] args)
	{
		Student s = null;
		
		try
		{
			FileInputStream fis = new FileInputStream("Student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			s = (Student)ois.readObject();	//ois.readObject returns Object, but we only want student object.
			
			fis.close();	//Prevent leaks.
			ois.close();	//Prevent leaks.
			
			System.out.println(s.stuName);
			System.out.println(s.stuAddress);
			System.out.println(s.stuSSN);
			
		}catch(Exception e) {e.printStackTrace();}
	}
}