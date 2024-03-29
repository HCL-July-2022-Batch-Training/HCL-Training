/*July 22, 2022*/

package com.daily.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples
{
	//Uses doubly linked list to store the elements
	//Duplicate elements; insertion order.
	//Manipulating is faster... Retrieving is slower.
	public static void main(String[] args)
	{
		List<String> linked = new LinkedList<>();
		
		linked.add("Chris");
		linked.add("John");
		linked.add("Saran");
		linked.add("Chris");
		
		Iterator<String> itr = linked.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
