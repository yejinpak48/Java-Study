package com.kh.gui.part03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B_TextFieldTest {

	public static void main(String[] args) {
		//���� �Է� �޾Ƽ� ������ ��� �����ϱ�
		JFrame mf = new JFrame();
		
		mf.setSize(300, 130);
		mf.setTitle("���� ����ϱ�");
		
		JPanel panel = new JPanel();
		
		panel.add(new JLabel("���� �Է� : "));
		
		JTextField text = new JTextField(15);
		panel.add(text);
		
		panel.add(new JLabel("������ �� : "));
		
		JTextField result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		JButton btn = new JButton("ok");
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(text.getText());
				
				result.setText(value * value + "");
				
				//�ؽ�Ʈ���ڷ� �ٽ� ��Ŀ�� ��������
				text.requestFocus();
			}});
		
		
		panel.add(btn);
		
		mf.add(panel);
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}




















