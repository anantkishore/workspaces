/**
 * 
 */
package com.morgan.stanley;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author i351596
 *
 */
public class FileReader implements Runnable {
	
		String filePath;
		
		String mutex;
		
		public FileReader(String filePathParam, String mutexParam)
		{
			this.filePath = filePathParam;
			this.mutex = mutexParam;
		}

		public void run()
		{
			try {
				
				@SuppressWarnings("resource")
				BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath));
				String line = "";
				
				while( (line = reader.readLine() ) != null)
				{
					
					synchronized (mutex) {
						
						if(FileReaderTest.flag == true)
						{
							System.out.println(line);
							mutex.notify();
						}
						else
						{
							mutex.wait();
						}
						
						
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	

}

































