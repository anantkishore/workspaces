/**
 * 
 */
package com.tivo;

/**
 * @author i351596
 *
 */
public class CoinChangeProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int N = 4;
		int[] arr = {1,2,3};
		
		System.out.println(count(N, arr.length-1, arr));

	}
	
	static int count(int N, int m, int[] arr)
	{
		if(N == 0) 
		{
			return 1;
		}
		else if(N < 0)
		{
			return 0;
		}
		else if(m <= 0 && N >= 1)
		{
			return 0;
		}
		else
		{
			return count(N, m-1, arr) + count(N-arr[m], m, arr);
		}
	}

}
