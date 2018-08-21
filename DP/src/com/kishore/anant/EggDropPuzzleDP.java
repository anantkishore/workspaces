/**
 * 
 */
package com.kishore.anant;

/**
 * @author i351596
 *
 */
public class EggDropPuzzleDP {

	/**
	 * 
	 */
	public EggDropPuzzleDP() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int N = 2;
		int K = 100;

		System.out.println(eggDrop(N, K));
		System.out.println(eggDropDP(N, K));

	}

	private static int eggDropDP(int n, int k) {

		int[][] table = new int[n + 1][k + 1];

		for (int i = 1; i <= n; i++) {
			table[i][1] = 1;
			table[i][0] = 0;
		}
		for (int j = 1; j <= k; j++) {
			table[1][j] = j;
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= k; j++) {
				table[i][j] = Integer.MAX_VALUE;
				for (int x = 1; x <= j; x++) {
					int res = 1 + Math.max(eggDrop(i - 1, x - 1), eggDrop(i, j - x));
					if (res < table[i][j])
						table[i][j] = res;
				}
			}
		}
		return table[n][k];
	}

	private static int eggDrop(int n, int k) {

		if (k == 1 || k == 0 || n == 1)
			return k;

		int min = Integer.MAX_VALUE, res = 0;

		for (int i = 1; i < k; i++) {
			res = Math.max(eggDrop(n - 1, i - 1), eggDrop(n, k - i));
			if (res < min)
				min = res;
		}
		return min + 1;

	}

}
