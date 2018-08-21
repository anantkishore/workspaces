/**
 * 
 */
package com.kishore.anant;

import java.util.Arrays;

/**
 * @author i351596
 *
 */
public class LISNaiveApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		int n = arr.length;

		int[] lisCount = new int[n];

		Arrays.fill(lisCount, 1);

		int m = n;
		int max_ref_here = 0;

		for (int i = 1; i < n; i++) {
			max_ref_here = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && max_ref_here < lisCount[j]+1) {
					max_ref_here = 1 + lisCount[j];
				}
			}
			lisCount[i] = Math.max(max_ref_here, 1);
		}

	}

}
