/**
 * 
 */
package com.kishore.anant.matrix;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Anant Kishore
 *
 */
public class BinaryMaze {

	public static void main(String[] args) 
	{
		int[][] arr = {
					   {1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
			           {1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
			           {1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
			           {0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
			           {1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
			           {1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
			           {1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			           {1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
			           {1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }
			           };
		
		int[] src = {0, 0};
		int[] dest = {3, 4};
		
		ConcurrentHashMap<K, V>
		
		System.out.println(findShortestPath(dest[0], dest[1], row, col, arr));
		
		
	}
	
	static
		int[][] arr = {

				{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 }, { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 } };
	
	static 	int row = arr.length;
	
	static	int col = arr[0].length;
	
	
	private static boolean isValid(int i, int j)
	{
		return i < row && i > -1 && j < col && j > -1;
	}

	private static int findShortestPath(int destX, int destY, int row, int col, int[][] mat) {
		
		Queue<Point> q = new LinkedBlockingQueue<>();
		q.add(new Point(0, 0, 0));
		
		boolean[][] visited = new boolean[row][col];
		
		while(!q.isEmpty())
		{
			Point p = q.peek();
			
			if(p.x == destX && p.y == destY)
			{
				return p.dist;
			}
			
			q.remove();
			
			int[] rowNum = {-1, 0, 0, 1};
			int[] colNum = {0, -1, 1, 0};
			
			for(int i = 0; i < 4; i++)
			{
				int x = p.x + rowNum[i];
				int y = p.y + colNum[i];
				
				if(isValid(x, y) && !visited[x][y] && mat[x][y] == 1)
				{
					visited[x][y] = true;
					q.add(new Point(x, y, p.dist+1));
				}
			}
		}
		return Integer.MIN_VALUE;
	}

}

class Point {

	int x;
	int y;
	int dist;

	public Point(int x, int y, int dist) {
		this.x = x;
		this.y = y;
		this.dist = dist;
	}

}