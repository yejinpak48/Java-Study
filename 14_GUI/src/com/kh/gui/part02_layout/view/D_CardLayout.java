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
		//Panel�� �̿��Ͽ� ī�� ���� ����� ���� ����
		//�̺�Ʈ�� �̿��ؼ� �ٸ� ���� ���̰� �����ؾ� ��
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		//�г� �����
		//�г��� ������Ʈ������ �ٸ� ������Ʈ�� ������ �� �ִ� �����̳��� ������ ����
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		//�гο� ��� �� ����
		card1.setBackground(Color.GRAY);
		card2.setBackground(Color.YELLOW);
		card3.setBackground(new Color(50, 100, 50));
		
		//�гο� �� �߰�
		card1.add(new JLabel("Card1"), "1");
		card2.add(new JLabel("Card2"), "2");
		card3.add(new JLabel("Card3"), "3");
		
		//���������ӿ� �г� �߰�
		this.add(card1);
		this.add(card2);
		this.add(card3);
		
		//�гο� �̺�Ʈ �߰�
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




















