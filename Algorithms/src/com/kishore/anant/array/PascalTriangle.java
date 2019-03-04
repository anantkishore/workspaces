/**
 * 
 */
package com.kishore.anant.array;

import java.util.ArrayList;

/**
 * @author Anant Kishore
 *
 */
public class PascalTriangle {

	public static void main(String[] args) {

		int N = 5;

		ArrayList<ArrayList<Integer>> pascalList = new ArrayList<>();

		ArrayList<Integer> prevList = new ArrayList<>();

		ArrayList<Integer> prevList0 = new ArrayList<>();

		prevList0.add(1);

		pascalList.add(prevList0);

		prevList.add(1);
		prevList.add(1);

		pascalList.add(prevList);

		int count = 2;
		int j = 2;
		while (count < N) {
			ArrayList<Integer> newList = new ArrayList<>();
			int i = 0;
			newList.add(i++, 1);
			newList.add(i++, j++);

			for (i = 2; i < count; i++) {
				newList.add(i, prevList.get(i - 1) + prevList.get(i));
			}
			newList.add(i, 1);
			pascalList.add(newList);
			prevList = newList;
			count++;
		}

		for (ArrayList<Integer> list : pascalList) {
			System.out.println(list.toString());
		}

	}

}
