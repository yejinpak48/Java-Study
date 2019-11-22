package com.kh.thread.part02_daemonThread.run;

import javax.swing.JOptionPane;

import com.kh.thread.part02_daemonThread.thread.CountDown;

public class Run {

	public static void main(String[] args) {
		Thread t = new CountDown();
		
		//데몬은 리눅스, 유닉스 계열의 운영체제에서 백그라운드에서 동작하는
		//프로그램을 말한다.
		//이와 비슷하게 동작하도록 만든 것을 데몬쓰레드라고 한다.
		//메인쓰레드가 종료되어도 쓰레드의 실행 내용을 마저 실행하는 것을
		//데몬쓰레드로 생성한 쓰레드를 등록하면
		//메인쓰레드가 종료될 때 데몬쓰레드도 함께 종료된다.
		t.setDaemon(true);
		
		t.start();
		System.out.println(JOptionPane
				.showInputDialog("아무 문자열이나 입력해보세요"));
		
		
		System.out.println("메인쓰레드 종료");

	}

}











