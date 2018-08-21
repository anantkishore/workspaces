/**
 * 
 */
package com.kishore.anant;

/**
 * @author i351596
 *
 */
public class BinomialCoefficient {

	static int[][] table;

	/**
	 * 
	 */
	public BinomialCoefficient() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 2;
		int k = 1;

		table = new int[n + 1][k + 1];
		System.out.println(binomialCoeff(n, k));

	}

	private static int binomialCoeff(int n, int k) {

		if (n > 0 && k >= 0) {
			if (n == k || k == 0) {
				table[n][k] = 1;
				return table[n][k];
			} else if (table[n - 1][k - 1] != 0 && table[n - 1][k] != 0)
				return table[n - 1][k - 1] + table[n - 1][k];
			else
				return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
		}
		return 0;
	}

}
