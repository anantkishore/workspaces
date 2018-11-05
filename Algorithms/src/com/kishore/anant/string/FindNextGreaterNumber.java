/**
 * 
 */
package com.kishore.anant.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Anant Kishore
 *
 */
public class FindNextGreaterNumber {

	/**
	 * @param args
	 */

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		int input = Integer.parseInt(reader.readLine());

		for (int j = 0; j < input; j++) {
			int size = Integer.parseInt(reader.readLine());
			int[] arr = new int[size];
			String[] digits = reader.readLine().split(" ");
			for (int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(digits[i]);
			}
			findNextGreaterNumber(arr, 0, size);
			System.out.println(Arrays.toString(arr));
		}
		reader.close();
	}

	private static void findNextGreaterNumber(int[] arr, int low, int n) {

		int i = n - 2;
		while (i >= 0) {
			if (arr[n - 1] > arr[i]) {
				swap(arr, i, n - 1);
				reArrange(arr, i+1, n);
				break;
			}
			i--;
		}
	}

	private static void reArrange(int[] arr, int low, int n) {
		for (int i = low; i < n; i++) {
			int min = arr[i];
			int minIndex = low;
			boolean flag = false;
			for (int j = i + 1; j < n; j++) {
				if (min > arr[j])
				{
					flag = true;
					minIndex = j;
				}
					
			}
			if(flag)
				swap(arr, i, minIndex);
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
