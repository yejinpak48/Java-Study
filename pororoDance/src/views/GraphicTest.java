package views;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GraphicTest extends JLabel{
	private JFrame mf;
	
	public GraphicTest(JFrame mf){
		this.mf = mf;
		this.setBounds(0, 0, 800, 500);
		this.setBackground(Color.BLACK);
		mf.add(this);
	}
	
	
	
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.black);
		g.drawRect(0, 0, 300, 500);
	}
}
