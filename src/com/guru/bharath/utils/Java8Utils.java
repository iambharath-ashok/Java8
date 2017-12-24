/**
 * 
 */
package com.guru.bharath.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.guru.bharath.beans.DeveloperBean;
import com.guru.bharath.beans.Hosting;
import com.guru.bharath.beans.Person;
import com.guru.bharath.beans.Staff;

/**
 * @author AB40286
 *
 */
public class Java8Utils {

	public static List<DeveloperBean> getDeveloperBeans() {
		List<DeveloperBean> result = new ArrayList<DeveloperBean>();
		result.add(new DeveloperBean("mkyong", new BigDecimal("70000"), 33));
		result.add(new DeveloperBean("alvin", new BigDecimal("80000"), 20));
		result.add(new DeveloperBean("jason", new BigDecimal("100000"), 10));
		result.add(new DeveloperBean("iris", new BigDecimal("170000"), 55));
		return result;
	}

	public static Map<String, Integer> getItems() {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		return items;
	}

	public static List<Person> getPersons() {
		return  Arrays.asList(
				new Person("mkyong", 30), 
				new Person("jack", 20), 
				new Person("lawrence", 40)
		);
	}
	
	public static List<Staff> getStaffs() {
		return  Arrays.asList(
	            new Staff("mkyong", 30, new BigDecimal(10000)),
	            new Staff("jack", 27, new BigDecimal(20000)),
	            new Staff("lawrence", 33, new BigDecimal(30000))
	    );
	}
	
	
	public static List<Hosting> getHostings(){
		
		return Arrays.asList(
					new Hosting(1,"liquidweb.com",80000l),
					new Hosting(2,"linode.com",90000l),
					new Hosting(3,"digitalocean.com",10000l),
					new Hosting(4,"aws.amazon.com",2000000l),
					new Hosting(5, "mkyong.com", 1l)
				);
	}
	
	

}
