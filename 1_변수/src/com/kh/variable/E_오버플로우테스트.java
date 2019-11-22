package com.kh.variable;

public class E_오버플로우테스트 {
	public void printVarSize() {
		//기본 자료형의 사이즈 테스트
		//눈으로만 확인하는 용도임
		System.out.println("byte의 크기 : " + Byte.BYTES + "byte");
		System.out.println("short의 크기 : " + Short.BYTES + "byte");
		System.out.println("int의 크기 : " + Integer.BYTES + "byte");
		System.out.println("long의 크기 : " + Long.BYTES + "byte");

		System.out.println("float의 크기 : " + Float.BYTES + "byte");
		System.out.println("double의 크기 : " + Double.BYTES + "byte");

		System.out.println("char의 크기 : " + Character.BYTES + "byte");
	}

	public void testOverflow() {
		//byte bnum = 128;  //에러, 범위를 벗어났음
		
		byte bnum = 127;
		bnum = (byte)(bnum + 1);	//byte + int -> int(형변환필요)
		
		System.out.println("bnum : " + bnum);
		
	    
	}
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		
		//에러가 발생하지는 않지만 예상되는 결과값이 나오지 않기 때문에 주의해야 함
		/*int multi = num1 * num2;
		
		System.out.println("계산결과 : " + multi);*/
		
		//해결방법
		//=> 오버플로우를 고려하여 더 큰 자료형을 사용한다.
		long multi = (long)num1 * num2;
		
		System.out.println("계산결과 : " + multi);
	}


	public static void main(String[] args) {
		E_오버플로우테스트 test = new E_오버플로우테스트();
		//test.printVarSize();
		//test.testOverflow();
		test.calc();
	}

}











