/**
 * 
 */
package com.kishore.anant.hackerrank;

/**
 * @author i351596
 *
 */
public class MinimumSwaps {

	private static int count = 0;

	/**
	 * 
	 */
	public MinimumSwaps() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 7, 1, 3, 2, 4, 5, 6 };

		findMinimumSwaps(arr, 0, arr.length);

		System.out.println(count);
	}

	private static void findMinimumSwaps(int[] arr, int i, int len) {

		for (int j = 0; j < len-1; j++) 
		{
			for (int k = j + 1; k < len; k++) 
			{
				if(arr[j] > arr[k])
				{
					int k1 = k;
					int bonus = 0;
					while(k1+1 < len && arr[k1] > arr[k1+1])
					{
						k1++;
					}
					while(k1+1 < len && arr[k1] < arr[k1+1])
					{
						k1++;
						count = 1;
					}
					swap(arr, j, k1+bonus);
					count++;
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}