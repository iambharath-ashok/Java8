/**
 * 
 */
package com.guru.bharath.java8.streams.map;

import java.util.List;
import java.util.stream.Collectors;

import com.guru.bharath.beans.Staff;
import com.guru.bharath.utils.Java8Utils;

/**
 * @author AB40286
 *
 */
public class ObjectsToStringUsingStreamMap {

	public static void main(String[] args) {

		List<Staff> staffList = Java8Utils.getStaffs();

		staffList.stream().map(Staff::getName).collect(Collectors.toSet()).forEach(System.out::println);

		staffList.stream().map(staff -> staff.getAge()).collect(Collectors.toSet()).forEach(System.out::println);

		staffList.stream().collect(Collectors.toMap(Staff::getAge, Staff::getName))
				.forEach((k, v) -> System.out.println(k + " : " + v));
	}

}
