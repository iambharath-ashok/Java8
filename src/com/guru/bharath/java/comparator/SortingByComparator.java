/**
 * 
 */
package com.guru.bharath.java.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.guru.bharath.beans.DeveloperBean;
import com.guru.bharath.utils.Java8Utils;

/**
 * @author AB40286
 *
 */
public class SortingByComparator {

	public static void main(String[] args) {

		List<DeveloperBean> developersList = Java8Utils.getDeveloperBeans();

		System.err.println("Before Sorting--- Age Wise");
		developersList.forEach(dev -> System.out.println(dev));

		// Sort by age
		Collections.sort(developersList, new Comparator<DeveloperBean>() {

			public int compare(DeveloperBean dev1, DeveloperBean dev2) {
				return dev1.getAge() - dev2.getAge();
			}
		});
		System.err.println("After Sorting --- Age Wise");
		developersList.forEach(dev -> System.out.println(dev));

		System.err.println("Before Sorting--- Name Wise");
		developersList.forEach(dev -> System.out.println(dev));

		// Sort by Name
		Collections.sort(developersList, new Comparator<DeveloperBean>() {

			public int compare(DeveloperBean dev1, DeveloperBean dev2) {
				return dev1.getName().compareToIgnoreCase(dev2.getName());
			}

		});
		System.err.println("After Sorting --- Name Wise");
		developersList.forEach(dev -> System.out.println(dev));

		
		// Passing new instance of Comparator
		Collections.sort(developersList, new DeveloperBeanComparator());

	}

}
