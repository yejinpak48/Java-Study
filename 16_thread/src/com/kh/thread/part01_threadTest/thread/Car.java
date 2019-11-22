package com.kh.thread.part01_threadTest.thread;

public class Car extends Thread{
	public Car() {}
	
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("Car Driving...");
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
















