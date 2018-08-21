/**
 * 
 */
package com.microsoft.practice;

/**
 * @author i351596
 *
 */
public class PrintPatternWithoutLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int num = 16;
	
		printPattern(num, num, true);
		

	}
	
	static void printPattern(int num, int n1, boolean flag)
	{
		
		
		System.out.print(num+" ");
		if(flag == false && num == n1)
			return;
		
		if(num < 0)
			flag = !flag;
		
		if(flag)
		{
			printPattern(num-5, n1, flag);
		}
		else
		{
			printPattern(num+5, n1, flag);
		}
		
	}

}
