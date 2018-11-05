/**
 * 
 */
package com.kishore.anant.array;

import java.util.Stack;

/**
 * @author Anant Kishore
 *
 */
public class SortStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(11);
		s.push(2);
		s.push(32);
		s.push(3);
		s.push(41);
		sort(s);
		System.out.println(s.toString());
	}

	public static void sort(Stack<Integer> s) {
		Stack<Integer> temp = new Stack<Integer>();
		while (!s.isEmpty()) {
			int item = s.pop();
			int count = 0;
			while (!temp.isEmpty() && temp.peek() < item) {
				s.push(temp.pop());
				count++;
			}
			temp.push(item);
			while (!s.isEmpty() && count > 0) {
				temp.push(s.pop());
				count--;
			}
		}
		while(!temp.isEmpty())
		{
			s.push(temp.pop());
		}
	}
}
