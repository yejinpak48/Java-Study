package com.kh.poly.part01_polymorphismTest.animal.model.vo;

public class Chicken extends Animal{
	
	public Chicken(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}
	
	
	public void cry() {
		System.out.println("���� ������~ �ϰ� �����Ҹ��� ���ϴ�.");
	}
	
	public void peck() {
		System.out.println("���� �ɾҽ��ϴ�.");
	}
	
	public void hitChicken() {
		System.out.println("���� ����� ������ hp�� 10�� �����մϴ�.");
		super.setHp(super.getHp() - 10);
		
		if(super.getHp() <= 0) {
			System.out.println("���� �������ϴ�. ����ġ�� " 
							+ super.getExp() + "��ŭ ����մϴ�.");
		}
	}
}















