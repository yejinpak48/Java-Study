package com.kh.gui.part01_container.view;

import java.awt.Rectangle;

import javax.swing.JFrame;

public class JFrameTest2 {
	//�������� �����ϴ� ���2
	//javax.swing.JFrame Ŭ������ ��ü�� ���� ��
	//�ش� ������ ��ü�� �������� �����ϴ� ���
	public void showMainFrame() {
		//JFrame ��ü �����ϴ� ����
		JFrame mainFrame = new JFrame("MyFrame2");
		
		//Rectangle��ü�� Ȱ���� ������ ����
		Rectangle r = new Rectangle(300, 200, 800, 500);
		mainFrame.setBounds(r);
		
		
		
		
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}






















