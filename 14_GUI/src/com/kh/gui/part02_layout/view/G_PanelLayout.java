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
		
		JLabel lb = new JLabel("�� �� : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		JTextField tf = new JTextField(20);
		tf.setLocation(110, 100);
		tf.setSize(200, 50);
		
		JButton btn = new JButton("�� ��");
		btn.setLocation(350, 100);
		btn.setSize(100, 50);
		
		JPanel panel = new JPanel();
		panel.setSize(500, 500);
		
		//�гο� ���̾ƿ��� �������� ������
		//�⺻ FlowLayout�� alignment center�� ���� ������.
		//���� �г� ������ �� ������� ��ġ�ϱ� ���ؼ���
		//�гο��� ���̾ƿ��� ������ �־�� �Ѵ�.
		panel.setLayout(null);
		
		panel.add(lb);
		panel.add(tf);
		panel.add(btn);
		
		this.add(panel);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
}


















