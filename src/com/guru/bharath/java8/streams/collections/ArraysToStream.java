/**
 * 
 */
package com.guru.bharath.java8.streams.collections;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author AB40286
 *
 */
public class ArraysToStream {
	
	public static void main(String[] args) {
		
		IntStream namesStream = Arrays.stream(new int[] {1,2,3,4,5});
		
		namesStream.forEach(System.out::println);
		
		
		
		Stream<char[]> charStream = Stream.of(new char[] {'a','f','h'});
		
		System.out.println(charStream.map(char[]::toString).collect(Collectors.joining()).toString());
		
	}

}
