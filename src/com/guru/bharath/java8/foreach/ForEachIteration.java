/**
 * 
 */
package com.guru.bharath.java8.foreach;

import java.util.List;
import java.util.Map;

import com.guru.bharath.beans.DeveloperBean;
import com.guru.bharath.utils.Java8Utils;

/**
 * @author AB40286
 *
 */
public class ForEachIteration {

	public static void main(String[] args) {

		// List
		List<DeveloperBean> developersList = Java8Utils.getDeveloperBeans();
		developersList.forEach(dev -> System.out.println(dev));

		// Map
		Map<String, Integer> items = Java8Utils.getItems();
		items.forEach((k, v) -> System.out.println(k + " : " + v));
	}

}
