/**
 * 
 */
package com.guru.bharath.java8.streams.sorting;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.guru.bharath.beans.Hosting;
import com.guru.bharath.utils.Java8Utils;

/**
 * @author AB40286
 *
 */
public class ListToMapWithSorted {

	public static void main(String[] args) {

		List<Hosting> hostings = Java8Utils.getHostings();

		Map<String, Long> map = hostings.stream().sorted(Comparator.comparing(Hosting::getWebsites).reversed())
				.collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites, (o, n) -> n, LinkedHashMap::new));
		System.out.println(map);
	}

}
