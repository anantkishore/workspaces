/**
 * 
 */
package com.kishore.anant.array;

import java.util.Stack;

/**
 * @author Anant Kishore
 *
 */
public class LargestRectangularAreaInHistogram {

	public static void main(String[] args) {
		int[] arr = { 6, 2, 5, 4, 5, 1, 6 };

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
		System.out.println(maxArea);
		
		
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
