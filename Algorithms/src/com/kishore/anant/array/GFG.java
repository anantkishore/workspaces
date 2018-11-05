/**
 * 
 */
package com.kishore.anant.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author Anant Kishore
 *
 */
public class GFG {
public static void main(String[] args) throws IOException {
	    
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader reader = new BufferedReader(isr);
	    StringBuffer sb = new StringBuffer();
	    int input = Integer.parseInt(reader.readLine());
	    for(int j = 0; j < input; j++)
	    {
	        
	        int size = Integer.parseInt(reader.readLine());
	        
	        String[] numbers = reader.readLine().split(" ");
	        int[] arr = new int[size];
	        
	        for(int i = 0; i < size; i++)
	        {
	            arr[i] = Integer.parseInt(numbers[i]);
	            
	        }
	        int[] right = findSmallerinRight(arr);
		int[] left = findSmallerinLeft(arr);
		int maxArea = -1;
		for(int i = 0; i < arr.length; i++)
		{
			int rightMin = right[i];
			int leftMin = left[i];
			if(rightMin == -1 && leftMin == -1 && maxArea < arr[i]*arr.length)
			{
				maxArea = arr[i]*arr.length;
			}
			else if(leftMin == -1 && maxArea < (arr[i]* (rightMin-i) + arr[i]*(i)))
			{
				maxArea = arr[i]* (rightMin-i) + arr[i]*(i);
			}
			else if(rightMin == -1 && maxArea < (arr[i]* ( leftMin - i + 1) + arr[i] * (arr.length-i)))
			{
				maxArea = arr[i]* ( leftMin - i + 1) + arr[i] * (arr.length-i);
			}
			else {
				if(maxArea < arr[i] * (rightMin-i + i-leftMin - 1))
				{
					maxArea = arr[i] * (rightMin-i + i-leftMin - 1);
				}
			}
		}
		sb.append(maxArea+"\n");
		}
	    System.out.println(sb.toString());
	    reader.close();
	}

	private static int[] findSmallerinRight(int[] arr) {

		Stack<Integer> s = new Stack<>();
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int item = arr[i];
			while (!s.isEmpty() && arr[s.peek()] > item)
			{
				int index = s.pop();
				temp[index] = i;
			}
			s.push(i);
		}
		while(!s.isEmpty())
		{
			int index = s.pop();
			temp[index] = -1;
		}
		return temp;
	}
	
	private static int[] findSmallerinLeft(int[] arr) {

		Stack<Integer> s = new Stack<>();
		int[] temp = new int[arr.length];
		for (int i = arr.length-1; i > -1; i--) {
			int item = arr[i];
			while (!s.isEmpty() && arr[s.peek()] > item)
			{
				int index = s.pop();
				temp[index] = i;
			}
			s.push(i);
		}
		while(!s.isEmpty())
		{
			int index = s.pop();
			temp[index] = -1;
		}
		return temp;
	}
}
