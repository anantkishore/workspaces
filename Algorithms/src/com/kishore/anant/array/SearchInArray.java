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
public class SearchInArray {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		StringBuffer sb = new StringBuffer();
		int input = Integer.parseInt(reader.readLine());
		
		for (int j = 0; j < input; j++) {
			String[] details = reader.readLine().split(" ");
			int size = Integer.parseInt(details[0]);
			int x = Integer.parseInt(details[1]);

			String[] numbers = reader.readLine().split(" ");
			boolean flag = false;
			for (int i = 0; i < size; i++) {
				if (Integer.parseInt(numbers[i]) == x) {
					flag = true;
					sb.append((i + 1) + "\n");
				}
			}
			if (!flag)
				sb.append("-1\n");
		}
		System.out.println(sb.toString());
		reader.close();
	}
}
