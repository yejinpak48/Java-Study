package com.kh.gui.part01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest1 extends JFrame{
	//�������� �����ϴ� ���1
	//javax.swing.JFrame Ŭ������ ��ӹ޾� �����ڿ��� �����ӿ� ���� ���� ��
	//�ٸ� Ŭ�������� ȣ���ϴ� ���
	public JFrameTest1() {
		//�������� ũ�� ����
		/*this.setLocation(300, 200);
		this.setSize(800, 500);*/
		
		//��ġ�� ������ ������ �ѹ��� �� ���� �ִ�.
		this.setBounds(300, 200, 800, 500);
		
		this.setTitle("My Frame");
		
		try {
			this.setIconImage(ImageIO.read(new File("images/icon.PNG")));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//��Ÿ�� �������� �⺻������ ������ ������ ������ Ȱ��ȭ �Ǿ� ����
		//true�� ���� ������ ����� ������(�⺻��)
		//false�� �����ϸ� ������ ������ �ȵ�
		this.setResizable(false);
		
		//�Ʒ� �� ���� �޼ҵ�� �ʼ� �������̱� ������ �ݵ�� �ۼ��ؾ� �ϸ�
		//���� �ϴܿ� �ۼ��� �ִ� ���� ����.
		
		//ũ��� ��ġ�� �����ϴ��� �������� �������� �ϴ� �޼ҵ带 ȣ���ؾ� �Ѵ�.
		this.setVisible(true);
		
		//�ݱ��ư(x ��ư)�� ������ ���μ����� ��� �������̴�.
		//�Ʒ� �޼ҵ带 ������Ѿ� �������� ���� �� ���μ����� ���� ����ȴ�.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}

















