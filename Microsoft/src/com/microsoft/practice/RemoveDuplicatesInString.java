/**
 * 
 */
package com.microsoft.practice;

import java.util.Arrays;

/**
 * @author i351596
 *
 */
public class RemoveDuplicatesInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		char[] input = new String("geeksforgeeksgeeksfoageeks").toCharArray();
		int count = 0;
		int[] arr = new int[26];
		int index = 0;
		
		for(int i = 0; i < input.length; i++)
		{
			char temp = input[i];
			if(arr[temp-97] == 0)
			{
				arr[temp-97] = 1;
				input[index++] = temp;
			}
			
		}
		for(int i=index; i < input.length; i++)
		{
			input[i] = ' ';
		}
		System.out.println(Arrays.toString(input));

	}

}
