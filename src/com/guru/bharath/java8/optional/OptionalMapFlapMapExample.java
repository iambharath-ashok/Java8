/**
 * 
 */
package com.guru.bharath.java8.optional;

import java.util.Locale;
import java.util.Optional;

/**
 * @author AB40286
 *
 */
public class OptionalMapFlapMapExample {

	public static void main(String[] args) {
		Optional<String> nonEmptyGender = Optional.of("male");
		Optional<String> emptyGender = Optional.empty();

		System.out.println(emptyGender);

		nonEmptyGender.map(String::toUpperCase);
		System.out.println(nonEmptyGender.map(String::toUpperCase));

		System.out.println(emptyGender.map(String::toUpperCase));

		Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));

		System.out.println(nonEmptyOtionalGender);
		
		System.out.println(nonEmptyOtionalGender.map(Optional::get).map(String::toUpperCase));
		
		System.out.println(nonEmptyOtionalGender.map(e -> e.get()).map(e -> e.toUpperCase(new Locale(""))));
	}

}
