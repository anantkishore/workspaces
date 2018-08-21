/**
 * 
 */
package com.kishore.anant;

import java.util.Arrays;

/**
 * @author i351596
 *
 */
public class NewYearChaos {

	/**
	 * 
	 */
	public NewYearChaos() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 5, 1, 2, 3, 7, 8, 6, 4 };

		int len = arr.length;
		int[] bribes = new int[len];
		Arrays.fill(bribes, 2);

		for (int j = 0; j < len; j++) {
			boolean flag = true;
			for (int i = 0; i < len - 1; i++) {
				if (arr[i] > arr[i + 1] && (bribes[arr[i] - 1] > 0 || bribes[arr[i + 1] - 1] > 0)) {
					flag = false;
					swap(arr, i, i + 1);
					if (bribes[arr[i + 1] - 1] > 0)
						bribes[arr[i + 1] - 1] -= 1;
					else
						bribes[arr[i] - 1] -= 1;
				}
			}
			if(flag)
				break;
		}

		int sum = len * 2;
		boolean sorted = true;

		for (int i = 0; i < len; i++) {
			sum -= bribes[i];
		}

		for (int i = 0; i < len - 1; i++) {
			if (arr[i] > arr[i + 1])
				sorted = false;
		}

		if (sorted)
			System.out.println(sum);
		else
			System.out.println("Too chaotic");

	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
