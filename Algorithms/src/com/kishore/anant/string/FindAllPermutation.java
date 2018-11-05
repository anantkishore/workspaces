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
public class FindAllPermutation {
	
	private static Set<String> set = new HashSet<>();

	public static void main(String[] args) {
		
		char[] str = "abc".toCharArray();
		findPermutations(0, str.length-1, str);
		System.out.println(set.size());
	}

	private static void findPermutations(int l, int r, char[] str) {
		
		if(l == r)
			set.add(new String(str));
		else
		{
			for (int i = l; i <= r; i++) 
			{
				char[] temp = swap(new String(str), l, i);
				findPermutations(l+1, r, temp);
				temp = str;
			}
		}
	}

	private static char[] swap(String str, int i, int j) {
		char[] temp = str.toCharArray();
		char c = temp[i];
		temp[i] = temp[j];
		temp[j] = c;
		return temp;
	}

}
