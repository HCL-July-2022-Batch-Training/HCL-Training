/*July 20, 2022*/

package com.daily.OOPS;

public final class Final	// Can not be inherited.
{
	final int x = 12;	// Constant
	
	final void display()
	{
		System.out.println("Calling display");
	}
}

//class Test extends Final
//{
//	/*final*/ void display()
//	{
//		System.out.println("Calling display");
//	}
//}

class ABC
{
	static final int d;
	
	static
	{
		d = 12;
	}
	
	public static void main(String[] args)
	{
		System.out.println(ABC.d);
	}
}