/**
 * 
 */
package com.guru.bharath.java.streams;

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
		DeveloperBean dev = getDevBean(developersList, "mkyong");
		System.out.println(dev);
	}

	private static DeveloperBean getDevBean(List<DeveloperBean> developersList, String name) {
		for (DeveloperBean devloperBean : developersList) {
			if (devloperBean.getName().equals(name)) {
				return devloperBean;
			}
		}
		return null;
	}

}
