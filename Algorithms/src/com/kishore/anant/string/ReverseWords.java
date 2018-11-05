package com.kishore.anant.string;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {

		String sentence = "My Name Is Anant Kishore";
		int len = sentence.length();
		char[] arr = new char[len];
		
		int startIndex = 0;
		for(int i = 0; i < len; i++)
		{
			if(sentence.charAt(i) == ' ')
			{
				while(i-startIndex > 0)
				{
					arr[len-i+1] = sentence.charAt(startIndex);
					startIndex += 1;
				}
				
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
