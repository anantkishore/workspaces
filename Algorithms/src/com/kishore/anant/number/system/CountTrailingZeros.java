/**
 * 
 */
package com.kishore.anant.number.system;

/**
 * @author Anant Kishore
 *
 */
public class CountTrailingZeros {

	public static void main(String[] args) {
		
		int count = 0;
		int N =100;
		
		for(int i = 5; i <= N; i*=5)
		{
			count += N/i;
		}
		
		System.out.println(count);
	}

}
