/**
 * 
 */
package com.kishore.anant.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Anant Kishore
 *
 */
public class SearchInAMatrix {

	/*
	 * 2 9 3 1 2 3 1 4 5 2 3 6 10 4 8 5 10 7 9 4 15 12 90 13
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader reader = new BufferedReader(isr);

		StringBuilder sb = new StringBuilder();

		int size = Integer.parseInt(reader.readLine());

		for (int k = 0; k < size; k++) {
			String[] inputs = reader.readLine().split(" ");

			int row = Integer.parseInt(inputs[0]);
			int col = Integer.parseInt(inputs[1]);

			int[][] arr = new int[row][col];

			inputs = reader.readLine().split(" ");

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					arr[i][j] = Integer.parseInt(inputs[i*4+j]);
				}
			}
			
			int X = Integer.parseInt(reader.readLine());
			
			int result = searchInASortedMatrix(arr, row, col, X);
			
			System.out.println(result);

		}
	}
	
	public static int searchInASortedMatrix(int[][] arr, int row, int col, int X) {
			
		int i = row-1; int j=col-1;
		while(i >= 0 && j >= 0) {
			
			if(arr[i][j] == X)
			{
				return 1;
			}
			else if(arr[i-1][j-1] > X)
			{
				j--;i--;
			}
			else
			{
				i--;
			}
				
		}
		return 0;
	}

}
