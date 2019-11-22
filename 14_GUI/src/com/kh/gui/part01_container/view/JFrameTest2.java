package com.kh.gui.part01_container.view;

import java.awt.Rectangle;

import javax.swing.JFrame;

public class JFrameTest2 {
	//프레임을 생성하는 방법2
	//javax.swing.JFrame 클래스를 객체로 생성 후
	//해당 프레임 객체의 설정값을 변경하는 방법
	public void showMainFrame() {
		//JFrame 객체 생성하는 구문
		JFrame mainFrame = new JFrame("MyFrame2");
		
		//Rectangle객체를 활용한 사이즈 설정
		Rectangle r = new Rectangle(300, 200, 800, 500);
		mainFrame.setBounds(r);
		
		
		
		
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}






















