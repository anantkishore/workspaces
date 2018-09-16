/**
 * 
 */
package com.kishore.anant.vmware;

/**
 * @author Anant Kishore
 *
 */
public class BooleanMatrixQuestion {

	public static void main(String[] args) {

		int[][] mat = { { 1, 0, 0, 1 }, 
						{ 0, 0, 1, 0 },
						{ 0, 0, 0, 0 } };

		int row = mat.length;
		int col = mat[0].length;

		int[] colTable = new int[col];
		int[] rowTable = new int[row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (mat[i][j] == 1) {
					rowTable[i] = 1;
					colTable[j] = 1;
				}
			}
		}

		for (int i = 0; i < row; i++) {
			if (rowTable[i] == 1) {
				for (int j = 0; j < col; j++) {
					mat[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < col; i++) {
			if (colTable[i] == 1) {
				for (int j = 0; j < row; j++) {
					mat[j][i] = 1;
				}
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println(mat[i][j]);
			}
			System.out.println();

		}

	}

}
