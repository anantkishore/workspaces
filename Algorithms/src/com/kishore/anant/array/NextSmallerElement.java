/**
 * 
 */
package com.kishore.anant.array;

import java.util.Stack;

/**
 * @author Anant Kishore
 *
 */
public class NextSmallerElement {

	public static void main(String[] args) {
		
		int[] arr = {6, 2, 5, 4, 5, 1, 6};
		
		nextSmallerElement(arr);
	}

	private static int[] nextSmallerElement(int[] arr) {
		
		Stack<Integer> s = new Stack<>();
		int[] temp = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			int item = arr[i];
			while(!s.isEmpty() && arr[s.peek()] > item)
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
		for(int i = 0; i < temp.length; i++)
		{
			int index = temp[i];
			if(index > -1)
				System.out.print(arr[temp[i]]+ " ");
			else
				System.out.print(-1+ " ");
		}
		return temp;
	}
}
