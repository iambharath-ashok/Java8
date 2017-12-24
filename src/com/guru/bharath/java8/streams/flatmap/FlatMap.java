/**
 * 
 */
package com.guru.bharath.java8.streams.flatmap;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author AB40286
 *
 */
public class FlatMap {
	
	public static void main(String[] args) {
		
		String[][] strings = new String[][] {{"a","b"},{"c","d"},{"e","d"}};
		
		//Stream can hold the different kinds of element
		// But stream operations filter,collect,sum distinct do not support them. 
		Stream<String[]> stringStreamArray = Arrays.stream(strings);
		Stream<String[]> stringStream = stringStreamArray.filter( e -> "a".equals(e));
		stringStream.forEach(System.out::println);
		
		
		//Above Problem can be solved by using flatMap
		/*
			Stream<String[]> -> flatMap -> Stream<String>
			Stream<Set<String>> -> flatMap -> Stream<String>
			Stream<List<String>> -> flatMap -> Stream<String>
			Stream<List<Object>> -> flatMap -> Stream<Object>
			
			{ {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}

			{ {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}
 		 */
		Stream.of(strings).flatMap(e -> Stream.of(e)).forEach(System.out::println);
		
	}

}
