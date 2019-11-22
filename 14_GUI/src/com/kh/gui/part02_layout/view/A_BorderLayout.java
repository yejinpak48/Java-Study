package com.kh.gui.part02_layout.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame{
	
	public A_BorderLayout() {
		super("BorderLayout");
		
		this.setBounds(300, 200, 800, 500);
		
		//레이아웃 설정
		//JFrame은 BorderLayout이 기본 설정값이다.
		//this.setLayout(new BorderLayout());
		
		JButton north = new JButton("북");
		JButton south = new JButton("남");
		JButton east = new JButton("동");
		JButton west = new JButton("서");
		JButton center = new JButton("가운데");
		
		//레이아웃의 위치별로 컴포넌트 배치
		this.add(north, "North");
		this.add(south, "South");
		this.add(east, "East");
		this.add(west, "West");
		this.add(center, "Center");
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

















