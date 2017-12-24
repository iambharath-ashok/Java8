/**
 * 
 */
package com.guru.bharath.java8.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.guru.bharath.beans.DeveloperBean;
import com.guru.bharath.utils.Java8Utils;

/**
 * @author AB40286
 *
 */
public class SortingByComparatorWithLambda {

	public static void main(String[] args) {

		List<DeveloperBean> developersList = Java8Utils.getDeveloperBeans();

		//Age Wise
		System.err.println("Before Sorting--- Age Wise");
		developersList.forEach(dev -> System.out.println(dev));

		Collections.sort(developersList, (dev1, dev2) -> dev1.getAge() - dev2.getAge());
		
		System.err.println("After Sorting --- Age Wise");
		developersList.forEach(dev -> System.out.println(dev));

		
		//Salary
		System.err.println("Before Sorting--- Salary Wise");
		developersList.forEach(dev -> System.out.println(dev));
		
		developersList.sort((dev1, dev2) -> dev1.getSalary().compareTo(dev2.getSalary()));
		
		System.err.println("After Sorting --- Salary Wise");
		developersList.forEach(dev -> System.out.println(dev));
		
		
		//Reversed 
		System.err.println("Before Sorting--- Age Wise");
		developersList.forEach(dev -> System.out.println(dev));
		
		Comparator<DeveloperBean> developerBeanComparator = (d1,d2) -> d1.getAge() - d2.getAge();
		
		developersList.sort(developerBeanComparator.reversed());
		
		System.err.println("After Sorting --- Age Wise");
		developersList.forEach(dev -> System.out.println(dev));
		
		
	}

}
