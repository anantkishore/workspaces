/**
 * 
 */
package com.kishore.anant.zolo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Anant Kishore
 *
 */
public class SmallestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Hello, World");
		Scanner scanner = new Scanner(System.in);
		//int x = scanner.nextInt();
		makePalindrome(6146);
		scanner.close();

	}

	private static void makePalindrome(int x) {
		
		char[] arr = Integer.toString(x).toCharArray();
		
		int i = 0;
		int j = arr.length-1;
		
		while( i < j )
		{
			if(arr[i] == arr[j])
			{
				i++;
				j--;
			}
			else if(arr[i] > arr[j])
			{
				arr[j] = arr[i];
			}
			else
			{
				arr[j] = arr[i];
				arr[j-1]++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
