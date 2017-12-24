/**
 * 
 */
package com.guru.bharath.java8.streams.collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author AB40286
 *
 */
public class StreamToList {

	public static void main(String[] args) {
		Stream<String> language = Stream.of("java", "python", "node");

		List<String> langaugeList = language.collect(Collectors.toList());

		langaugeList.stream().map(String::toUpperCase).forEachOrdered(System.out::println);

		Stream<Integer> number = Stream.of(1, 2, 3, 4, 5, 488, 988, 8844404, 8293);
		number.map(Integer::byteValue).forEach(System.out::println);
	}

}
