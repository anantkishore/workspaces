/**
 * 
 */
package com.kishore.anant.array;

import java.util.Scanner;

/**
 * @author Anant Kishore
 *
 */
public class SubarrayWithGivenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			int len = sc.nextInt();
			int[] arr = new int[len];
			int x = sc.nextInt();
			for (int j = 0; j < len; j++) {
				arr[j] = sc.nextInt();
			}
			int sum = 0, a = 0, b = 0;
			boolean flag = false;
			while (b < len && a < len) {
				if (x == sum) {
					flag = true;
					break;
				}
				if (x > sum + arr[b]) {
					sum += arr[b++];
				} else if (x < sum + arr[b]) {
					sum += arr[b++];
					while (a < b && sum > x) {
						sum -= arr[a++];
					}
					if (a == b) {
						b++;
					}
				} else {
					flag = true;
					b++;
					break;
				}
			}
			if (x == sum)
				flag = true;
			if(flag)
				System.out.println(++a + " " + b);
			else
				System.out.println(-1);
		}
		sc.close();
	}
}
