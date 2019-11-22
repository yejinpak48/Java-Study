package com.kh.poly.part01_polymorphismTest.animal.model.vo;

public class Tiger extends Animal{
	
	public Tiger(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}
	
	@Override
	public void cry() {
		System.out.println("ȣ���̶� ������~������~ �ϰ� �����Ҹ��� ���ϴ�.");
	}
	
	public void punch() {
		System.out.println("ȣ���̰� �ָ��� �����ϴ�~ ����~ ����!!");
	}
	
	public void hitTiger() {
		System.out.println("ȣ���̰� ����� ������ hp�� 50 �����մϴ�.");
		super.setHp(super.getHp() - 50);
		
		if(super.getHp() <= 0) {
			System.out.println("ȣ���̰� �������ϴ�. ����ġ�� " 
							+ super.getExp() + "��ŭ ����մϴ�.");
		}
	}
	

}




















