/**
 * 
 */
package com.kishore.anant.string;

/**
 * @author Anant Kishore
 *
 */
public class ZAlgorithm {

	/**
	 * 
	 */
	public ZAlgorithm() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		String text = "GEEKS FOR GEEKS";
	    String pattern = "GEEK";
	  
	    search(text, pattern);
	    
	}

	private static void search(String text, String pattern) {
		
		getZArray(text,pattern);
		
	}

	private static void getZArray(String text, String pattern) {
		
		String word = pattern + "$" + text;
		
		int len = word.length();
		
		int[] Z = new int[len];
		
		int L=0, R =0;
		
		for(int i = 1; i < len; i++)
		{
			if(i > R)
			{
				L = R = i;
				
				while(R < len && word.charAt(R-L) == word.charAt(R))
					R++;
				
				Z[i] = R-L;
				R--;
				
			}
			else
			{
				
			}
			
		}
		
		
	}

}
