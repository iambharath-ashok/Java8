/**
 * 
 */
package com.guru.bharath.java8.streams.collectors;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author AB40286
 *
 */
public class CollectorsSorting {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

		Map<String, Long> resultMap = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		resultMap.entrySet().stream().forEach(System.out::println);

		Map<String, Long> finalMap = new LinkedHashMap<>();

		resultMap.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

		finalMap.entrySet().forEach(System.out::println);
	}

}
