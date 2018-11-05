/**
 * 
 */
package com.kishore.anant.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Anant Kishore
 *
 */
public class BiggestNumber {

	class Number implements Comparable<Number> {

		String number;

		public Number(String str) {
			this.number = str;
		}

		@Override
		public int compareTo(Number o) {
			return Integer.compare(Integer.parseInt(this.number+o.number), Integer.parseInt(o.number+this.number));
		}

	}

	/**
	 * @param args @throws IOException @throws
	 */
	public static void main(String[] args) throws IOException {

		BiggestNumber bn = new BiggestNumber();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		StringBuffer sb = new StringBuffer();

		int input = Integer.parseInt(reader.readLine());

		for (int i = 0; i < input; i++) {

			int len = Integer.parseInt(reader.readLine());
			String[] numbers = reader.readLine().split(" ");

			List<Number> numberList = new ArrayList<>();
			for (int j = 0; j < len; j++) {
				String temp = numbers[j];
				Number number = bn.new Number(temp);
				numberList.add(number);
			}
			Collections.sort(numberList);
			for (int k = numberList.size() - 1; k > -1; k--) {
				sb.append(numberList.get(k).number);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		reader.close();
	}

}