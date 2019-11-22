package com.kh.poly.part02_abstractClassAndInterface.product.controller;

import com.kh.poly.part02_abstractClassAndInterface.product.model.vo.Book;
import com.kh.poly.part02_abstractClassAndInterface.product.model.vo.Galaxy;
import com.kh.poly.part02_abstractClassAndInterface.product.model.vo.Product;
import com.kh.poly.part02_abstractClassAndInterface.product.model.vo.SmartPhone;

public class ProductManager {
	public void testPolymorphism() {
		//다형성(Polymorphism)
		//상속 관계에 있는 클래스일 때 부모 클래스형 레퍼런스가
		//후손 객체의 주소를 기록 저장할 수 있다.
		
		//추상클래스를 객체 생성하지 못하고 반드시 상속받은 클래스로 구현해야 한다.
		/*Product p = new Product();*/
		
		Product p1 = new SmartPhone();
		Product p2 = new Galaxy();
		Product p3 = new Book();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		//Object클래스는 모든 클래스의 조상이다
		//부모 클래스 타입으로 자식 객체의 주소를 받을 수 있다.
		Object obj1 = p1;
		Object obj2 = p2;
		Object obj3 = p3;
		
		//후손 클래스 타입으로는 부모 객체의 주소를 받을 수 없다.
		//형변환 하게 되면 이클립스 상에서는 에러가 사라지지만
		//실행시 ClassCastException이 발생한다.
		/*Galaxy g = new SmartPhone();*/
		/*Galaxy g = (Galaxy) new SmartPhone();*/
		
		//자식 클래스의 메소드를 호출하기 위해 부모 레퍼런스롤 자식 레퍼런스로
		//형변환 할 수 있다.
		SmartPhone s1 = new Galaxy();
		s1.printProduct();
		s1.printSmartPhone();
		
		//자식 클래스의 메소드를 호출하기 위해서는
		//부모 레퍼런스를 자식 레퍼런스로 형변환을 해야 한다.(다운캐스팅)
		((Galaxy)s1).printGalaxy();
		
		print(new Book());
	}
	
	public void print(Object obj) {
		//부모 레퍼런스가 후손 객체의 주소를 받는 과정에서
		//자동으로 형변환이 발행함(up casting)
		//=> 부모클래스가 가진 멤버에는 참조할 수 있음
		//=> 후손클래스가 가진 멤버는 다운캐스팅을 해야 참조할 수 있다.
		System.out.println("===============================");
		System.out.println(obj);
		
		//만약 부모가 가진 레퍼런스로 후손 객체가 가진 멤버를 참조할 경우
		//직접 해당 클래스로 형변환 해야 한다.
		
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
		
		//하위 타입을 먼저 작성해야 한다.
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
		//객체 배열에도 다형성 적용 가능하다.
		Object[] arr = new Object[10];
		
		arr[0] = new String("문자열 객체");
		arr[1] = new java.util.Date();
		/*arr[2] = new Product();*/		//추상클래스는 객체 생성 불가
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















