/**
 * 
 */
package com.guru.bharath.java8.optional;

import java.util.Optional;

/**
 * @author AB40286
 *
 */
public class OptionalFilter {
	
	public static void main(String[] args) {
		
		Optional<String> gender = Optional.of("Male");
		Optional<String> emptyGender = Optional.empty();
		
	     //Filter on Optional
        System.out.println(gender.filter(g -> g.equals("male"))); //Optional.empty
        System.out.println(gender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional[MALE]
        System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional.empty
	}
	

}
