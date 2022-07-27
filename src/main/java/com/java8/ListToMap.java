package com.java8;

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
class Product {
	private int prdId;
	private String pdName;
	private int prdPrice;
}

public class ListToMap {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "laptop1", 1200));
		list.add(new Product(1, "laptop2", 1300));
		list.add(new Product(1, "laptop3", 1400));
		list.add(new Product(1, "laptop4", 1500));
		
		//Set<Integer> price = list.stream().filter(product->product.getPrdPrice()>1300).map(product->product.getPrdPrice()).collect(Collectors.toSet());
		//System.out.println(price)
	}
}
