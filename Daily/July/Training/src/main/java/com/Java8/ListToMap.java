/*July 26, 2022*/

package com.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product
{
	private int prdID;
	private String prdName;
	private int prdPrice;
}

public class ListToMap
{	
	public static void main(String[] args)
	{
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1, "Laptop1", 1200));	//2400
		list.add(new Product(2, "Laptop2", 1300));	//2600
		list.add(new Product(3, "Laptop3", 1400));	//2800
		list.add(new Product(4, "Laptop4", 1500));	//3000
		
		//Java8 convert list to map.
		Map<String, Integer> price = list.stream().collect(Collectors.toMap(p -> p.getPrdName(), p -> p.getPrdPrice()));
		System.out.println(price);
		
		//Java8 convert list to set (wanted to print > than 1300 price).
		Set<Integer> price2 = list.stream()
								.filter(product -> product.getPrdPrice() > 1300)	//Intermediate function.
								.map(product -> product.getPrdPrice())	//Intermediate function.
								.collect(Collectors.toSet());	//Terminal function.
		System.out.println(price2);
		
		list.stream().filter(product -> product.getPrdPrice() > 1300).forEach(System.out::println);
		
		int price3 = list.stream()
						.collect(Collectors.summingInt(product -> product.getPrdPrice()));
		System.out.println(price3);
		
		/*
		 * The Assignment is how to double each product and print it?
		 */
		List<Product> doubledList = list.stream()
										.map(p -> new Product(p.getPrdID(), p.getPrdName(), p.getPrdPrice() * 2))
										.collect(Collectors.toList());
        System.out.println(doubledList);
	}
}