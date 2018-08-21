/**
 * 
 */
package com.kishore.anant.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author i351596
 *
 */
public class Balanced_Delimiters {

	/**
	 * 
	 */
	public Balanced_Delimiters() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String line = reader.readLine();

		char[] charArr = line.toCharArray();

		int len = charArr.length;
		int counter = 0;
		Stack<Character> stack = new Stack<>();

		Map<Character, Character> charMap = new HashMap<>();
		charMap.put('(', ')');
		charMap.put('[', ']');
		charMap.put('{', '}');

		while (counter < len) {
			char temp = charArr[counter];
			if (!stack.empty() && temp == charMap.get(stack.peek())) {
				stack.pop();
			}
			else 
			{
				stack.push(temp);
			}
			counter++;
		}
		if(stack.size() == 0)
			System.out.println("True");
		else
			System.out.println("False");
	}
}