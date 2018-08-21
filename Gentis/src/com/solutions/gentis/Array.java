/**
 * 
 */
package com.solutions.gentis;

import java.util.*;

/**
 * @author i351596
 *
 */
class TestThread extends Thread {
	int count = 0;

	public void run() {
		System.out.println("run");
		synchronized (this) {
			for (int i = 0; i < 50; i++) {
				count = count + i;
			}
			notify();
		}
	}
}

public class Array {

	public static void main(String argv[]) {
		TestThread a = new TestThread();
		a.start();
		synchronized (a) {
			System.out.println("waiting");
			try {
				a.wait();
			} catch (InterruptedException e) {

			}
			System.out.println(a.count);

		}
	}
}