/**
 * 
 */
package com.morgan.stanley;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author i351596
 *
 */
public class MinimumDistinctIds {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < testCases; i++) {
			int length = scanner.nextInt();
			int[] arr = new int[length];

			for (int j = 0; j < length; j++) {
				arr[j] = scanner.nextInt();
				if (!map.containsKey(arr[j])) {
					map.put(arr[j], 1);
				} else {
					map.put(arr[j], map.get(arr[i]) + 1);
				}
			}
			Set<Entry> entrySet = new TreeSet<>();

			Set<Integer> keySet = map.keySet();
			Iterator iterator = keySet.iterator();

			int M = scanner.nextInt();

			while (iterator.hasNext()) {
				int key = (int) iterator.next();
				int value = map.get(key);
				entrySet.add(new MinimumDistinctIds().new Entry(key, value));
			}

			iterator = entrySet.iterator();
			int count = 0;
			while (iterator.hasNext() && M != 0) {
				Entry e = (Entry) iterator.next();
				if(e.freq > 1)
				{
					M = M - e.freq + 1;
					count++;
				}
			}
			System.out.println(count);
		}
		scanner.close();

	}

	class Entry implements Comparable<Object> {

		int id;
		int freq;

		public Entry(int idParam, int freqParam) {
			this.id = idParam;
			this.freq = freqParam;
		}

		@Override
		public int compareTo(Object o) {
			return this.freq - ((Entry) o).freq;
		}

	}

}
