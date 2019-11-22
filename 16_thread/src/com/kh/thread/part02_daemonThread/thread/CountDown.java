package com.kh.thread.part02_daemonThread.thread;

public class CountDown extends Thread{
	@Override
	public void run() {
		for(int i = 50; i >= 0; i--) {
			try {
				Thread.sleep(500);
				
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
