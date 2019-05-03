/**
 * 
 */
package com.kishore.anant.java.memoryleaks;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Anant Kishore
 *
 */
public class TestStaticVariableMemoryLeaks {

	private static Random random = new Random();
	public final ArrayList<Double> list = new ArrayList<Double>(1000000);
	
	
	public static void main(String[] args) throws InterruptedException {
		
		givenStaticField_whenLotsOfOperations_thenMemoryLeak();
		
		
		
	}
	
	
	public static void givenStaticField_whenLotsOfOperations_thenMemoryLeak() throws InterruptedException {
		
		TestStaticVariableMemoryLeaks testStaticVariableMemoryLeaks = new TestStaticVariableMemoryLeaks();
		Thread.sleep(10000);
	    for (int i = 0; i < 1000000; i++) {
	    	testStaticVariableMemoryLeaks.list.add(random.nextDouble());
	    }
	    testStaticVariableMemoryLeaks = null;
	    System.gc();
	    Thread.sleep(100000); // to allow GC do its job

}




}