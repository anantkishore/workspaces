/**
 * 
 */
package com.kishore.anant;

import java.util.Arrays;

/**
 * @author i351596
 *
 */
public class LCSDynamic {

	/**
	 * 
	 */
	public LCSDynamic() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		char[] text1 = "AGGTAB".toCharArray();
		char[] text2 = "GXTXAYB".toCharArray();
		
		System.out.println(findLCSDP(text1, text2, text1.length, text2.length));
		
	}

	private static int findLCSDP(char[] text1, char[] text2, int l1, int l2) {
		
		int[][] table = new int[l2+1][l1+1];
		
		for(int i =0; i < l1+1; i ++)
		{
			table[0][i] = 0;
			table[i][0] = 0;
		}
		
		for(int i = 0; i < l2; i++)
		{
			for(int j = 0; j < l1; j++)
			{
			    if(text1[j] == text2[i])
				{
					table[i+1][j+1] = 1 + table[i][j];
				}
				else
				{
					table[i+1][j+1] = Math.max(table[i][j+1] , table[i+1][j]);
				}
			}
		}
		
		System.out.println(returnLCS(table, l2 , l1, text1, text2));
		return table[l2][l1];
		
		
	}
	
	public static char[] returnLCS(int[][] table, int l2, int l1, char[] text1, char[] text2)
	{
		
		char[] charArr = new char[l2 > l1 ? l2 : l1];
		Arrays.fill(charArr, ' ');
		
		while(l2 >= 1 && l1 >= 1)
		{
			if(table[l2][l1] > table[l2][l1-1] && table[l2][l1] > table[l2-1][l1])
			{
				charArr[l2-1] = text1[l1-1];
				l2 = l2 - 1;
				l1 = l1 - 1;
			}
			else
			{
				l2 = l2 - 1;
			}
		}
		
		return charArr;
	}

}
