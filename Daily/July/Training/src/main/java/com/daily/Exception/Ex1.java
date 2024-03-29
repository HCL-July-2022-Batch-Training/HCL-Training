/*July 21, 2022*/

package com.daily.Exception;

public class Ex1
{
	public static void main(String[] args)
	{
		int x = 45;
		int y = 0;
		
		try
		{
//			int x1 = Integer.parseInt("Welcome");
			getInt();
			@SuppressWarnings("unused")	//Added this line in to get rid of notification.
			int z = x/y;
		} catch(ArithmeticException | NumberFormatException e) {e.printStackTrace();}
		
		finally
		{
			System.out.println("Closing up memory resources. 'Finally' block will be executed"
					+ " whether exception is thrown or not.");
		}
		
		System.out.print("Continue working");
	}
	
	private static void getInt()
	{
		@SuppressWarnings("unused")	//Added this line in to get rid of notification.
		int u = Integer.parseInt("xyz");
	}
}