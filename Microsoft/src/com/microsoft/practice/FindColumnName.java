/**
 * 
 */
package com.microsoft.practice;

/**
 * @author i351596
 *
 */
public class FindColumnName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int[] arr = {26, 51, 52, 80, 676, 702, 705};
		
		for(int i = 0; i < arr.length; i++)
		{
			StringBuilder sb = new StringBuilder();
			findColumnName(sb, arr[i]);
			System.out.println(sb.reverse().toString());	
		}
	}
	
	private static void findColumnName(StringBuilder sb, int num) {
		
		int rem = 0;
		
		while(num > 0)
		{			
			rem = num % 26;
			
			if(rem == 0) {
				sb.append('Z');
				num = num/26-1;
			}
			else {
				sb.append((char) (rem-1 + 'A'));
				num /= 26;
			}
		}
	}


}
