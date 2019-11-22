package views;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ScoreManager;

public class Timer extends Thread{
	private JFrame mf;
	private JPanel panel;
	private String userId;
	
	public Timer(JFrame mf, JPanel panel){
		this.mf = mf;
		this.panel = panel;
	}

	@Override
	public void run() {
		JTextField label = new JTextField("남은시간 : ");
		label.setBounds(850, 0, 150, 50);
		label.setFont(new Font("Sanscerif", Font.BOLD, 20));
		panel.add(label);
		for(int i = 60; i >= 0; i--){
			try {
				System.out.println(i);
				this.sleep(100);
				label.setText("남은시간 : " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		userId = JOptionPane.showInputDialog("아이디를 입력하세요!");
		saveScore(userId);
		
	}
	
	public void saveScore(String userId){
		new ScoreManager(userId, mf, panel).saveScore();
	}

}
