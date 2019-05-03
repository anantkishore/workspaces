/**
 * 
 */
package com.kishore.anant.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anant Kishore
 *
 */
public class LengthOfTheLongestSubstring {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//code
		
			
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		StringBuilder sb = new StringBuilder();
		
		int inputs = Integer.parseInt(reader.readLine());
		
		for(int j = 0; j < inputs; j++)
		{
			String word = reader.readLine();
			Map<Character, Integer> characterMap = new HashMap<>();
			int maxLen = 0;
			
			for(int start = 0, end = 0; end < word.length(); end++)
			{
				char c = word.charAt(end);
				if(characterMap.get(c) != null && start < characterMap.get(c) + 1)
				{
					start = characterMap.get(c) + 1;
					characterMap.put(c, end);
				}
				else
				{
					maxLen = end-start+1 > maxLen ? end-start+1 : maxLen;
					characterMap.put(c, end);
				}
			}
			sb.append(maxLen + "\n");
		}
		System.out.println(sb.toString());
		
	
	}

}
