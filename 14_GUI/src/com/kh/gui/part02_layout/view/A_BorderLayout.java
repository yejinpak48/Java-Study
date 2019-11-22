package com.kh.gui.part02_layout.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame{
	
	public A_BorderLayout() {
		super("BorderLayout");
		
		this.setBounds(300, 200, 800, 500);
		
		//���̾ƿ� ����
		//JFrame�� BorderLayout�� �⺻ �������̴�.
		//this.setLayout(new BorderLayout());
		
		JButton north = new JButton("��");
		JButton south = new JButton("��");
		JButton east = new JButton("��");
		JButton west = new JButton("��");
		JButton center = new JButton("���");
		
		//���̾ƿ��� ��ġ���� ������Ʈ ��ġ
		this.add(north, "North");
		this.add(south, "South");
		this.add(east, "East");
		this.add(west, "West");
		this.add(center, "Center");
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

















