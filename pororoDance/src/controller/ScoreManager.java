package controller;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.dao.ScoreDao;
import model.vo.Score;
import views.ChangePanel;
import views.GamePanel;
import views.RankPanel;

public class ScoreManager {
	private String userId;
	private ScoreDao sd = new ScoreDao();
	private JFrame mf;
	private JPanel panel;
	
	public ScoreManager(String userId, JFrame mf, JPanel panel){
		this.userId = userId;
		this.mf = mf;
		this.panel = panel;
	}
	
	public void saveScore(){
		System.out.println(userId);
		System.out.println(GamePanel.point);
		Score s = new Score(userId, GamePanel.point);
		
		sd.insertScore(s);
		
		ArrayList list = sd.readAll();
		list.sort(new ScoreRank());

		//System.out.println(list);
		
		new ChangePanel(mf, panel).replaceRankPanel(new RankPanel(mf, list));
		
		
		
	}
}
