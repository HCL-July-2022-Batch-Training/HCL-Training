/*July 25 2022*/

package com.daily.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Comparable Interface -> compareTo(Object)
 * You can sort elements on the basis of single data member only.
 * compareTo -> Positive integers, if the current object > specified object.
 * 			 -> Negative integers, if the current object < specified object.
 *			 -> Zero, current is equal to the specified object.
 *
 *			 Try '<' and '>' on the prdPrice to reverse order.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Comparable<Product>
{
	int prdId;
	String prdName;
	int prdPrice;
	
	public int compareTo(Product p)
	{
		if(prdPrice == p.prdPrice)
		{
			return 0;
		}
		else if(prdPrice < p.prdPrice)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class ComparableTest
{
	public static void main(String[] args)
	{
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(113, "Laptop", 1000));
		list.add(new Product(111, "Desktop", 2000));
		list.add(new Product(112, "Mouse", 50));
		
		Collections.sort(list);
		
		list.forEach(System.out::println);
	}
}