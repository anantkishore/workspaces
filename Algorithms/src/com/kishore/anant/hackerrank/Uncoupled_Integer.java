/**
 * 
 */
package com.kishore.anant.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author i351596
 *
 */
public class Uncoupled_Integer {

	/**
	 * 
	 */
	public Uncoupled_Integer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String line = reader.readLine();
		
		String[] values = line.split(",");
		
		int intValue = 0;
		for(String value : values)
		{
			intValue ^= Integer.parseInt(value.trim());
		}
		System.out.print(intValue);
		reader.close();
		
	}

}
