/**
 * 
 */
package com.kishore.anant.intuit;

/**
 * @author i351596
 *
 */
public class LongToDate {
	
	static final long MS_IN_NORMAL_YEAR = 365 * 24 * 60 * 1000;
	
	static final long MS_IN_LEAP_YEAR = 366 * 24 * 60 * 1000;
	
	/**
	 * 
	 */
	public LongToDate() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long value = 324561092314L;
		
		converLongToDate(value);
	}

	private static void converLongToDate(long value) {
		
		 
	}

	static boolean isLeapYear(int year)
	{
		return (year % 4 == 0 && (year % 100 != 0 && year % 400 == 0));
	}
}