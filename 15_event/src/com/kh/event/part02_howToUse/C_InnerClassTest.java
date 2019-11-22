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
		this.setTitle("내부클래스 예제");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		panel.add(button);
		panel.add(label);
		
		button.addActionListener(new MyEvent());
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//내부클래스
	//필드에 직접 접근 가능함
	private class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("드디어 버튼이 눌려졌습니다.");
			}
		}
		
	}
	

	public static void main(String[] args) {
		new C_InnerClassTest();

	}

}
















