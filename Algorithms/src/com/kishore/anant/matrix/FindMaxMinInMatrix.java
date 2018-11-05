/**
 * 
 */
package com.kishore.anant.matrix;

/**
 * @author Anant Kishore
 *
 */
public class FindMaxMinInMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int sum = 0;
		int[][] matrix = { { 1, 1, 4 }, { 5, 2, 9 }, { 8, 7, 6 } };

		if (matrix != null) {
			int row = matrix.length - 1;
			int col = matrix[0].length - 1;

			for (int i = 0; i <= row; i++) {
				for (int j = 0; j <= col; j++) {
					int result = checkMaxorMin(matrix, i, j, row, col);
					if (result == 0) {
						sum++;
					} else if (result == 1) {
						continue;
					} else {
						System.out.println(-1);
					}
				}
				System.out.println(sum);
			}
		}
	}
	
	

	private static int checkMaxorMin(int[][] matrix, int i, int j, int row, int col) {

		int item = matrix[i][j];
		int minMaxFound = 0;
		boolean candidate = false;
		int count = 0;
		// check min in col
		for (int k = 0; k <= row; k++) {
			if (item > matrix[k][j]) {
				minMaxFound = 1;
				break;
			} else if (item == matrix[k][j]) {
				count++;
			}
		}
		if (count > 1)
			return 2;
		if (minMaxFound == 0)
			candidate = true;

		minMaxFound = 0;
		count = 0;

		// check min in row
		for (int l = 0; l <= col; l++) {
			if (item > matrix[i][l]) {
				minMaxFound = 1;
				break;
			} else if (item == matrix[i][l]) {
				count++;
			}
		}
		if (count > 1)
			return 2;
		if (minMaxFound == 0)
			candidate = true;

		minMaxFound = 0;
		count = 0;

		// check max in row
		for (int l = 0; l <= col; l++) {
			if (item < matrix[i][l]) {
				minMaxFound = 1;
				break;
			} else if (item == matrix[i][l]) {
				count++;
			}
		}
		if (count > 1)
			return 2;
		if (minMaxFound == 0)
			candidate = true;

		minMaxFound = 0;
		count = 0;

		// check max in column
		for (int k = 0; k <= row; k++) {
			if (item < matrix[k][j]) {
				minMaxFound = 1;
				break;
			} else if (item == matrix[k][j]) {
				count++;
			}
		}
		if (count > 1)
			return 2;
		
		if(candidate)
			return 0;

		return minMaxFound;
	}

}
