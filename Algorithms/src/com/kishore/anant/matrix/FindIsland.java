/**
 * 
 */
package com.kishore.anant.matrix;

/**
 * @author Anant Kishore
 *
 */
public class FindIsland {
	
	
	static int sum = 0;
	
	public static void main(String[] args) {

		int mat[][] = {{1, 1, 0, 0, 0},
                	   {0, 1, 0, 0, 1},
                	   {0, 0, 0, 0, 1},
                	   {0, 0, 0, 0, 1},
                	   {1, 1, 1, 0, 1}}; 
		int row = mat.length;
		int col = mat[0].length;
		boolean[][] visited = new boolean[row][col];
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int val = 0;
				sum = 0;
				if(mat[i][j] == 1 && !visited[i][j])
					val = findIsland(mat, i, j , row, col, visited);
				if(val > max)
					max = val;
			}
		}
		System.out.println(max);
	}
	
	public static boolean isValid(int i, int j, int row, int col)
	{
		return i < row && j < col && i > -1 && j > -1;
	}

	private static int findIsland(int[][] mat, int i, int j, int row, int col, boolean[][] visited) {

		if(!visited[i][j])
		{
			sum += 1;
			visited[i][j] = true;
			
			if(isValid(i, j-1, row, col) && mat[i][j-1] == 1)
			{
				findIsland(mat, i, j-1, row, col, visited);
			}
			if(isValid(i, j+1, row, col) && mat[i][j+1] == 1)
			{
				findIsland(mat, i, j+1, row, col, visited);
			}
			if(isValid(i-1, j, row, col) && mat[i-1][j] == 1)
			{
				findIsland(mat, i-1, j, row, col, visited);
			}
			if(isValid(i+1, j, row, col) && mat[i+1][j] == 1)
			{
				findIsland(mat, i+1, j, row, col, visited);
			}
			if(isValid(i+1, j-1, row, col) && mat[i+1][j-1] == 1)
			{
				findIsland(mat, i+1, j-1, row, col, visited);
			}
			if(isValid(i-1, j-1, row, col) && mat[i-1][j-1] == 1)
			{
				findIsland(mat, i-1, j-1, row, col, visited);
			}
			if(isValid(i-1, j+1, row, col) && mat[i-1][j+1] == 1)
			{
				findIsland(mat, i-1, j+1, row, col, visited);
			}
			if(isValid(i+1, j+1, row, col) && mat[i+1][j+1] == 1)
			{
				findIsland(mat, i+1, j+1, row, col, visited);
			}
			if(isValid(i-1, j+1, row, col) && mat[i-1][j+1] == 1)
			{
				findIsland(mat, i-1, j+1, row, col, visited);
			}
		}
		
		return sum;
	}

}
