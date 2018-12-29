/**
 * 
 */
package com.kishore.anant.pattern;

import java.util.Arrays;

/**
 * @author Anant Kishore
 *
 */
public class ZArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char[] arr = "aabxaabxcaabxaabxay".toCharArray();

		int[] z = calcZArray(arr);

		System.out.println(Arrays.toString(z));

	}

	public static int[] calcZArray(char[] arr) {
		int len = arr.length;
		int[] z = new int[len];

		for (int i = 1; i < len; i++) {
			int k = 0;
			int count = 0;
			int temp = i;
			if (arr[i] == arr[k]) {
				while (arr[i] == arr[k]) {
					count++;
					i++;
					k++;
				}
				i = temp;
				z[i] = count;
				k = 1;
				int right = i+count-1;
				if (count > 1) {
					while (z[k] + i < right) {
						z[++i] = z[k++];
					}
				}
			}
		}
		return z;
	}

}
