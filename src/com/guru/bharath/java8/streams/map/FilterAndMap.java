/**
 * 
 */
package com.guru.bharath.java8.streams.map;

import java.util.List;
import java.util.stream.Collectors;

import com.guru.bharath.beans.DeveloperBean;
import com.guru.bharath.utils.Java8Utils;

/**
 * @author AB40286
 *
 */
public class FilterAndMap {

	public static void main(String[] args) {

		List<DeveloperBean> developersList = Java8Utils.getDeveloperBeans();

		int devAge = developersList.stream().map(DeveloperBean::getAge).filter(age -> age > 20).findAny().orElse(null);
		System.out.println(devAge);

		developersList.stream().filter(dev -> true).map(DeveloperBean::getSalary).forEach(System.out::println);

		developersList.stream().map(DeveloperBean::getName).collect(Collectors.toList()).forEach(System.out::println);

		developersList.stream().filter(d -> false).findFirst().ifPresent(System.out::println);
	}

}
