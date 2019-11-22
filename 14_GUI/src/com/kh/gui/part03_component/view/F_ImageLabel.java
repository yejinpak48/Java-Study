package com.kh.gui.part03_component.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class F_ImageLabel {

	public static void main(String[] args) {
		JFrame mf = new JFrame("�̹����� �׽�Ʈ");
		mf.setSize(250, 300);
		
		JPanel panel = new JPanel();
		
		Image icon = new ImageIcon("images/user.PNG").getImage().getScaledInstance(150, 150, 0);
		
		JLabel label = new JLabel(new ImageIcon(icon));
		
		JButton button = new JButton("�̹��� ����");
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Image icon = new ImageIcon("images/dog.PNG")
									.getImage()
									.getScaledInstance(150, 150, 0);
				label.setIcon(new ImageIcon(icon));
				
			}
		});
		
		
		panel.add(label, "Center");
		panel.add(button, "South");
		
		mf.add(panel);
		
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}

}





















