/**
 * 
 */
package com.guru.bharath.java8.streams.collectors;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.guru.bharath.beans.Item;

/**
 * @author AB40286
 *
 */
public class CollectorsGroupByUserDefinedObjects {

	public static void main(String[] args) {

		List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));

		Map<String, Long> counting = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.counting()));

		System.out.println(counting);

		//Summarizing Int
		items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.summarizingInt(Item::getQty))) 
				.entrySet()
				.forEach(System.out::println);
	}
}
