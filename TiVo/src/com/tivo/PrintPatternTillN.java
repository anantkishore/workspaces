/**
 * 
 */
package com.tivo;

/**
 * @author i351596
 *
 */
public class PrintPatternTillN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n = 11;
		
		for(int i = 1; i < n; i++)
		{
			
			for(int j = 0; j < i; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
