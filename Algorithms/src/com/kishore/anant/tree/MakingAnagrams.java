/**
 * 
 */
package com.kishore.anant.tree;

public class MakingAnagrams {

	public static void main(String[] args) {
		makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
	}

	static int makeAnagram(String a, String b) {

		int count = 0;
		int[] charArr = new int[26];
		if (a.length() > b.length()) {
			for (int i = 0; i < a.length(); i++) {
				char c = a.charAt(i);
				charArr[c - 97] += 1;
			}
			for (int i = 0; i < b.length(); i++) {
				char c = b.charAt(i);
				int intVal = charArr[c - 97];
				if (intVal > 0)
					charArr[c - 97] -= 1;
				else
					charArr[c - 97] += 1;
			}
		} else {
			for (int i = 0; i < b.length(); i++) {
				char c = b.charAt(i);
				charArr[c - 97] += 1;
			}
			for (int i = 0; i < a.length(); i++) {
				char c = a.charAt(i);
				int intVal = charArr[c - 97];
				if (intVal > 0)
					charArr[c - 97] = 0;
				else
					charArr[c - 97] += 1;
			}
		}
		for (int i = 0; i < charArr.length; i++) {
			count += charArr[i];
		}
		return count;
	}
}
