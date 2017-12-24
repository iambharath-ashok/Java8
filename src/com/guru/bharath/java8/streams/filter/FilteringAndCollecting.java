/**
 * 
 */
package com.guru.bharath.java8.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.guru.bharath.beans.DeveloperBean;
import com.guru.bharath.utils.Java8Utils;

/**
 * @author AB40286
 *
 */
public class FilteringAndCollecting {

	public static void main(String[] args) {

		List<DeveloperBean> developersList = Java8Utils.getDeveloperBeans();

		Set<DeveloperBean> newDevelopersSet = developersList.stream().// Convert List to Stream
				filter(dev -> dev.getAge() > 50) // perform filtering
				.collect(Collectors.toSet()); // convert Streams to Set

		newDevelopersSet.forEach(System.out::println);
		
		
		List<String> namesList = Arrays.asList(new String[] {"spring", "node", "mkyong"});
		
		System.out.println("Before Sorting");
		namesList.forEach(System.out::println);//Passing the Method defnition
		System.out.println("After Sorting");
		namesList.stream().filter(names -> names!="mkyong").collect(Collectors.toSet()).forEach(System.out::println);
		
	}

}
