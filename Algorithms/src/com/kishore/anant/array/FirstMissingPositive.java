/**
 * 
 */
package com.kishore.anant.array;

import java.util.ArrayList;

/**
 * @author Anant Kishore
 *
 */
public class FirstMissingPositive {

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();

		A.add(3);
		A.add(4);
		A.add(-1);
		A.add(1);

		System.out.println(firstMissingPositive(A));

		System.out.println(A.toString());

	}

	public static int firstMissingPositive(ArrayList<Integer> A) {

		int len = A.size();

		int[] arr = new int[len];
		int j = 0;
		for (Integer item : A) {
			arr[j++] = item;
		}

		for (int i = 0; i < len; i++) {
			int index = arr[i];
			while (index > 0 && index < len + 1) {
				arr[i] = -index;
				index--;
				int temp = arr[index];
				arr[index] = 0;
				if (temp < 0 || temp > len) {
					break;
				} else {
					index = temp;
				}
			}
		}

		for (int i = 0; i < len; i++) {
			if (arr[i] != 0)
				return i + 1;
		}
		return -1;
	}

}
