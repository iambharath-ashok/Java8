/**
 * 
 */
package com.guru.bharath.java8.streams.sorting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * @author AB40286
 *
 */
public class MapSortByKeys {

	public static void main(String[] args) {

		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		System.err.println("Ascending Order in List");
		List<Entry<String, Integer>> sortedList = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toList());
		// .forEach(System.out::println)
		System.out.println(sortedList);

		System.err.println("Ascending Order in Map");
		// Sort by keys in Ascending order
		LinkedHashMap<String, Integer> linkedHashMap = unsortMap.entrySet().stream()// convert map to stream
				.sorted(Map.Entry.comparingByKey()) // sort by keys
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new)); // collect it with LinkedHashMap, by default HashMap will be used.
												// LinkedHashMap will used to maintain the Order.
		System.out.println(linkedHashMap);

		System.err.println("Reverse Order Map");
		// Sort by keys in Descending Order
		unsortMap.entrySet().parallelStream()// Convert to Stream
				.sorted(Map.Entry.<String, Integer>comparingByKey().reversed()) // Sort in reverse order
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> n, LinkedHashMap::new))
				.entrySet().forEach(System.out::println); // Collect to LinkedHashMap
		System.err.println("Ascending Order in Alternative Way..");

		// Alternative Way, by putting into map
		LinkedHashMap<String, Integer> linkedHashMapAlt = new LinkedHashMap<>();
		unsortMap.entrySet().stream() // Convert to Stream
				.sorted(Map.Entry.comparingByKey()) // sort map by keys
				.forEachOrdered(e -> linkedHashMapAlt.put(e.getKey(), e.getValue())); // Store it with new LinkedHashMap. LinkedHashMap preserves the order.
		System.out.println(linkedHashMapAlt);
	}

}
