/**
 * 
 */
package com.kishore.anant.array;

/**
 * @author Anant Kishore
 *
 */
public class FindFirstMissingPositiveInteger {

	public static void main(String[] args) {
		
		int[] arr= {1,2,-1};
		int nextSmallest=1;
		int nextLargest=1;
		int largest=1;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
				{
				if(largest<arr[i])
					largest=arr[i];
			
				nextLargest=arr[i]-1;
				
				
				}
			
			
		}
		/*
		
		byte[] arr = new byte[100];
		
		for(int i = 0; i < 800; i++)
		{
			int index = i/8;
			arr[0] = &i;
		}
		
		*/
	}

}
