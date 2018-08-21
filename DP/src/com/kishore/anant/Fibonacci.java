/**
 * 
 */
package com.kishore.anant;

/**
 * @author i351596
 *
 */
public class Fibonacci {
	
	static int[] fib;

	/**
	 * 
	 */
	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int N = 40;
		fib = new int[N+1];
		long startTime = System.currentTimeMillis();
		System.out.println(fibRec(N));
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime));

	}
	
	static int fibRec(int N)
	{
		if(N <= 1)
		{
			return N;
		}
		else
		{
			return fibRec(N-1) + fibRec(N-2);
		}
		
	}
	
	static int fib(int n)
	{
		if(n <= 1)
		{
			fib[n] = n;
			return n;
		}
		else
		{
			if(fib[n-1] != 0 && fib[n-2] != 0)
				fib[n] = fib[n-1] + fib[n-2];
			else
				fib[n] = fib(n-1) + fib(n-2);
			return fib[n];
		}
	}

}
