package views;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame(){
		this.setBounds(200, 30, 1000, 800);
		//this.setLayout(null);
		
		this.add(new BackgroundPanel(this));
		//this.add(new GraphicTest(this));
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
