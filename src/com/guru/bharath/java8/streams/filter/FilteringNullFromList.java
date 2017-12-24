/**
 * 
 */
package com.guru.bharath.java8.streams.filter;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author AB40286
 *
 */
public class FilteringNullFromList {
	
	
	public static void main(String[] args) {
		
		Stream<String> langaugeStream = Stream.of("java", "python", "node", null, "ruby", null, "php");
		
		langaugeStream.collect(Collectors.toList()).forEach(System.out::println);
		
		langaugeStream.filter(lang -> lang!=null).collect(Collectors.toList()).forEach(System.out::println);
		
		// Objects::nonNull
		
		Stream<String> langaugeStream1 = Stream.of("java", "python", "node", null, "ruby", null, "php");
		
		langaugeStream1.filter(Objects::nonNull).collect(Collectors.toList()).forEach(System.out::println);;
	}

}
