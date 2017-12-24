/**
 * 
 */
package com.guru.bharath.java8.streams.map;

import java.util.List;
import java.util.stream.Collectors;

import com.guru.bharath.beans.Staff;
import com.guru.bharath.beans.StaffPublic;
import com.guru.bharath.utils.Java8Utils;

/**
 * @author AB40286
 *
 */
public class ObjectToObjectUsingStreamMap {
	
	public static void main(String[] args) {
		
		List<Staff> staffList = Java8Utils.getStaffs();
		
		
		List<StaffPublic> staffPublic = staffList.stream().map(Staff -> {
			StaffPublic sp = new StaffPublic();
			sp.setAge(Staff.getAge());
			sp.setAge(Staff.getAge());
            if ("mkyong".equals(Staff.getName())) {
            	sp.setExtra("this field is for mkyong only!");
            }
			return sp;
 		}).collect(Collectors.toList());
		
		
	}

}
