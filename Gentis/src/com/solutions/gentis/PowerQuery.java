package com.solutions.gentis;

/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class PowerQuery {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input */

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner s = new Scanner(br);
        int lines = s.nextInt();//br.readLine();                // Reading input from STDIN
        
        long number1, number2, lower=0, higher=0, prev, next;
        //Scanner
        
        int[] result = new int[63];
        
        int lowerIndex = 0;
        int higherIndex = 0;
        while(lines > 0)
        {
            
            number1 = s.nextLong();                 // Reading input from STDIN
            number2 = s.nextLong();
            
            for(int i = 0; i < 64; i++)
            {
                prev = (long) Math.pow(2,i);
                next = (long) Math.pow(2,i+1);
                if( number1 > prev && number1 < next)
                {
                   
                    lowerIndex = i+1;
                    
                }
                if( number2 > prev && number2 < next)
                {
                    higherIndex = i;
                }
                //System.out.println("prev: " +  prev + " next: "+ next);    // Writing output to STDOUT
            }
            createBinaryNumber(lowerIndex, higherIndex);
            lines--;
        }
    }
    
    public static void createBinaryNumber(int i, int j)
    {
    	long result = 0;
    	for(int k = i; k <= j; k++)
    	{
    		result += Math.pow(2, k);
    	}
    	System.out.println(result);    // Writing output to STDOUT
    }
}
