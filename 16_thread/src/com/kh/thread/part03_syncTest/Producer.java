package com.kh.thread.part03_syncTest;

public class Producer extends Thread{
	private Buffer criticalData;
	
	public Producer() {}
	
	public Producer(Buffer buffer) {
		this.criticalData = buffer;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			criticalData.setData(i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}















