package com.kishore.anant.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MaximumAllSubarraysOfSizeK {

	/*
	 *  2
		9 3
		1 2 3 1 4 5 2 3 6
		10 4
		8 5 10 7 9 4 15 12 90 13
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {

			InputStreamReader isr = new InputStreamReader(System.in);
			
			BufferedReader reader = new BufferedReader(isr);
			
			StringBuilder sb = new StringBuilder();
			
			int size = Integer.parseInt(reader.readLine());
			
			for(int j= 0; j < size; j++)
			{
				String[] inputs = reader.readLine().split(" ");
				
				int aSize =  Integer.parseInt(inputs[0]);
				int sSize = Integer.parseInt(inputs[1]);
				
				int[] sortedArray = new int[sSize];
				
				int[] arr = new int[aSize];
				inputs = reader.readLine().split(" ");
				for (int i = 0; i < aSize; i++) {
					arr[i] = Integer.parseInt(inputs[i]);
				}
				
				int max = Integer.MIN_VALUE;
				int maxIndex = 0;
				
				for(int i = 0; i < sSize; i++)
				{
					insertInSortedArray(sortedArray, arr[i]);
				}
				
				for(int i = 0; i < sSize; i++)
				{
					sb.append(max +" ");
				}
				
				for(int i =sSize; i < aSize; i++)
				{
					if(maxIndex == sSize)
				}
				
			}
	}

	private static void insertInSortedArray(int[] sortedArray, int i) {
		
		findPosition(sortedArray, )
		
	}
	private static void removeFromSortedArray(int[] sortedArray, int i) {
		
	}

}
