/**
 * 
 */
package com.kishore.anant.matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Anant Kishore
 *
 */
public class CountPaths {

	static int sum = 0;

	public static void main(String[] args) {

		List<List<Integer>> a = new ArrayList<>();

		List<Integer> row1 = new ArrayList<>();
		List<Integer> row2 = new ArrayList<>();
		List<Integer> row3 = new ArrayList<>();

		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);

		row2.add(1);
		row2.add(1);
		row2.add(1);
		row2.add(1);

		row3.add(1);
		row3.add(1);
		row3.add(1);
		row3.add(1);

		a.add(row1);
		a.add(row2);
		a.add(row3);

		System.out.println(numberOfPaths(a));

	}

	private static int numberOfPaths(List<List<Integer>> a) {

		int row = a.size()-1;
		int col = a.get(0).size()-1;
		Set<String> pathSet = new HashSet<String>();

		findPaths(a, 0, 0, row, col, "", pathSet);

		System.out.println(pathSet.toString());
		return pathSet.size();
		
	}

	private static void findPaths(List<List<Integer>> a, int i, int j, int row, int col, String path, Set<String> pathSet) {
		
		if( i > row || j > col)
		{
			return;
		}
		else if (a.get(i).get(j) == 1) {
			path +=  "(" + i + "," + j +")";
			if(i == row && j == col) {
				pathSet.add(path);
			}
			else {
				findPaths(a , i + 1, j, row, col, path, pathSet);
				findPaths(a , i, j + 1, row, col, path, pathSet);
				//findPaths(a , i + 1, j + 1, row, col, path, pathSet);
			}
		}
	}
}
		
//	}
//
//	public static boolean findPath1(int i, int j, int row, int col)
//	{
//		return i < row && j < col && i > -1 && j > -1;
//	}
//
//	private static int findIsland(int[][] mat, int i, int j, int row, int col, boolean[][] visited) {
//
//		if(!visited[i][j])
//		{
//			sum += 1;
//			visited[i][j] = true;
//			
//			if(isValid(i, j-1, row, col) && mat[i][j-1] == 1)
//			{
//				findIsland(mat, i, j-1, row, col, visited);
//			}
//			if(isValid(i, j+1, row, col) && mat[i][j+1] == 1)
//			{
//				findIsland(mat, i, j+1, row, col, visited);
//			}
//			if(isValid(i-1, j, row, col) && mat[i-1][j] == 1)
//			{
//				findIsland(mat, i-1, j, row, col, visited);
//			}
//			if(isValid(i+1, j, row, col) && mat[i+1][j] == 1)
//			{
//				findIsland(mat, i+1, j, row, col, visited);
//			}
//			if(isValid(i+1, j-1, row, col) && mat[i+1][j-1] == 1)
//			{
//				findIsland(mat, i+1, j-1, row, col, visited);
//			}
//			if(isValid(i-1, j-1, row, col) && mat[i-1][j-1] == 1)
//			{
//				findIsland(mat, i-1, j-1, row, col, visited);
//			}
//			if(isValid(i-1, j+1, row, col) && mat[i-1][j+1] == 1)
//			{
//				findIsland(mat, i-1, j+1, row, col, visited);
//			}
//			if(isValid(i+1, j+1, row, col) && mat[i+1][j+1] == 1)
//			{
//				findIsland(mat, i+1, j+1, row, col, visited);
//			}
//			if(isValid(i-1, j+1, row, col) && mat[i-1][j+1] == 1)
//			{
//				findIsland(mat, i-1, j+1, row, col, visited);
//			}
//		}
//		
//		return sum;
//	}


