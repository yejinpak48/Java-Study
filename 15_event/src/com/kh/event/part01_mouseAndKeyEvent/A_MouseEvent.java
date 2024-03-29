package com.kh.event.part01_mouseAndKeyEvent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class A_MouseEvent extends JFrame 
	implements MouseListener, MouseMotionListener{
	
	public A_MouseEvent() {
		this.setTitle("Mouse Event");
		this.setSize(300, 200);
		
		JPanel panel = new JPanel();
		
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new A_MouseEvent();
	}
	
	public void display(String s, MouseEvent e) {
		System.out.println(s + " X = " + e.getX() + " Y = " + e.getY());
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		this.display("Mouse clicked (# of clicks : " + e.getClickCount() + ")", e);
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		this.display("Mouse entered", e);
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		this.display("Mouse exited", e);
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		this.display("Mouse pressed (# of click : " + e.getClickCount() + ")", e);
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		this.display("Mouse released (# of clicks : " + e.getClickCount() + ")", e);
		
	}



	@Override
	public void mouseDragged(MouseEvent e) {
		this.display("Mouse dragged", e);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.display("Mouse moved", e);
		
	}

}





















