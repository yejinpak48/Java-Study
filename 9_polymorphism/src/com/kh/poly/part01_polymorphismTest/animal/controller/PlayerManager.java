package com.kh.poly.part01_polymorphismTest.animal.controller;

import com.kh.poly.part01_polymorphismTest.animal.model.vo.Animal;
import com.kh.poly.part01_polymorphismTest.animal.model.vo.Chicken;
import com.kh.poly.part01_polymorphismTest.animal.model.vo.Player;
import com.kh.poly.part01_polymorphismTest.animal.model.vo.Tiger;

public class PlayerManager {
	
	public void startPlay(String name) {
		//�÷��̾� ��ü ����� ��� ����
		Player p = new Player(name);
		
		System.out.println(p.getName() + "�Բ��� �����ϼ̽��ϴ�.");
		
		//�÷��̾� �⺻ ����ġ Ȯ��
		System.out.println(p);
		
		//ġŲ �Ѹ��� ����
		//���� �����̱� ������ ���� Ÿ������ ���� ������
		/*Chicken c1 = new Chicken(100, 100, "�ʺ���");*/
		Animal c1 = new Chicken(100, 100, "�ʺ���");
		
		c1.cry();
		
		//�� ����
		//�θ� Ÿ���� ��� ���� �ڽ��� ���� �� �ֱ� ������
		//� �ڽ� ��ü�� �޼ҵ����� ����ȯ�� ���� �˷���� ��
		//�ش� Ÿ���� �´����� instanceof �����ڸ� ����ؼ� �� �� ����
		//���� casting �Ϸ��� Ÿ���� ��ġ���� �ʴ� ��� ClassCastException�߻�
		if(c1 instanceof Chicken) {
			((Chicken)c1).hitChicken();
		}
		
		//���� hp��ŭ �ݺ� ����
		for(int i = c1.getHp(); i > 0; i -= 10) {
			/*c1.hitChicken();*/
			if(c1 instanceof Chicken) {
				((Chicken) c1).hitChicken();
			}
		}
		
		//�÷��̾� ����ġ ����
		p.setExp(p.getExp() + c1.getExp());
		
		//�÷��̾� ���� Ȯ��
		System.out.println(p);
		
		Animal t1 = new Tiger(1000, 1000, "�ú�����ȣ����");
		
		for(int i = t1.getHp(); i > 0; i -= 50) {
			if(t1 instanceof Tiger) {
				((Tiger) t1).hitTiger();
			}
		}
		
		p.setExp(p.getExp() + t1.getExp());
		
		System.out.println(p);
		
	
	}
}


















