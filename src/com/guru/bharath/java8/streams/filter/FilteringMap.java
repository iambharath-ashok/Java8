/**
 * 
 */
package com.guru.bharath.java8.streams.filter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author AB40286
 *
 */
public class FilteringMap {

	public static void main(String[] args) {
		Map<Integer, String> HOSTING = new HashMap<>();
		HOSTING.put(1, "linode.com");
		HOSTING.put(2, "heroku.com");
		HOSTING.put(3, "digitalocean.com");
		HOSTING.put(2, "aws.amazon.com");
		HOSTING.put(2, "acloud.guru");
		
		
		//Map -> Stream -> Filter -> Map
		HOSTING.entrySet().stream().filter(e -> e.getKey() == 2)
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue())).entrySet().forEach(System.out::println);
	
		//Map -> Stream -> Filter -> List
		HOSTING.entrySet().stream().filter(e -> e.getValue().equals("linode.com")).map(Map.Entry::getValue)
				.collect(Collectors.toList()).forEach(System.out::println);
		
		// Map -> Stream -> Filter -> String
		String name =HOSTING.entrySet().stream().filter(e -> e.getKey() == 2).map(e -> e.getValue()).collect(Collectors.joining());
		System.out.println(name);
	}

}
