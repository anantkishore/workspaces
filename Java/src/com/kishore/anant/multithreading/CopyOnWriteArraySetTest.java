/**
 * 
 */
package com.kishore.anant.multithreading;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author Anant Kishore
 *
 */
public class CopyOnWriteArraySetTest {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<Integer>();
		
		copyOnWriteArraySet.add(1);
		copyOnWriteArraySet.add(2);
		
		Iterator<Integer> copyOnWriteArraySetIterator =  copyOnWriteArraySet.iterator();
		
		while(copyOnWriteArraySetIterator.hasNext())
		{
			copyOnWriteArraySet.add(3);
			System.out.println(copyOnWriteArraySetIterator.next());
		}
	}

}
