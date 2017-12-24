/**
 * 
 */
package com.guru.bharath.java8.streams.conversions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.guru.bharath.beans.Hosting;
import com.guru.bharath.utils.Java8Utils;

/**
 * @author AB40286
 *
 */
public class ListToMap {
	
	public static void main(String[] args) {
		
		List<Hosting> hostings= Java8Utils.getHostings();
		
		
		hostings.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites))
		.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
		//List Sorting and Converting to Map
		hostings.sort((host1,host2) -> host1.getWebsites().compareTo(host2.getWebsites()));
		
		// Collectors.toMap()
		hostings.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites)).entrySet().forEach(System.out::println);
		
		// Key Value Method
		hostings.stream().collect(Collectors.toMap(host -> host.getName(), host -> host.getWebsites()));
	}

}
