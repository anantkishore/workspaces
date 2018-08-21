/**
 * 
 */
package com.kishore.anant;

import java.util.Arrays;

/**
 * @author i351596
 *
 */
public class FindKthMax {

	/**
	 * 
	 */
	public FindKthMax() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = { 7, 10, 4, 3, 20, 15 };
		int k = 3;
		
		System.out.println(quickSort(arr, 0, arr.length - 1, k));
		System.out.println(Arrays.toString(arr));
	}

	private static int quickSort(int[] arr, int low, int high, int k) {
		
		if (k > 0 && k <= high-low+1) {
			int pIndex = partition(arr, low, high);
			if (k-1 == pIndex-low) 
			{
				return arr[k];
			} 
			else if(k-1 < pIndex-low)
			{
				quickSort(arr, low, pIndex - 1, k);
			}
			else
			{
				quickSort(arr, pIndex + 1, high, k-pIndex+low-1);
			}
		}
		return -1;
	}

	private static int partition(int[] arr, int low, int high) {

		int pIndex = low;
		int i = low;
		int pivot = arr[high];

		while (i < high) {
			if (arr[i] <= pivot) {
				swap(arr, i, pIndex);
				pIndex = pIndex + 1;
			}
			i++;
		}
		swap(arr, pIndex, high);
		return pIndex;

	}

	private static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
