package com.kh.event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_InnerClassTest extends JFrame {
	private JButton button;
	private JLabel label;
	
	public C_InnerClassTest() {
		this.setSize(300, 200);
		this.setTitle("����Ŭ���� ����");
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� ����������");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
		panel.add(button);
		panel.add(label);
		
		button.addActionListener(new MyEvent());
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//����Ŭ����
	//�ʵ忡 ���� ���� ������
	private class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("���� ��ư�� ���������ϴ�.");
			}
		}
		
	}
	

	public static void main(String[] args) {
		new C_InnerClassTest();

	}

}
















