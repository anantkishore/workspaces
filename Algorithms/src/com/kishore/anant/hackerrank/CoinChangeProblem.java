/**
 * 
 */
package com.kishore.anant.hackerrank;

/**
 * @author i351596
 *
 */
public class CoinChangeProblem {

	/**
	 * 
	 */
	public CoinChangeProblem() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] C = {2, 5, 3, 6};
		int sum = 10;
		
		System.out.println(getWays(sum, C, C.length-1));
	}

	private static int getWays(int sum, int[] c, int curIndex) {

		if(sum == 0)
			return 1;
		if(sum < 0 || curIndex < 0)
			return 0;
		else 
			return getWays(sum - c[curIndex], c, curIndex) + getWays(sum, c, curIndex-1); 
		
	}

}