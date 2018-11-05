package com.kishore.anant.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextGreaterElement {

	public NextGreaterElement() {
	}

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		StringBuffer sb = new StringBuffer();
		int input = Integer.parseInt(reader.readLine());
		for (int j = 0; j < input; j++) {
			int k = Integer.parseInt(reader.readLine());
			int[] arr = new int[k];
			String[] inputs = reader.readLine().split(" ");

			for (int i = 0; i < k; i++) {
				arr[i] = Integer.parseInt(inputs[i]);
			}
			
			Stack<Integer> s = new Stack<Integer>(); 
			int[] nextGreatestNum = new int[k];
			
			for(int i = 0; i < k; i++)
			{
				int temp = arr[i];
				while(!s.isEmpty() && arr[s.peek()] < temp)
				{
					int index = s.pop();
					nextGreatestNum[index] = temp; 
				}
				s.push(i);
			}
			while(!s.isEmpty())
			{
				int i = s.pop();
				nextGreatestNum[i] = -1;
			}
			for (int i = 0; i < k; i++) {
				sb.append(nextGreatestNum[i]);
			}
			sb.append("\n");
			
		}
		System.out.println(sb.toString());
		reader.close();
	}
}
