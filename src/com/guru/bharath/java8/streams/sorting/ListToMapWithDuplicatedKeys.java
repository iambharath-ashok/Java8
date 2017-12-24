/**
 * 
 */
package com.guru.bharath.java8.streams.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.guru.bharath.beans.Hosting;

/**
 * @author AB40286
 *
 */
public class ListToMapWithDuplicatedKeys {

	public static void main(String[] args) {

		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1, "liquidweb.com", 80000l));
		list.add(new Hosting(2, "linode.com", 90000l));
		list.add(new Hosting(3, "digitalocean.com", 120000l));
		list.add(new Hosting(4, "aws.amazon.com", 200000l));
		list.add(new Hosting(5, "mkyong.com", 1l));

		// Adding Duplicated Key
		list.add(new Hosting(6, "linode.com", 100000l));

		// Throws IllegealStateException while Converting to Map
		//Map<String, Long> map = list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites));
		//System.out.println(map);

		// Solution
		Map<String, Long> nonDuplicateMap = list.stream()
				.collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites, (oldHost, newHost) -> oldHost));
		System.out.println(nonDuplicateMap);
	}

}
