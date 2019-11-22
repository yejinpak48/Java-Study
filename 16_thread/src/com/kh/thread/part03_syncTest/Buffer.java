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
		
		System.out.println("�Һ��� : " + data + " ��ǰ�� �Һ��Ͽ����ϴ�.");
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
		System.out.println("������ : " + data + " ��ǰ�� �����Ͽ����ϴ�.");
		notify();
	}
}


















