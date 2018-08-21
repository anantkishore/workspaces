/**
 * 
 */
package com.kishore.anant;

/**
 * @author i351596
 *
 */
public class EditDistanceDP {

	/**
	 * 
	 */
	public EditDistanceDP() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char[] text1 = "CART".toCharArray();
		char[] text2 = "MARCH".toCharArray();

		int m = text1.length;
		int n = text2.length;

		System.out.println(findEditDistanceDP(text1, text2, m, n));

	}

	private static int findEditDistanceDP(char[] text1, char[] text2, int m, int n) {

		int[][] table = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0)
					table[i][j] = j;
				else if(j == 0)
					table[i][j] = i;
				else if (text1[i - 1] == text2[j - 1])
					table[i][j] = table[i - 1][j - 1];
				else
					table[i][j] = 1 + min(table[i][j-1], table[i-1][j-1], table[i-1][j]);
			}
		}
		return table[m][n];

	}

	private static int min(int i, int j, int k) {
		
		return (i > j) ? ((i > k) ? i : k) : ((j > k) ? j: k);
	}

}
