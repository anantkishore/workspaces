/**
 * 
 */
package com.kishore.anant.array;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Anant Kishore
 *
 */
public class EquilibriumPoint {

	public static void main(String[] args) throws IOException {
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader reader = new BufferedReader(isr);
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();//Integer.parseInt(reader.readLine());
		for (int i = 0; i < input; i++) {
			int len = sc.nextInt();//Integer.parseInt(reader.readLine().trim());
			if (len == 1) {
				sb.append("1\n");
			}
			else {
			//String[] str = reader.readLine().split(" ");
			int[] arr = new int[len];
			for (int j = 0; j < len; j++) {
				arr[j] = sc.nextInt();//Integer.parseInt(str[j]);
			}
			int low = 1, high = len - 2;
			int leftSum = arr[0], rightSum = arr[len-1];
			boolean flag = false;
			while (low <= high) {
				if (leftSum == rightSum && low == high) {
					flag = true;
					break;
				} else if (leftSum < rightSum)
					leftSum += arr[low++];
				else
					rightSum += arr[high--];
			}
			if (flag)
				sb.append(++low+"\n");
			else
				sb.append("-1\n");
		}
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
