/**
 * 
 */
package com.kishore.anant.matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anant Kishore
 *
 */
public class CountConnections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] matrix = { { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 0, 1 } };
		List<Cordinate> connList = new ArrayList<Cordinate>();
		if (matrix != null) {
			int row = matrix.length - 1;
			int col = matrix[0].length - 1;

			for (int i = 0; i <= row; i++) {
				for (int j = 0; j <= col; j++) {
					if (matrix[i][j] == 1)
						checkConnection(matrix, i, j, row, col, connList);
				}
			}
		}
	}

	private static void checkConnection(int[][] matrix, int i, int j, int row, int col, List<Cordinate> connList) {

		if (i + 1 <= row && matrix[i + 1][j] == 1) {
			connList.add(new Cordinate(i + 1, j));
		}
		if (j + 1 <= col && matrix[i][j + 1] == 1) {
			connList.add(new Cordinate(i, j + 1));
		}
		if (i + 1 <= row && j + 1 <= col && matrix[i + 1][j + 1] == 1) {
			connList.add(new Cordinate(i + 1, j + 1));
		}
		if (i - 1 > -1 && j + 1 <= col && matrix[i - 1][j + 1] == 1) {
			connList.add(new Cordinate(i - 1, j + 1));
		}
	}

}

class Cordinate {

	int x;
	int y;

	public Cordinate(int xParam, int yParam) {
		this.x = xParam;
		this.y = yParam;
	}

	@Override
	public int hashCode() {
		return x * 19 + y * 31;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Cordinate) {
			Cordinate c = (Cordinate) o;
			if (this.x == c.x && this.y == c.y)
				return true;

		}
		return false;
	}

}