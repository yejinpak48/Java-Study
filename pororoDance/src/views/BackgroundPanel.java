package views;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BackgroundPanel extends JPanel{
	private JFrame mf;
	private JPanel panel;
	public BackgroundPanel(JFrame mf){
		this.mf = mf;
		this.setLayout(null);
		
		panel = this;
		
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("images/background.PNG").getImage().getScaledInstance(1000, 800, 0)));
		label.setBounds(0, 0, 1000, 800);
		
		JLabel start = new JLabel(new ImageIcon(new ImageIcon("images/start.PNG").getImage().getScaledInstance(200, 100, 0)));
		start.setBounds(180, 550, 200, 100);
		
		start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel cp = new ChangePanel(mf, panel);
				//t1.setDaemon(true);
				GamePanel gp = new GamePanel(mf);
				Timer timer = new Timer(mf,gp);
				Thread t1 = timer;
				t1.start();
				
				
				
				cp.replacePanel(gp);
			}
			
		});
		this.add(label);
		this.add(start);
		this.setComponentZOrder(label, 1);
		
		
	}
	
	
	
}
