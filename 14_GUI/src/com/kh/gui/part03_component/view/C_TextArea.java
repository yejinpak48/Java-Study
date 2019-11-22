package com.kh.gui.part03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class C_TextArea {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		JTextField tf = new JTextField(30);
		
		JTextArea ta = new JTextArea(10, 30);
		
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				ta.append(text + "\n");
				
				/*tf.setText("");
				tf.requestFocus();*/
				
				tf.selectAll();
				
			}
			
		});
		
		
		
		mf.add(tf, "North");
		mf.add(ta, "Center");
		
		mf.pack();
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}





















