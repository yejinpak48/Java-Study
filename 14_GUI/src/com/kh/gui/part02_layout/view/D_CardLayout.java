package com.kh.gui.part02_layout.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame{
	
	public D_CardLayout() {
		super("CardLayout");
		this.setBounds(300, 200, 800, 500);
		
		//CardLayout
		//Panel을 이용하여 카드 판을 만들어 겹쳐 놓음
		//이벤트를 이용해서 다른 판이 보이게 설정해야 함
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		//패널 만들기
		//패널은 컴포넌트이지만 다른 컴포넌트를 보함할 수 있는 컨테이너의 성격을 가짐
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		//패널에 배경 색 지정
		card1.setBackground(Color.GRAY);
		card2.setBackground(Color.YELLOW);
		card3.setBackground(new Color(50, 100, 50));
		
		//패널에 라벨 추가
		card1.add(new JLabel("Card1"), "1");
		card2.add(new JLabel("Card2"), "2");
		card3.add(new JLabel("Card3"), "3");
		
		//메인프레임에 패널 추가
		this.add(card1);
		this.add(card2);
		this.add(card3);
		
		//패널에 이벤트 추가
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					card.next(card1.getParent());
				}
				if(e.getButton() == 3) {
					card.previous(card1.getParent());
				}
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					card.next(card2.getParent());
				}
				if(e.getButton() == 3) {
					card.previous(card2.getParent());
				}
			}
		});
		
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					card.next(card3.getParent());
				}
				if(e.getButton() == 3) {
					card.previous(card3.getParent());
				}
			}
		});
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}




















