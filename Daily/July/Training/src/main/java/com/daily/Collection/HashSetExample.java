/*July 22, 2022*/

package com.daily.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample
{
	/*
	 * HashSet stores the elements using hashing technique.
	 * Doesn't maintain the insertion order.
	 * Allows null values.
	 * Not thread safe (non-synchronized).
	 * Default capacity for HashSet is 16.
	 */

	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		
		set.add("Test1");
		set.add(new String("Test2"));
		set.add("Test3");
//		set.add(null);	//Throws null pointer exception.
		set.add(new String("Test2"));
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		set.removeIf(str -> str.contains("Test2"));
		System.out.println(set);
	}

}
