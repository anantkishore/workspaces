/**
 * 
 */
package com.kishore.anant;

/**
 * @author i351596
 *
 */
public class FindIsland {

	static int[][] visited = new int[5][5];
	static final int n = 5;
	static final int m = 5;

	static int counter = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] mat = { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1 } };
		findTotalCount(mat, mat.length, mat.length);

	}

	public static void findTotalCount(int[][] mat, int n, int m) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {

				if (mat[i][j] == 1 && visited[i][j] != 1) {

					counter = 1;
					DFS(mat, i, j);
					System.out.println(counter);

				}
			}
		}
	}

	private static int DFS(int[][] mat, int i, int j) {

		if (mat[i][j] == 1 && visited[i][j] == 0) {
			visited[i][j] = 1;

			if ((i + 1 >= 0 && i + 1 < n && visited[i + 1][j] != 1 && mat[i + 1][j] == 1)) 
			{
				counter++;
				DFS(mat, i + 1, j);
			}
			if (i - 1 >= 0 && i - 1 < n && mat[i - 1][j] == 1 && visited[i - 1][j] != 1) 
			{
				counter++;
				DFS(mat, i - 1, j);
			}
			if (j + 1 >= 0 && j + 1 < n && mat[i][j + 1] == 1 && visited[i][j + 1] != 1) 
			{
				counter++;
				DFS(mat, i, j + 1);
			}
			if (j - 1 >= 0 && j - 1 < n && mat[i][j - 1] == 1 && visited[i][j - 1] != 1) 
			{
				counter++;
				DFS(mat, i, j - 1);
			}
			if (j + 1 >= 0 && j + 1 < n && i + 1 >= 0 && i + 1 < n && mat[i + 1][j + 1] == 1
					&& visited[i + 1][j + 1] != 1) 
			{
				counter++;
				DFS(mat, i + 1, j + 1);
			}
			if (j - 1 >= 0 && j - 1 < n && i - 1 >= 0 && i - 1 < n && mat[i - 1][j - 1] == 1
					&& visited[i - 1][j - 1] != 1) 
			{
				counter++;
				DFS(mat, i - 1, j - 1);
			}
			if (j - 1 >= 0 && j - 1 < n && i + 1 >= 0 && i + 1 < n && mat[i + 1][j - 1] == 1
					&& visited[i + 1][j - 1] != 1) 
			{
				counter++;
				DFS(mat, i + 1, j - 1);
			}
			if (j + 1 >= 0 && j + 1 < n && i - 1 >= 0 && i - 1 < n && mat[i - 1][j + 1] == 1
					&& visited[i - 1][j + 1] != 1) 
			{
				counter++;
				DFS(mat, i - 1, j + 1);
			}
			return counter;
		}
		return 0;
	}

}
