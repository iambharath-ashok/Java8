/**
 * 
 */
package com.guru.bharath.java8.streams.exception;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author AB40286
 *
 */
public class StreamAlreadyClosed {

	public static void main(String[] args) {

		String[] names = new String[] { "guru", "bharath", "sharath" };
		Stream<String> stream = Arrays.stream(names);
		
		
		stream.forEach(System.out::println); // using for first time

		//stream.collect(Collectors.toList())// Will Throw IllegalStateException That Stream Already Closed.
		//		.forEach(System.out::println); // As using for Second Time
		
		
		Supplier<Stream<String>> supplierStream = () -> Arrays.stream(names); // Way to get the Supplier instance
		//Supplier<Stream<String>> supplierStream = () -> Stream.of(names);
		supplierStream.get().map(String::toUpperCase).filter(name -> name!="bharath").forEach(System.out::println);
		supplierStream.get().findFirst().ifPresent(System.out::println);
	}

}
