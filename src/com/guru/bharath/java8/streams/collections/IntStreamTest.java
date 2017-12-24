/**
 * 
 */
package com.guru.bharath.java8.streams.collections;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * @author AB40286
 *
 */
public class IntStreamTest {

	public static void main(String[] args) {
		
		IntStream stream = Arrays.stream(new int[] {1,3,4,67,89});
		
		stream.forEach(System.out::println);
		
		Stream<int[]> intStream = Stream.of(new int[] {1,3,4,67,89});
		//intStream.forEach(System.out::println);
		
		
		IntStream intStream2 = intStream.flatMapToInt(x -> Arrays.stream(x));
		
		intStream2.forEach(System.out::println);
		
		
	}

}
