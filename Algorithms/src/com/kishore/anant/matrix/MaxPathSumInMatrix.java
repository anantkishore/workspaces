/**
 * 
 */
package com.kishore.anant.matrix;

/**
 * @author Anant Kishore
 *
 */
public class MaxPathSumInMatrix {

	public static void main(String[] args) {
		
		int[][] mat = { {10, 10,  2,  0, 20,  4},
						{1,  0,  0, 30,  2,  5},
						{0, 10,  4,  0,  2,  0},
						{1,  0,  2, 20,  0,  4} };
		
		System.out.println(findMaxPathSum(mat, 4, 6));;
	}

	private static int findMaxPathSum(int[][] mat, int N, int M) {
		
		int res = 0;
		
		for(int i = 0; i < N; i++)
		{
			if(res < mat[i][0])
				res = mat[i][0];
		}
		
		for(int i = 1; i < N; i++)
		{
			res = -1;
			for(int j = 0; j < M; j++)
			{
				if(j > 0 && j < M-1)
					mat[i][j] += Math.max(mat[i-1][j], 
								Math.max(mat[i-1][j+1], mat[i-1][j-1]));
				else if( j < M-1)
					mat[i][j] += Math.max(mat[i-1][j], mat[i-1][j+1]);
				else 
					mat[i][j] += Math.max(mat[i-1][j], mat[i-1][j-1]);
				res = Math.max(mat[i][j], res);
			}
		}
		
		return res;
	}

}
