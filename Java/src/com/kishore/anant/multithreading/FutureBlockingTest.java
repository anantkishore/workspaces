/**
 * 
 */
package com.kishore.anant.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Anant Kishore
 *
 */
public class FutureBlockingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		Future<Integer> future = executor.submit(new Task());
		
		try {
			System.out.println("starts");
			Integer count = future.get();
			System.out.println("ends");
			System.out.println(count);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static class Task implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			int count = 0;
			Thread.sleep(10000);
			for(int i = 0; i < Integer.MAX_VALUE; i++)
			{
				
				count = i-1;
			}
			return count;
		}
		
	}
}
