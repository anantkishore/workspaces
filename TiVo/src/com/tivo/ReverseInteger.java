/**
 * 
 */
package com.tivo;

/**
 * @author i351596
 *
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int number = 12345;
		int rem = 0;
		int digits = countDigits(number);
		int sum = 0;

		while(number > 0)
		{
			sum = sum*10 + number%10;
			number /= 10;
		}
		
		System.out.println(sum);
	}
	
	static int countDigits(int number)
	{
		if(number ==0 ) return 0;
		else
		{
			return countDigits(number/10) + 1;
		}
		
	}

}
