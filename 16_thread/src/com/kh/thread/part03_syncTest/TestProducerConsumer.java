package com.kh.thread.part03_syncTest;

public class TestProducerConsumer {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		Thread t1 = new Producer(buffer);
		Thread t2 = new Consumer(buffer);
		
		t1.start();
		t2.start();

	}

}
