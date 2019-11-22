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
		JFrame mf = new JFrame("����Ʈ �׽�Ʈ");
		mf.setSize(300, 200);
		
		JPanel listPanel = new JPanel();
		JPanel panel = new JPanel();
		
		String[] cities = {"����", "����", "�뱸", "�λ�", "���", "����", "��õ", "����"};
		
		JList list = new JList(cities);
		//����Ʈ�� ��輱 ����
		list.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		//����Ʈ�� ��ũ�ѹ� �߰�
		JScrollPane scroller = new JScrollPane(list);
		//Dimention�� ũ�⸦ �����ϱ� ���� Ŭ�����̴�.
		//��ũ���г��� ����� �����ϱ� ���� DimentionŸ���� ��ü�� ���ڷ� �־�� �Ѵ�.
		scroller.setPreferredSize(new Dimension(200, 100));
		//����Ʈ�� ���� ��带 ���� ���� ���� ����
		/*list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);*/
		/*list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);*/
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		JLabel label = new JLabel("���õ� �׸� : ");
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






















