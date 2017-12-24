/**
 * 
 */
package com.guru.bharath.java.streams;

import java.util.ArrayList;
import java.util.List;

import com.guru.bharath.beans.DeveloperBean;
import com.guru.bharath.utils.Java8Utils;

/**
 * @author AB40286
 *
 */
public class FilteringAndCollecting {

	public static void main(String[] args) {

		List<DeveloperBean> developersList = Java8Utils.getDeveloperBeans();
		developersList.forEach(System.out::println);
		
		
		// We Will get the java.util.ConcurrentModificationException at Runtime
		/*for (DeveloperBean developerBean : developersList) {
			if (developerBean.getName().equalsIgnoreCase("mkyong")) {
				developersList.remove(developerBean);
			}
		}
		*/
		
		List<DeveloperBean> newDevelopersList = new ArrayList<>();
		for (DeveloperBean developerBean : developersList) {
			if (!developerBean.getName().equalsIgnoreCase("mkyong")) {
				newDevelopersList.add(developerBean);
			}
		}

		newDevelopersList.forEach(System.out::println);
	}
}
