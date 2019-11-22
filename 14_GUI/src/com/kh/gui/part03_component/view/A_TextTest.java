package com.kh.gui.part03_component.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A_TextTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		/*mf.setSize(800, 300);*/
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(3, 2));
		
		//���� �Է��� �� �ִ� �ؽ�Ʈ���ڸ� TextField��� �Ѵ�.
		JTextField id = new JTextField(30);
		panel.add(new JLabel("ID"));
		panel.add(id);
		
		//��й�ȣ�� �Է��� �� �ִ� TextField�� PasswordField��� �Ѵ�.
		//�ԷµǴ� ���� ȭ��󿡼� �� �� ������ �ѱ��� �Է��� �� �� ����.
		JPasswordField password = new JPasswordField(30);
		panel.add(new JLabel("PASSWORD"));
		panel.add(password);
		
		//���� ���� �Է��� �� �ִ� ���ڸ� textArea��� �Ѵ�.
		JTextArea textArea = new JTextArea(10, 30);
		//������ ������ �� ������ �Ѵ�(ReadOnly)
		textArea.setEditable(false);
		
		JButton btn = new JButton("������");
		
		mf.add(panel, BorderLayout.NORTH);
		mf.add(textArea, BorderLayout.CENTER);
		mf.add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "id = " + id.getText() + "\n";
				text += "password = " + password.getPassword() + "\n";
				
				char[] pass = password.getPassword();
				
				for(int i = 0; i < pass.length; i++) {
					System.out.print(pass[i]);
				}
				
				textArea.append(text);
				
			}});
		
		//������Ʈ�� ũ�⿡ �°� �������� �����Ѵ�.
		mf.pack();
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

















