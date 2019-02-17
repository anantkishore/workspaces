/**
 * 
 */
package com.kishore.anant.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Anant Kishore
 *
 */
public class SubarrayWithGivenSum1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		

	    
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader reader = new BufferedReader(isr);
	    StringBuffer sb = new StringBuffer();
	    int input = Integer.parseInt(reader.readLine());
	    
	    for(int j = 0; j < input; j++)
	    {
	        String line = reader.readLine();
	        String[] numbers = line.split(" ");
	        
	        int size = Integer.parseInt(numbers[0]);
	        int sum = Integer.parseInt(numbers[1]);
	        
	        line = reader.readLine();
	        numbers = line.split(" ");
	        
	        int[] arr = new int[size];
	        for(int i = 0; i < size; i++)
	        {
	            arr[i] = Integer.parseInt(numbers[i]);
	        }
	        
	        int low = 0, high = 0, currSum = 0;
	        boolean flag = false;
	        
	        while(low < size)
	        {
	            if(currSum == sum)
	            {
	                flag = true;
	                sb.append(low+1 + " ");
	                sb.append(high + "\n");
	                break;
	            }
	            else if(currSum > sum)
	            {
	                currSum -= arr[low];
	                low++;
	            }
	            else
	            {
	            	if(high < size)
	            		{
	            		currSum += arr[high];
	            		high++;
	            		}
	            }
	            
	        }
	        while()
	        if(!flag)
	            sb.append("-1\n");
	    }
	    System.out.println(sb.toString());
	    reader.close();
	}

}
