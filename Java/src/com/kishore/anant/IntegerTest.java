/**
 * 
 */
package com.kishore.anant;

/**
 * @author Anant Kishore
 *
 */
public class IntegerTest {
	public static void main(String args[]) {
		IntegerTest test = new IntegerTest();
		test.main();
	}

	public void main() {

		int i1 = 5;
		int i2 = 10;
		swap(i1, i2); // swap values

		System.out.println(i1);
		System.out.println(i2);

	}

	private void swap(Integer J1, Integer J2) {
		int temp = J1;
		J1 = J2;
		J2 = temp;
	}

}
