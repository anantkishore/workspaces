/**
 * 
 */
package com.kishore.anant.java;

/**
 * @author Anant Kishore
 *
 */

enum DAY {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY;
}

public class TestEnums {

	DAY day;

	public TestEnums(DAY day) {
		this.day = day;
	}

	public static void main(String[] args) {

		TestEnums test = new TestEnums(DAY.FRIDAY);

		switch (test.day) {

		case SATURDAY:

		case SUNDAY:
			System.out.println("chutti");
			break;

		default:
			System.out.println("working day");
			break;
		}

	}

}
