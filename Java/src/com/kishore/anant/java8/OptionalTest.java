/**
 * 
 */
package com.kishore.anant.java8;

import java.util.Optional;

/**
 * @author i351596
 *
 */
public class OptionalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Optional<String> gender = Optional.of("MALE");
		
		String answer1 = "Yes";
		String answer2 = null;
			
		System.out.println(gender);
		System.out.println(gender.get());
		System.out.println(Optional.empty());
		
		System.out.println(Optional.ofNullable(answer1));
		System.out.println(Optional.ofNullable(answer2));
		
		System.out.println(Optional.of(answer2));
	}

}
