/**
 * 
 */
package com.kishore.anant.array;

import java.util.Scanner;

/**
 * @author Anant Kishore
 *
 */
public class MissingNumberInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {

			int len = sc.nextInt();
			//int[] arr = new int[len];
			int sum = len*(len+1)/2;
			
			for (int j = 0; j < len-1; j++) {
				sum -= sc.nextInt();
			}
			
			System.out.println(sum);
			
		}
		sc.close();
	}

}
