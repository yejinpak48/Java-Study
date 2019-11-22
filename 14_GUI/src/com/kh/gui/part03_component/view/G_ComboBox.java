package com.kh.gui.part03_component.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G_ComboBox {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		mf.setSize(300, 200);
		
		String[] animals = {"dog", "cat", "tiger"};
		
		//�޺��ڽ�(��Ӵٿ��� �Ǵ� ���û���)
		//������ ���ڿ� �迭�� �ξ� �����Ѵ�.
		JComboBox animalList = new JComboBox(animals);
		
		//ó�� ���õǾ� �ִ� ���� ������ �� �ִ�.
		//�⺻ ������ 0���� �Ǿ� �ִ�.
		animalList.setSelectedIndex(2);
		
		JLabel label = new JLabel();
		
		animalList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				
				String name = (String) cb.getSelectedItem();
				
				Image img = new ImageIcon("images/" + name + ".PNG")
									.getImage()
									.getScaledInstance(150, 150, 0);
				label.setIcon(new ImageIcon(img));
				
			}
		});
		
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		mf.add(animalList, "North");
		mf.add(label, "South");
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}




















