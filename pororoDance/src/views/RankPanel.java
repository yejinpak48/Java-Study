package views;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.vo.Score;

public class RankPanel extends JPanel{
	private JFrame mf;
	private ArrayList list;
	
	public RankPanel(JFrame mf, ArrayList list){
		this.mf = mf;
		this.list = list;
		this.setBackground(Color.white);
		this.setBounds(0, 0, 1000, 800);
		
		//System.out.println(list);
		printRank(list);
		
		mf.add(this);
	}
	
	public void printRank(ArrayList list){
		JTextArea ta = new JTextArea();
		
		for(int i = 0; i < list.size(); i++){
			Score s = (Score) list.get(i);
			ta.append((i+1) + "À§ " + s.getPoint() + " Á¡    "+ s.getUserId() + "\n");
			if(i >= 9){
				break;
			}
		}
		ta.setBounds(0, 0, 800, 700);
		ta.setFont(new Font("Sanscerif", Font.BOLD, 50));
		this.add(ta);
	}
}
