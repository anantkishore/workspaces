/**
 * 
 */
package com.kishore.anant.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Anant Kishore
 *
 */
public class RotateArray {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader reader = new BufferedReader(isr);

		int inputs = Integer.parseInt(reader.readLine());

		for (int j = 0; j < inputs; j++) {
			int size = Integer.parseInt(reader.readLine());
			int[] arr = new int[size];

			int len = arr.length;

			String[] numbers = reader.readLine().split(" ");
			// [1, 2, 3, 4, 5, 6, 7]
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(numbers[i]);
			}

			System.out.println(Arrays.toString(arr));

			int d = Integer.parseInt(reader.readLine());
			// 4 5 6 7 1 2 3
			reverseArray(arr, 0, d);
			System.out.println(Arrays.toString(arr));
			reverseArray(arr, d, len);
			System.out.println(Arrays.toString(arr));
			reverseArray(arr, 0, len);
			System.out.println(Arrays.toString(arr));

		}

	}

	private static void reverseArray(int[] arr, int low, int high) {

		for (int i = low, j = high - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

}
