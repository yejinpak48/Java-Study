package com.kh.poly.part02_abstractClassAndInterface.product.controller;

import com.kh.poly.part02_abstractClassAndInterface.product.model.vo.Book;
import com.kh.poly.part02_abstractClassAndInterface.product.model.vo.Galaxy;
import com.kh.poly.part02_abstractClassAndInterface.product.model.vo.Product;
import com.kh.poly.part02_abstractClassAndInterface.product.model.vo.SmartPhone;

public class ProductManager {
	public void testPolymorphism() {
		//������(Polymorphism)
		//��� ���迡 �ִ� Ŭ������ �� �θ� Ŭ������ ���۷�����
		//�ļ� ��ü�� �ּҸ� ��� ������ �� �ִ�.
		
		//�߻�Ŭ������ ��ü �������� ���ϰ� �ݵ�� ��ӹ��� Ŭ������ �����ؾ� �Ѵ�.
		/*Product p = new Product();*/
		
		Product p1 = new SmartPhone();
		Product p2 = new Galaxy();
		Product p3 = new Book();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		//ObjectŬ������ ��� Ŭ������ �����̴�
		//�θ� Ŭ���� Ÿ������ �ڽ� ��ü�� �ּҸ� ���� �� �ִ�.
		Object obj1 = p1;
		Object obj2 = p2;
		Object obj3 = p3;
		
		//�ļ� Ŭ���� Ÿ�����δ� �θ� ��ü�� �ּҸ� ���� �� ����.
		//����ȯ �ϰ� �Ǹ� ��Ŭ���� �󿡼��� ������ ���������
		//����� ClassCastException�� �߻��Ѵ�.
		/*Galaxy g = new SmartPhone();*/
		/*Galaxy g = (Galaxy) new SmartPhone();*/
		
		//�ڽ� Ŭ������ �޼ҵ带 ȣ���ϱ� ���� �θ� ���۷����� �ڽ� ���۷�����
		//����ȯ �� �� �ִ�.
		SmartPhone s1 = new Galaxy();
		s1.printProduct();
		s1.printSmartPhone();
		
		//�ڽ� Ŭ������ �޼ҵ带 ȣ���ϱ� ���ؼ���
		//�θ� ���۷����� �ڽ� ���۷����� ����ȯ�� �ؾ� �Ѵ�.(�ٿ�ĳ����)
		((Galaxy)s1).printGalaxy();
		
		print(new Book());
	}
	
	public void print(Object obj) {
		//�θ� ���۷����� �ļ� ��ü�� �ּҸ� �޴� ��������
		//�ڵ����� ����ȯ�� ������(up casting)
		//=> �θ�Ŭ������ ���� ������� ������ �� ����
		//=> �ļ�Ŭ������ ���� ����� �ٿ�ĳ������ �ؾ� ������ �� �ִ�.
		System.out.println("===============================");
		System.out.println(obj);
		
		//���� �θ� ���� ���۷����� �ļ� ��ü�� ���� ����� ������ ���
		//���� �ش� Ŭ������ ����ȯ �ؾ� �Ѵ�.
		
		/*if(obj instanceof Galaxy) {
			((Galaxy) obj).printGalaxy();
		}
		if(obj instanceof Book) {
			((Book) obj).printBook();
		}
		if(obj instanceof SmartPhone) {
			((SmartPhone) obj).printSmartPhone();
		}
		if(obj instanceof Product) {
			((Product) obj).printProduct();
		}*/
		
		//���� Ÿ���� ���� �ۼ��ؾ� �Ѵ�.
		if(obj instanceof Galaxy) {
			((Galaxy) obj).printGalaxy();
		}else if(obj instanceof Book) {
			((Book) obj).printBook();
		}else if(obj instanceof SmartPhone) {
			((SmartPhone) obj).printSmartPhone();
		}else if(obj instanceof Product) {
			((Product) obj).printProduct();
		}
		
		
		
		
		
	}
	
	public void objectArrayTest() {
		//��ü �迭���� ������ ���� �����ϴ�.
		Object[] arr = new Object[10];
		
		arr[0] = new String("���ڿ� ��ü");
		arr[1] = new java.util.Date();
		/*arr[2] = new Product();*/		//�߻�Ŭ������ ��ü ���� �Ұ�
		arr[3] = new Book();
		arr[4] = new Galaxy();
		arr[5] = new SmartPhone();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Galaxy) {
				((Galaxy) arr[i]).printGalaxy();
			}else if(arr[i] instanceof Book) {
				((Book) arr[i]).printBook();
			}else if(arr[i] instanceof SmartPhone) {
				((SmartPhone) arr[i]).printSmartPhone();
			}else if(arr[i] instanceof Product) {
				((Product) arr[i]).printProduct();
			}
		}
		
		
		
	}
	
}















