/**
 * 
 */
package com.morgan.stanley;

import java.util.Arrays;

/**
 * @author i351596
 *
 */
public class Sort012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr  = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};//{0, 1, 2, 0, 1, 2};
		
		int low = 0, high = arr.length-1, mid = 0;
		
		while(mid <= high)
		{
			switch(arr[mid])
			{
			case 0: swap(arr, low, mid);
					low++; mid++;
					break;
			case 1: mid++;
					break;
			case 2: swap(arr, mid, high);
					high--;
					break;
			default:
					break;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	private static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
