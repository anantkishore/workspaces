/**
 * 
 */
package com.kishore.anant.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Anant Kishore
 *
 */
public class MostFrequentWordInArrayOfStrings {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		int input = Integer.parseInt(reader.readLine());
		Map<String, Integer> map = null;
		for (int j = 0; j < input; j++) {
			map = new HashMap<String, Integer>();
			Integer.parseInt(reader.readLine());
			String[] words = reader.readLine().split(" ");
			for (String word : words) {
				if (map.get(word) != null) {
					int temp = map.get(word);
					map.put(word, temp + 1);
				} else
					map.put(word, 1);
			}
			Map<String, Integer> treeMap = new LinkedHashMap<>();
			@SuppressWarnings("null")
			Set<Entry<String, Integer>> set = map.entrySet();
			Iterator<Entry<String, Integer>> iterator = set.iterator();
			while (iterator.hasNext()) {
				Entry<String, Integer> entry = iterator.next();
				treeMap.put(entry.getKey(), entry.getValue());
			}
			System.out.println(treeMap.toString());
		}
		reader.close();
	}
}
