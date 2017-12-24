/**
 * 
 */
package com.guru.bharath.java8.streams.filter;

import java.util.List;

import com.guru.bharath.beans.DeveloperBean;
import com.guru.bharath.beans.Person;
import com.guru.bharath.utils.Java8Utils;

/**
 * @author AB40286
 *
 */
public class FilteringAndFindanyOrelse {

	public static void main(String[] args) {

		List<DeveloperBean> developersList = Java8Utils.getDeveloperBeans();

		List<Person> personList = Java8Utils.getPersons();

		System.out.println(developersList.stream() // Convert to Stream
				.filter(dev -> dev.getAge() > 30) // filter
				.findAny() // Find if any of them
				.orElse(null));
		; // If Not found return null

		DeveloperBean developer = developersList.stream().filter(dev -> {
			if (dev.getAge() > 30 && dev.getName() != "guru") {
				return true;
			} else {
				return false;
			}
		}).findAny().orElse(null);
		System.out.println(developer);
	}

}
