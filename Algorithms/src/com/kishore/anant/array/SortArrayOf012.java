/**
 * 
 */
package com.kishore.anant.array;

import java.util.Scanner;

/**
 * @author Anant Kishore
 *
 */
public class SortArrayOf012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			int len = sc.nextInt();
			int[] arr = new int[len];
			for (int j = 0; j < len; j++) {
				arr[j] = sc.nextInt();
			}
			int low = 0;
			int high = len - 1;
			for (int j = 0; j < len; j++) {
				int temp = arr[j];
				switch (temp) {
				case 0:
					low++;
					break;
				case 1:
					break;
				case 2:
					high--;
					break;
				}
			}
			System.out.print("\nZeroes: ");
			for (int j = 0; j < low; j++) {
				System.out.print(" 0 ");
			}
			System.out.print("\nOnes: ");
			for (int j = low; j <= high; j++) {
				System.out.print(" 1 ");
			}
			System.out.print("\nTwos: ");
			for (int j = high+1; j < len; j++) {
				System.out.print(" 2 ");
			}
		}
		sc.close();

	}

}
