/**
 * 
 */
package com.kishore.anant.backtracking;

import java.util.Arrays;

/**
 * @author Anant Kishore
 *
 */
public class NQueensProblem {

	/**
	 * 
	 */
	public NQueensProblem() {
		
	}
	public static void main(String[] args) {
		int N = 4;
		int[][] arr = new int[4][4];
		//Arrays.fill(arr, 0);
		
		findSolution(arr, 0, N, N, N, N);
	}

	private static boolean findSolution(int[][] arr, int row, int col, int m, int n, int N) {
		
		
		if(N == 0)
		{
			printSolution(arr);
			return true;
		}
		else
		{
			for(int i = row; i < m; i++)
			{
				for(int j = 0; j < n; j++)
				{
					if(isSafe(arr, i, j, m, n))
					{
						arr[i][j] = 1;
						boolean result = findSolution(arr, i+1, j, m, n, N-1);
						if(!result)
						{
							arr[i][j] = 0;
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean isSafe(int[][] arr, int row, int col, int m, int n) {
		
		for(int j = 0; j < n; j++)
		{
			if(arr[row][j] == 1)
				return false;
		}
		for(int i = 0; i < m; i++)
		{
			if(arr[i][col]  == 1)
				return false;
		}
		for(int i = row, j = col; i >= 0 && j >= 0; i--,j--)
		{
			if(arr[i][j]  == 1)
				return false;
		}
		for(int i = row, j = col; i >= 0 && j < n; i--,j++)
		{
			if(arr[i][j]  == 1)
				return false;
		}
		return true;
	}

	private static void printSolution(int[][] arr) {
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				if(arr[i][j] == 1)
					System.out.println("("+i+","+ j+")");
			}
		}
	}

}
