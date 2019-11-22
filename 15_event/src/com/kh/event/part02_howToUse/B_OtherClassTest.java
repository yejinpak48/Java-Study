package com.kh.event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_OtherClassTest extends JFrame{
	
	public B_OtherClassTest() {
		this.setSize(300, 200);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("��ư�� ����������");
		JLabel label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
		panel.add(button);
		panel.add(label);
		
		button.addActionListener(new MyEvent(button, label));
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}


class MyEvent implements ActionListener{
	private JButton button;
	private JLabel label;
	
	public MyEvent(JButton button, JLabel label) {
		this.button = button;
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			label.setText("���� ��ư�� ���������ϴ�.");
		}
		
	}
	
}







































