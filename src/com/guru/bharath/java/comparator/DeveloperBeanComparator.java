/**
 * 
 */
package com.guru.bharath.java.comparator;

import java.util.Comparator;

import com.guru.bharath.beans.DeveloperBean;

/**
 * @author AB40286
 *
 */
public class DeveloperBeanComparator implements Comparator<DeveloperBean> {

	public int compare(DeveloperBean dev1, DeveloperBean dev2) {
		return dev1.getAge() - dev2.getAge();
	}
}
