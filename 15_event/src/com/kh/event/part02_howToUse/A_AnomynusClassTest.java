package com.kh.event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class A_AnomynusClassTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame("�͸�Ŭ���� ����");
		
		mf.setSize(300, 200);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("��ư�� ����������");
		JLabel label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					label.setText("���� ��ư�� ���������ϴ�.");
				}
				
			}
		});
		
		panel.add(button);
		panel.add(label);
		
		mf.add(panel);
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


















