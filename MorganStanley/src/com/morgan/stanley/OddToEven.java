/**
 * 
 */
package com.morgan.stanley;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author i351596
 *
 */
public class OddToEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		


		Scanner scanner = new Scanner(System.in);
		int testCases = 1;//scanner.nextInt();
		char temp = ' ';
		

		for (int i = 0; i < testCases; i++) {
			
			char[] number = "1356425".toCharArray();
			int maxIndex = 0; 
			temp = number[maxIndex];
			
			for(int j =0; j < number.length-1; j++)
			{
				int charInt = number[j];
				if((charInt < temp) &&  ((int)charInt - 48)%2 == 0)
				{
					
					temp = number[j];
					number[j] = number[number.length-1];
					number[number.length-1] = temp;
					
				}	
			}
			
			System.out.println(Arrays.toString(number));
		}	
		scanner.close();
	}

}
