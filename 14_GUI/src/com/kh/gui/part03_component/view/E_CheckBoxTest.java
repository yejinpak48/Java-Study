package com.kh.gui.part03_component.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class E_CheckBoxTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		String[] fruits = {"apple", "orange", "banana"};
		
		JCheckBox[] buttons = new JCheckBox[3];
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
		}
		
		JPanel checkPanel = new JPanel();
		for(int i = 0; i < buttons.length; i++) {
			checkPanel.add(buttons[i]);
		}
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("������ ������ �����ϴ�");
		resultPanel.add(text);
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					String result = "";
					int ctn = 0;
					
					for(int i = 0; i < buttons.length; i++) {
						if(buttons[i].isSelected()) {
							result += buttons[i].getText() + " ";
							ctn++;
						}
					}
					
					text.setText(result);
					
					if(ctn == 0) {
						text.setText("������ ������ �����ϴ�.");
					}
					
				}
				
			});
		}
		
		
		mf.add(checkPanel, "North");
		mf.add(resultPanel, "Center");
		mf.pack();
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}























