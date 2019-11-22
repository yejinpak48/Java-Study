package com.kh.thread.part03_syncTest;

public class Buffer {
	private int data;
	private boolean empty = true;
	
	public synchronized void getData() {
		while(empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		empty = true;
		
		System.out.println("소비자 : " + data + " 상품을 소비하였습니다.");
		notify();
		
	}
	
	public synchronized void setData(int data) {
		while(!empty) {
			try {
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.data = data;
		empty = false;
		System.out.println("생산자 : " + data + " 상품을 생산하였습니다.");
		notify();
	}
}


















