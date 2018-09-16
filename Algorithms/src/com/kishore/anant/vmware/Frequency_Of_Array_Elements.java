/**
 * 
 */
package com.kishore.anant.vmware;

import java.util.Scanner;

/**
 * @author Anant Kishore
 *
 */
public class Frequency_Of_Array_Elements {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int len = sc.nextInt();
			int[] arr = new int[len];
			for (int j = 0; j < len; j++) {
				arr[j] = sc.nextInt();
			}
			for (int j = 1; j <= len; j++) {
				int temp = arr[j - 1];
				if (temp > 0) {
					setFrequency(temp - 1, arr, len - 1);
				}
			}
			print(arr);
			System.out.println();
		}
		sc.close();
	}

	private static void setFrequency(int i, int[] arr, int len) {
		int temp = arr[i];
		if (temp > 0) {
			arr[i] = -1;
			if (i < len)
				setFrequency(temp - 1, arr, len);
		} else
			arr[i]--;
	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				System.out.print(-arr[i]);
			else
				System.out.print(0);
		}
	}

}
