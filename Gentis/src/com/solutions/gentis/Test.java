/**
 * 
 */
package com.solutions.gentis;

/**
 * @author i351596
 *
 */
public class Test {

	
	public enum Days {SUN, MON, TUE, WED, THUR, FRI, SAT}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int c = printFibonacci(12);
		
		//System.out.println(c);
		
		switch(Enum.valueOf(enumType, name))
		

	}
	
	static int printFibonacci(int n){    
		int a = 0, b =1 , c =1;
		for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            
        }
	    return a;       
	      
	 }    

}
