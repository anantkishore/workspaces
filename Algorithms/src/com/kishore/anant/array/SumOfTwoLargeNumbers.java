/**
 * 
 */
package com.kishore.anant.array;

/**
 * @author Anant Kishore
 *
 */
public class SumOfTwoLargeNumbers {

	public static void main(String[] args) {
		
		String str1 = "3333311111111111";
		String str2 =   "44422222221111";
		
		String revStr1 = reverseString(str1);
		String revStr2 = reverseString(str2);
		StringBuilder sb = new StringBuilder();
		
		int min = str1.length() > str2.length() ? str2.length() : str1.length();
		
		int carry = 0;
		int rem = 0;
		for(int i = 0; i < min; i++)
		{
			int digit1 = revStr1.charAt(i)-48;
			int digit2 = revStr2.charAt(i)-48;
			
			rem = digit1+digit2%10;
			
			if(carry > 0 && rem+1 > 10)
				sb.append(0);
			else if(carry > 0)
				sb.append(rem+1);
			else
				sb.append(rem);
			carry = (digit1+digit2)/10;
			
		}
		if(carry > 0)
			sb.append(carry);
		System.out.println(sb.reverse());
		
		
	}
	
	public static String reverseString(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}

}
