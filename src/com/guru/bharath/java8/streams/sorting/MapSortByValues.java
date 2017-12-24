/**
 * 
 */
package com.guru.bharath.java8.streams.sorting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author AB40286
 *
 */
public class MapSortByValues {

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

		// Sorting by value in Acsending Order
		Map<String, Integer> sortedMapByValue = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> n, LinkedHashMap::new));
		System.out.println(sortedMapByValue);

		// Sorting by value in Descending Order
		Map<String, Integer> reverseSortedMap = unsortMap.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> o, LinkedHashMap::new));

		System.out.println(reverseSortedMap);

		// Alternate way
		LinkedHashMap<String, Integer> linkedHashMapAlt = new LinkedHashMap<>();
		unsortMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEachOrdered(e -> linkedHashMapAlt.put(e.getKey(), e.getValue()));

		System.out.println(linkedHashMapAlt);

	}

}
