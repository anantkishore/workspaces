/**
 * 
 */
package com.kishore.anant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Anant Kishore
 *
 */
public class BigIntegerTest {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputSize = Integer.parseInt(br.readLine());

		for (int j = 0; j < inputSize; j++) {

			long N = Long.parseLong(br.readLine());
			long sqrt = (long) Math.sqrt(N);
			long result = 1;

			for (long i = 2; i <= N / 2; i++) {
				if (N % i == 0) {
					result += i;
				}
			}
			if (result == N)
				System.out.println("1");
			else
				System.out.println("0");
		}

		br.close();
	}

}
