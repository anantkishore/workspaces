package com.kishore.anant.array;

import java.util.PriorityQueue;
import java.util.Queue;

public class ElevatorSystem {
	

	public static void main(String[] args) {
		
	}

}

class Elevator extends Thread {
	
	DIRECTION dir;

	public static Queue<Integer> upQ = new PriorityQueue<>();
	public static Queue<Integer> downQ = new PriorityQueue<>();
	public static Queue<Integer> currQ = new PriorityQueue<>();
	
	public void run()
	{
		while(true)
		{
			if(!currQ.isEmpty())
			{
				for(int floorNum : currQ)
				{
					gotoFloor(floorNum);
					openGate();
					closeGate();
				}
			}
			else
			{
				processPendingRequests();
			}
		}
	}

	private void closeGate() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("closing gate");
	}

	private void openGate() throws InterruptedException {
		System.out.println("opening gate");
		Thread.sleep(2000);
		
	}

	private void gotoFloor(int floorNum) {
		System.out.println(floorNum+"Floor has arrived");
	}
	
}

enum DIRECTION {
	UP,
	DOWN
}