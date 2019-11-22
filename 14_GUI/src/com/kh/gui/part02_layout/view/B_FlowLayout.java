package com.kh.gui.part02_layout.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame{
	
	public B_FlowLayout() {
		super("FlowLayout");
		
		this.setBounds(300, 200, 800, 500);
		
		//FlowLayout설정
		/*this.setLayout(new FlowLayout());*/
		/*this.setLayout(new FlowLayout(FlowLayout.CENTER));*/	//가운데정렬(기본값)
		/*this.setLayout(new FlowLayout(FlowLayout.RIGHT));*/
		/*this.setLayout(new FlowLayout(FlowLayout.LEFT));*/
		/*this.setLayout(new FlowLayout(FlowLayout.LEADING));*/
		this.setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		//FlowLayout은 컴포넌트들을 가로나 세로 방향의 줄 단위로 배치하는 레이아웃이다.
		//만약 컨테이너보다 배치할 구성 요소가 더 많거나 크게 되면 자동으로 다음 줄로
		//넘기면서 배치한다.
		
		this.add(new JButton("1번"));
		this.add(new JButton("2번"));
		this.add(new JButton("3번"));
		this.add(new JButton("4번"));
		this.add(new JButton("5번"));
		this.add(new JButton("6번"));
		this.add(new JButton("7번"));
		this.add(new JButton("8번"));
		this.add(new JButton("9번"));
		this.add(new JButton("10번"));
		this.add(new JButton("11번"));
		this.add(new JButton("12번"));
		this.add(new JButton("13번"));
		this.add(new JButton("14번"));
		this.add(new JButton("15번"));
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}



















