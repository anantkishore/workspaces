/**
 * 
 */
package com.kishore.anant.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Anant Kishore
 *
 */
public class BelzabarNumber {


	/**
	 * @param args
	 * 
	 * Belzabar completed 14 years of service, so to denote it on the number system, 
	 * there are some Belzabar numbers in the form of n(n-14) or n(n+14), where n is prime. 
	 * 
	 * So you have given the input X, find the count of all the Belzabar numbers less than or equal to X.
	 * 
		Bonus Ques: Print all the Belzabar numbers less than/equal to X.
	 */
	public static void main(String[] args) {
		
		int x = 1000;
		
		int[] prime = new int[x];
		int complexity = 0;
		
		for (int i = 1; i < prime.length; i++) {
			prime[i] = i;
			complexity++;
		}
		
		for(int i = 2; i < 100; i++)
		{
			if(i-1*i-1 > 100)
				break;
			
			int count = x/i;
			int k = 2;
			while(count > 0 && i*k < x)
			{
				prime[i*k] = -1;
				k++;
				count --;
				complexity++;
			}
		}
		
		List<Integer> primeList = new ArrayList<>();
		for (int i = 0; i < prime.length; i++) {
			if(prime[i] != -1 && prime[i] != 0)
			{
				primeList.add(prime[i]);
			}
			complexity++;
		}
		
		//System.out.println(primeList);
		int count = 0;
		Set<Integer> belzabarNumberset = new HashSet<>(); 
		primeList.forEach((i) -> {
			System.out.println(i);
			if(i > 13 && (i*(i-14)) < x)
				belzabarNumberset.add(i*(i-14));
			if((i*(i+14)) < x)
				belzabarNumberset.add(i*(i+14));
			
		});
		complexity += primeList.size();
		System.out.println(belzabarNumberset.toString());
		
		System.out.println(complexity/x);
	}

}
