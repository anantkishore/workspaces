/**
 * 
 */
package com.kishore.anant.vmware;

import java.util.Scanner;

/**
 * @author Anant Kishore
 *
 */
public class Armstrong_Numbers {


	public static void main (String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    for(int i = 0; i < n; i++)
	    {   
	        int x = sc.nextInt();
	        System.out.println(checkArmstrong(x));
	    }
	    sc.close();
	    
	}
	
	static boolean checkArmstrong(int number)
	{
	    int n = number, x = number, count = 1;
	    
	    while( x > 10 )
	    {
	        x = x / 10;
	        count++;
	    }
	    
	    int rem = 0;
	    int sum = 0;
	    
	    while(n > 0)
	    {
	        rem = n % 10;
	        sum += Math.pow( rem, count);
	        n = n / 10;
	    }
	    
	    if(sum == number)
	        return true;
	    return false;
	    }
	

}
