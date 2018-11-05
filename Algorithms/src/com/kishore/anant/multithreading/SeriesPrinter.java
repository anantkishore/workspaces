/**
 * 
 */
package com.kishore.anant.multithreading;

/**
 * @author Anant Kishore
 *
 */
public class SeriesPrinter {

	/**
	 * 
	 */
	public SeriesPrinter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Semaphore sync = new Semaphore();
		Producer p1 = new Producer(0, 1, 3, sync, 0);
		Producer p2 = new Producer(0, 2, 3, sync, 1);
		Producer p3 = new Producer(0, 3, 3, sync, 2);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}

class Producer implements Runnable {

	int start;
	int counter;
	int series;
	int threadId;
	Semaphore sync;
	
	public Producer(int series, int start, int counter, Semaphore obj, int threadId) {
		this.series = series;
		this.start = start;
		this.counter = counter;
		this.sync = obj;
		this.threadId = threadId;
	}
	
	@Override
	public void run() {
		int count = 0;
		while(count < 10)
		{
			synchronized (sync) {
				try {
				while(sync.counter % 3 != threadId)
					sync.wait();
				start = start + counter;
				System.out.println(start);
				sync.increment();
				sync.notifyAll();
				}
				catch(InterruptedException ex)
				{
					ex.printStackTrace();
				}
			}
			count++;
		}
	}
}

class Semaphore {
	
	volatile int counter = 0;
	
	public synchronized void increment()
	{
		counter++;
		counter = counter % 3;
	}
}