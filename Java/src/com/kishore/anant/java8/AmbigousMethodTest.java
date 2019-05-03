/**
 * 
 */
package com.kishore.anant.java8;

/**
 * @author Anant Kishore
 *
 */
public class AmbigousMethodTest implements A, B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
	}

}

interface A {
	default void sameNameMethod() {
		System.out.println("A's method");
	}
}

interface B {
	default void sameNameMethod() {
		System.out.println("B's method");
	}
}
