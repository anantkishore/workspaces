/**
 * 
 */
package com.kishore.anant.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anant Kishore
 *
 */
public class LongestNonRepeatingSubstring {
	public static void main(String[] args) {

		String str = "geeksforgeeks";
		System.out.println(findLongestNonRepeatingSubtring(str));
		str = "abcdac";
		System.out.println(findLongestNonRepeatingSubtring(str));;
		
		
	}
	
	private static String findLongestNonRepeatingSubtring(String str)
	{
		Set<Character> set = new HashSet<>();
		String substr = "";
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (set.add(c)) {
				sb.append(c);
			} else {
				if (substr.length() < sb.length()) {
					substr = sb.toString();
				}
				int repeatedIndex = 0;
				for (int j = 0; j < sb.length(); j++) {
					char temp = sb.charAt(j);
					if (temp == c) {
						repeatedIndex = j;
						break;
					}
					set.remove(temp);
				}
				sb.append(c);
				sb.replace(0, repeatedIndex+1, "");
			}
		}
		return substr;
	}

}
