package com.kh.gui.part02_layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class F_NullLayout extends JFrame{
	//Layout 지정 없이 위치 지정하면서 배치하는 방법이다.
	public F_NullLayout() {
		super("NullLayout");
		
		this.setBounds(200, 200, 500, 500);
		
		this.setLayout(null);
		
		JLabel lb = new JLabel("이 름 : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		JTextField tf = new JTextField(20);
		tf.setLocation(110, 100);
		tf.setSize(200, 50);
		
		JButton btn = new JButton("추 가");
		btn.setLocation(350, 100);
		btn.setSize(100, 50);
		
		this.add(lb);
		this.add(tf);
		this.add(btn);
		
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}



















