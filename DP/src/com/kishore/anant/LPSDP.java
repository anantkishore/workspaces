/**
 * 
 */
package com.kishore.anant;

/**
 * @author i351596
 *
 */
public class LPSDP {

	/**
	 * 
	 */
	public LPSDP() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		char[] text = "BABCBAB".toCharArray();
		
		System.out.println(findLPSDP(text, 0, text.length-1));

	}

	private static int findLPSDP(char[] text, int i, int n) {
		
		if(i < n)
		{
			if(text[i] == text[n])
		
			return 2 + findLPSDP(text, i+1, n-1);
		else
			return Math.max(findLPSDP(text, i+1, n), findLPSDP(text, i, n-1));
		}
		else if(i == n)
			return 1;
		else 
			return 0;
		
	}

}
