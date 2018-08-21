/**
 * 
 */
package com.kishore.anant;

/**
 * @author i351596
 *
 */
public class LCS {

	/**
	 * 
	 */
	public LCS() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		char[] text1 = "AGGTAB".toCharArray();
		char[] text2 = "GXTXAYB".toCharArray();
		
		System.out.println(findLCS(text1, text2, text1.length-1, text2.length-1));

	}

	private static int findLCS(char[] text1, char[] text2, int l1, int l2) {
		
		if(l1 >= 0 && l2 >= 0)
		{
			if(text1[l1] == text2[l2])
			{
				return 1 + findLCS(text1, text2, l1-1, l2-1);
			}
			else
			{
				return Math.max(findLCS(text1, text2, l1-1, l2), findLCS(text1, text2, l1, l2-1));
			}
		}
		return 0;
	}

}
