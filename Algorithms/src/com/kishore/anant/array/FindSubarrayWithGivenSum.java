/**
 * 
 */
package com.kishore.anant.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Anant Kishore
 *
 */
public class FindSubarrayWithGivenSum {

	/*
	 * 2 5 12 1 2 3 7 5 10 15 1 2 3 4 5 6 7 8 9 10
	 */
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		StringBuffer sb = new StringBuffer();
		int input = Integer.parseInt(reader.readLine());
		for (int j = 0; j < input; j++) {
			String[] line = reader.readLine().split(" ");
			int len = Integer.parseInt(line[0]);
			int sum = Integer.parseInt(line[1]);
			int[] arr = new int[len];
			line = reader.readLine().split(" ");
			for (int i = 0; i < len; i++) {
				arr[i] = Integer.parseInt(line[i]);
			}
			int curr_sum = 0;
			int k = 0;
			for (int i = 0; i < len; i++) {
				if (curr_sum == sum) {
					sb.append(i + " ");
					sb.append(k + " ");
					break;
				}
				while (k < len && curr_sum < sum) {
					curr_sum += arr[k++];
				}
				while (i < len && curr_sum > sum) {
					curr_sum -= arr[i++];
				}
			}
		}

		System.out.println(sb.toString());
		reader.close();
	}
}
