/**
 * 
 */
package com.morgan.stanley;

/**
 * @author i351596
 *
 */
public class FileReaderTest {
	
	static volatile boolean flag = true;
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String mutex = new String();
		
		
		FileReader reader1 = new FileReader("odd.txt", mutex);
		FileReader reader2 = new FileReader("even.txt", mutex);

		Thread thread1 = new Thread(reader1);
		Thread thread2 = new Thread(reader2);
		
		
		thread1.start();
		thread2.start();
		
		
		
	}

}
