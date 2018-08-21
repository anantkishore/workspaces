/**
 * 
 */
package com.kishore.anant.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author i351596
 *
 */
public class Fibonacci_Returns {

	static long fib[] = new long[100];

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = reader.readLine()) != null) {
			System.out.println(fib(Integer.parseInt(line)));
		}
		reader.close();
	}

	static long fib(int n) {
		if (n == 0 || n == 1)
			return n;
		else if (fib[n - 1] != 0 && fib[n - 2] != 0) {
			fib[n] = fib[n - 1] + fib[n - 2];
			return fib[n];
		} else {
			fib[n - 1] = fib(n - 1);
			fib[n - 2] = fib(n - 2);
			fib[n] = fib[n - 1] + fib[n - 2];
			return fib[n];
		}
	}

}