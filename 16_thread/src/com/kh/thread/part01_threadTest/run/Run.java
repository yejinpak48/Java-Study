package com.kh.thread.part01_threadTest.run;

import com.kh.thread.part01_threadTest.thread.Car;
import com.kh.thread.part01_threadTest.thread.Plane;
import com.kh.thread.part01_threadTest.thread.Tank;

public class Run {

	public static void main(String[] args) {
		//Thread test
		/*Car car = new Car();
		Tank tank = new Tank();
		Plane plane = new Plane();
		
		Thread t1 = car;
		Thread t2 = tank;
		Thread t3 = new Thread(plane);*/
		
		Thread t1 = new Car();
		Thread t2 = new Tank();
		Thread t3 = new Thread(new Plane());
		
		System.out.println("t1 우선선위 : " + t1.getPriority());
		System.out.println("t2 우선순위 : " + t2.getPriority());
		System.out.println("t3 우선순위 : " + t3.getPriority());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			//지정한 쓰레드가 종료될 때까지 현재 메인 쓰레드의 종료를 대기시킨다.
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("-------------- main end");
	}

}
















