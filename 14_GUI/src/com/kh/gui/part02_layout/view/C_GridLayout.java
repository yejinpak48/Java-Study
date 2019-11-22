package com.kh.gui.part02_layout.view;

import java.awt.GridLayout;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame{
	
	public C_GridLayout() {
		super("GridLayout");
		
		this.setBounds(300, 200, 800, 500);
		
		//GridLayout
		//������Ʈ���� ����, ���� ���� �� ��ŭ ��ġ�ϰ��� �� �� �ַ� �̿��Ѵ�.
		//�� �ٺ��� �����ؼ� ���ʿ��� ���������� �����̸�
		//�� ���� �̵��ϸ� ������Ʈ�� ��ġ�ϴ� ����̴�.
		this.setLayout(new GridLayout(5, 5));
		
		/*for(int i = 1; i < 26; i++) {
			String str = new Integer(i).toString();
			this.add(new JButton(str));
		}*/
		
		//�ߺ� �����Ͽ� �������� ������ �����
		Set set = new LinkedHashSet();
		
		while(set.size() < 25) {
			set.add(new Random().nextInt(25) + 1);
		}
		
		Object[] obj = set.toArray();
		
		for(int i = 0; i < obj.length; i++) {
			String str = new Integer((int) obj[i]).toString();
			this.add(new JButton(str));
		}
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}



























