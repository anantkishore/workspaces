/**
 * 
 */
package com.kishore.anant.Sorting;

import java.util.Arrays;

/**
 * @author Anant Kishore
 *
 */
public class RadixSort {

	public static void main(String[] args) {
		
		int[] arr = {170, 450, 75, 90, 802, 24, 2, 66};
		System.out.println(Arrays.toString(arr));
		int d = findMaxDigits(arr);
		for(int i = 0 ; i < d ; i++)
		{
			int exp = (int) Math.pow(10, i);
			radixSort(arr, exp, arr.length);
		}
		System.out.println(Arrays.toString(arr));
			
	}

	private static int findMaxDigits(int[] arr) {
		
		int maxDigits = 0;
		int maxEle = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > maxEle)
			{
				maxEle = arr[i];
			}
		}
		while(maxEle > 0)
		{
			maxEle /= 10;
			maxDigits++;
		}
		return maxDigits;
	}

	private static void radixSort(int[] arr, int e, int n) {
		
		int [] output = new int[n];
		int [] count = new int[10];
		
		for(int i = 0; i < n; i++)
		{
			count[(arr[i]/e)%10]++;
		}
		
		for(int i = 1; i < 10; i++)
			count[i] += count[i-1];
		
		for(int i = n-1; i > -1 ; i--)
		{
			output[count[(arr[i]/e)%10]-1] = arr[i];
			count[(arr[i]/e)%10]--;
		}
		
		for(int i =0; i < n; i++)
			arr[i] = output[i];
		
	}

}
