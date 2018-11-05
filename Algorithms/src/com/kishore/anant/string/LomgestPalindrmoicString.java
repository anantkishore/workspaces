/**
 * 
 */
package com.kishore.anant.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Anant Kishore
 *
 */
public class LomgestPalindrmoicString {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
	    
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader reader = new BufferedReader(isr);
	    StringBuffer sb = new StringBuffer();
	    
	    String inputs = reader.readLine();
	    String word = reader.readLine();
	    int maxLength = Integer.MIN_VALUE;
	    for(int i = 0; i < word.length(); i++)
	    {
	        for(int j = i+1; j <= word.length(); j++)
	        {
	            String substring = word.substring(i,j);
	            if(isPalindrome(substring) && substring.length() > maxLength)
	            {
	                sb = new StringBuffer(); 
	                sb.append(substring);
	                maxLength = substring.length();
	            }
	        }
	    }
	    System.out.println(sb.toString());
	    reader.close();
	}
	
	public static boolean isPalindrome(String word)
	{
		int len = word.length();
		if(len == 1)
			return true;
	    for(int i = 0, j = len-1; i < j+1; i++,j--)
	    {
	        if(word.charAt(i) == word.charAt(j))
	        {
	            
	        }
	        else
	            return false;
	    }
	    return true;
	}
}