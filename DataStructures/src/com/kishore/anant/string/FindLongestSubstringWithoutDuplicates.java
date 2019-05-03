/**
 * 
 */
package com.kishore.anant.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Anant Kishore
 *
 */
public class FindLongestSubstringWithoutDuplicates {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		StringBuilder sb = new StringBuilder();

		int inputSize = Integer.parseInt(br.readLine());

		for (int j = 0; j < inputSize; j++) {

			String sentence = br.readLine();

			int i = 0;
			int maxLen = -1;
			int n = sentence.length();
			int[] arr = new int[256];
			int len = 0;
			int lastIndex = 0;

			while (i < n) {
				char temp = sentence.charAt(i);
				int c = (int) temp;
				if (arr[c] == 0) {
					arr[c] = i+1;
					len++;
				} else {
					int prevIndex = arr[c];
					arr[c] = i;
					if (len > maxLen) {
						maxLen = len;
					}
					if (lastIndex < prevIndex) {
						lastIndex = prevIndex;
					}
					len = i - lastIndex + 1;
					if (len > maxLen) {
						maxLen = len;
					}
				}
				i++;
			}
			sb.append(maxLen + "\n");

		}

		System.out.println(sb.toString());

	}

}
