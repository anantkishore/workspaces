/**
 * 
 */
package com.kishore.anant.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Anant Kishore
 *
 */
public class StreamBasics {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < 1000; i++) {
			intList.add(i);
		}

		Stream<Integer> sequentialStram = intList.stream();
		Stream<Integer> parallelStram = intList.parallelStream();

		Stream<Integer> highNums = parallelStram.filter(p -> p > 90);
		highNums.forEach(p -> System.out.println("high nums parallel =" + p));

		Stream<Integer> highNumsSeq = sequentialStram.filter(p -> p > 90);

		highNumsSeq.forEach(p -> System.out.println("High Nums Sequential =" + p));

	}

}
