package com.kh.silsub3.circle.controller;

import com.kh.silsub3.circle.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		
		//���� 1 ����
		c.incrementField();
		
		//�ٽ� �ѷ��� ���� ���ϱ�
		c.getAreaOfCircle();
		c.getSizeOfCircle();

	}

}















