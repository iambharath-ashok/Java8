/**
 * 
 */
package com.guru.bharath.java8.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.guru.bharath.beans.Staff;
import com.guru.bharath.utils.Java8Utils;

/**
 * @author AB40286
 *
 */
public class StringUpperCaseUsingStreamMap {

	public static void main(String[] args) {

		List<Staff> staffsList = Java8Utils.getStaffs();

		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

		alpha.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
		
		num.stream().map(number -> number.floatValue() * 50).collect(Collectors.toList()).forEach(System.out::println);

	}

}
