/**
 * 
 */
package com.kishore.anant.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Anant Kishore
 *
 */
public class LargestNumber {

	public static void main(String[] args) {
		final List<Integer> A = new ArrayList<Integer>();
		A.add(3);
		A.add(30);
		A.add(34);
		A.add(5);
		A.add(9);
		Collections.sort(A, new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				if (i1 instanceof Integer && i2 instanceof Integer) {
					String first = i1.toString() + i2.toString();
					String second = i2.toString() + i1.toString();
					return second.compareTo(first);
				}
				return 1;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		boolean zero = true;
		for(Integer i: A)
		{
			if(i > 0)
			{
				zero = false;
			}
			sb.append(i);
		}
		if(zero)
			return "0";
		System.out.println(sb.toString());
	}

}
