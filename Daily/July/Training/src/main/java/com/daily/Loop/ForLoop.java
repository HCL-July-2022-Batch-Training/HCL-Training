/*July 20, 2022*/

package com.daily.Loop;

public class ForLoop
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Welcome " + 1);
		}
		
		int x = 1;
		do
		{
			System.out.println(x);
			x++;
		}while(x <= 10);
	}
}

// In a real time scenario sometime i may have to skip
// some of the numbers in the "for" loop.
// i == 1 I am confident it doesn't throw any exception
// until i == 7.