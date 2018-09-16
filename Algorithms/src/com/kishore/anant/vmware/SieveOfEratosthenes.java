/**
 * 
 */
package com.kishore.anant.vmware;

import java.util.Scanner;

/**
 * @author Anant Kishore
 *
 */
public class SieveOfEratosthenes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for(int k = 0; k < t; k++)
		{
		int n = sc.nextInt();
		int[] arr = new int[n+1];

		for (int i = 0; i < n+1; i++) {
			arr[i] = i;
		}

		for (int j = 2; j < n+1; j++) {
			int temp = arr[j];
			if (temp != 0) {
				for (int i = 2; temp * i < n+1; i++) {
					arr[temp * i] = 0;
				}
			}
		}
		for (int i = 2; i < n+1; i++) {
			if (arr[i] > 0)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
		}
		sc.close();
	
	}

}
