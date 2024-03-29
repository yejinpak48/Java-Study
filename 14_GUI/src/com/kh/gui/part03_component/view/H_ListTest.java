package com.kh.gui.part03_component.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class H_ListTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame("리스트 테스트");
		mf.setSize(300, 200);
		
		JPanel listPanel = new JPanel();
		JPanel panel = new JPanel();
		
		String[] cities = {"서울", "대전", "대구", "부산", "경기", "강원", "인천", "제주"};
		
		JList list = new JList(cities);
		//리스트에 경계선 설정
		list.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		//리스트에 스크롤바 추가
		JScrollPane scroller = new JScrollPane(list);
		//Dimention은 크기를 지정하기 위한 클래스이다.
		//스크롤패널의 사이즈를 지정하기 위해 Dimention타입의 객체를 인자로 넣어야 한다.
		scroller.setPreferredSize(new Dimension(200, 100));
		//리스트의 선택 모드를 단일 선택 모드로 변경
		/*list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);*/
		/*list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);*/
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		JLabel label = new JLabel("선택된 항목 : ");
		JTextField selected = new JTextField(10);
		
		selected.setEditable(false);
		
		listPanel.add(scroller);
		panel.add(label);
		panel.add(selected);
		
		mf.add(listPanel, "North");
		mf.add(panel, "Center");
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				selected.setText((String) list.getSelectedValue());
				
			}
		});
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}






















