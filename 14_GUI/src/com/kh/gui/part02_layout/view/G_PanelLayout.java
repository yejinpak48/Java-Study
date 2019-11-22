package com.kh.gui.part02_layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class G_PanelLayout extends JFrame{
	
	public G_PanelLayout() {
		super("JPanelLayoutTest");
		
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
		
		JPanel panel = new JPanel();
		panel.setSize(500, 500);
		
		//패널에 레이아웃을 설정하지 않으면
		//기본 FlowLayout의 alignment center의 값을 가진다.
		//따라서 패널 위에서 내 마음대로 배치하기 위해서는
		//패널에도 레이아웃을 설정해 주어야 한다.
		panel.setLayout(null);
		
		panel.add(lb);
		panel.add(tf);
		panel.add(btn);
		
		this.add(panel);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
}


















