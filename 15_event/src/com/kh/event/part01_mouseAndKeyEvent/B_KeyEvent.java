package com.kh.event.part01_mouseAndKeyEvent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class B_KeyEvent extends JFrame implements KeyListener{
	public B_KeyEvent() {
		this.setTitle("이벤트 예제");
		this.setSize(300, 200);
		
		JTextField tf = new JTextField(20);
		
		tf.addKeyListener(this);
		
		this.add(tf);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new B_KeyEvent();

	}
	
	public void display(String s, KeyEvent e) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = e.isAltDown() + " " +
							e.isControlDown() + " " + 
							e.isShiftDown();
		System.out.println(s + " " + c + " " + keyCode + " " + modifiers);
		
	}
	
	//한글 안됨
	@Override
	public void keyPressed(KeyEvent e) {
		this.display("key Pressed ", e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		this.display("key Released ", e);
		
	}
	//한글 됨
	@Override
	public void keyTyped(KeyEvent e) {
		this.display("Key Typed", e);
		
	}

}













