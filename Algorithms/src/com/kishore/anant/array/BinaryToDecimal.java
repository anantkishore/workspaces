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
public class BinaryToDecimal {

	/**
	 * 
	 */
	public BinaryToDecimal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		StringBuffer sb = new StringBuffer();
		int input = Integer.parseInt(reader.readLine());
		for (int j = 0; j < input; j++) {
			int number = Integer.parseInt(reader.readLine());
			int decimal = 0;
			int power = 1;

			while (number > 0) {
				int rem = number % 2;
				decimal =  decimal + rem * power;
				number /= 10;
				power = power * 2;
			}
			sb.append(decimal + "\n");
		}
		System.out.println(sb.toString());
		reader.close();

	}

}
