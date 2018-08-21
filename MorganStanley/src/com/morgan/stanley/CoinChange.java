package com.morgan.stanley;

public class CoinChange {

	public static void main(String[] args) {
		
		int n = 10;
		int[] s = {2,3, 5, 6};
		int m = s.length;
		
		System.out.println(count(s, m ,n));;

	}

	private static int count(int[] s, int m, int n) {
		
		if(n < 0)
			return 0;
		if(n==0)
			return 1;
		if(m <=0 && n >0)
			return 0;
		
		return count(s, m-1, n) + count(s, m, n-s[m-1]);
		
		
	}

}
