package com.kh.array;

import java.util.Scanner;

public class A_array {
	public void testArray() {
		//배열 사용 이유
		//배열을 사용하지 않으면 변수를 여러개 사용해야 한다.
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int sum = 0;
		
		//반복문을 사용하지 못함
		/*for(int i = 1; i < 6; i++) {
			sum += numi;
		}*/
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		
		//배열 이용
		int[] arr = new int[5];
		
		/*arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;*/
		
		//값을 대입할 때도 반복문을 사용할 수 있다.
		for(int i = 0, value = 0; i < arr.length; i++) {
			arr[i] = value += 10;
		}
		
		int sum2 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
	}
	
	public void testArray2() {
		//배열의 사용 방법
		//배열의 선언
		//자료형[] 변수명;
		//자료형 변수명[]; 의 형식으로 선언할 수 있다.
		
		//선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다.
		int[] iarr;
		char carr[];
		
		//선언한 레퍼런스변수에 배열을 할당하여 대입할 수 있다.
		/*iarr = new int[];*/	//크기를 지정해 주지 않아서 에러 발생
		iarr = new int[5];
		carr = new char[10];
		
		//선언과 할당을 동시에 할 수도 있다.
		int[] iarr2 = new int[5];
		char carr2[] = new char[10];
		
		System.out.println("iarr2 : " + iarr2);
		System.out.println("carr2 : " + carr2);
		
		//해쉬코드는 실제 주소값이 아니고, 실제 주소를 찾기 위한 key역할을 한다.
		//자바에서는 직접적으로 하드웨어에 접근할 수 없기 때문에 정확한 메모리 주소를
		//알 수 없다.
		//따라서 해쉬코드가 주소라고 생각할 순 없지만, 현재까지는 주소라고 생각해도
		//상관 없다.
		System.out.println("iarr2 : " + iarr2.hashCode());
		System.out.println("carr2 : " + carr2.hashCode());
		
		System.out.println("iarr2의 길이 : " + iarr2.length);
		System.out.println("carr2의 길이 : " + carr2.length);
		
		//스캐너를 통해 입력받은 정수로 배열의 길이를 지정하여
		//배열을 할당할 수 있다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		
		System.out.println("darr의 hashcode : " + darr.hashCode());
		System.out.println("darr의 길이 : " + darr.length);
		
		darr = new double[30];
		
		System.out.println("수정 후 darr의 hashcode : " + darr.hashCode());
		System.out.println("수정 후 darr의 길이 : " + darr.length);
		
		//한번 할당된 배열은 지울 수 없다.
		//다만 레퍼런스 변수를 null로 변경하여 더 이상 참조할 주소가 없게 된 배열은
		//일정 시간이 지난 후 heap의 old영역으로 이동하여 GC(가비지 컬렉터)가 삭제시킨다.
		//그리고 다시는 이전에 참조하던 배열을 다시 참조할 수 없다.
		darr = null;
		
		//NullPointerException이 발생함
		//아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있을 때
		//발생하는 에러이다.
		//System.out.println("삭제 후 darr의 길이 : " + darr.length);
		
		//만약 NullPointerException을 방지하려면
		//if문으로 null check를 해 주어야 한다.
		if(darr != null) {
			System.out.println("삭제 후 darr의 길이 : " + darr.length);
		}
	}
	public void testArray3() {
		//기본적으로 배열을 선언하고 할당을 하면 JVM이 지정한 값으로
		//배열이 초기화 된다.
		//heap영역은 값이 없는 공간이 존재할 수 없기 때문이다.
		int[] iarr = new int[5];
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.println("iarr[" + i + "]의 값 : " + iarr[i]);
		}
		//jvm이 정한 기본값 외의 값으로 초기화를 하고 싶은 경우 블럭을 이용한다.
		//블럭을 사용하는 경우 new를 사용하지 않아도 되며,
		//값의 갯수만큼 자동으로 크기가 설정된다.
		/*int[] iarr2 = {11,22,33,44,55};*/
		int[] iarr2 = new int[] {11,22,33,44,55};
		
		System.out.println("iarr2의 길이 : " + iarr.length);
		
		//문자열도 배열로 사용할 수 있다.
		String[] sarr = {"apple", "banana", "grape", "orange"};
		
		for(int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i]);
		}
		
	}
}






















