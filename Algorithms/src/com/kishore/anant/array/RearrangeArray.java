/**
 * 
 */
package com.kishore.anant.array;

import java.util.Arrays;

/**
 * @author Anant Kishore
 *
 */
public class RearrangeArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 0, 2};
		
		int i = 0, count = 0;
		int len = arr.length;
		
		while(i >= 0 && count < len)
		{
			if(arr[i] > 0)
			{
				int j = arr[i];
				int temp = arr[j];
				arr[j] = -i;
				i = temp;
			}
			count++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
