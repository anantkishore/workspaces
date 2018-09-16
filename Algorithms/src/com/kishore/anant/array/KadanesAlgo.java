/**
 * 
 */
package com.kishore.anant.array;

/**
 * @author Anant Kishore
 *
 */
public class KadanesAlgo {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		int input = 1;// sc.nextInt();

		for (int i = 0; i < input; i++) {

			int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 }; // new int[len];
			int len = arr.length;// sc.nextInt();

			int curr_so_far = arr[0];
			int max_so_far = arr[0];

			for (int j = 1; j < len; j++) {
				int temp = arr[j];// sc.nextInt();

				curr_so_far = Math.max(arr[j], curr_so_far + arr[j]);
				max_so_far = Math.max(max_so_far, curr_so_far);
			}
		}
		//sc.close();
	}

}
