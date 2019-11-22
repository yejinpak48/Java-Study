package com.kh.api.part01_string.controller;

import java.util.StringTokenizer;

public class StringTestManager {
	
	public void stringTest() {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		
		System.out.println("s1과 s2가 주소가 같은지 비교 : " + (s1 == s2));
		System.out.println("s1과 s3이 주소가 같은지 비교 : " + (s1 == s3));
		
		//값을 비교하기 위해 String 클래스는 Object클래스의 equeals()메소드를
		//오버라이딩 해 놓았다.
		System.out.println("s1과 s2의 값이 같은지 비교 : " + (s1.equals(s2)));
		System.out.println("s1과 s3의 값이 같은지 비교 : " + (s1.equals(s3)));
		
		//String클래스에서는 Object클래스의 hashCode를 오버라이딩 해 놓았다.
		//문자열이 같으면 동일한 해쉬코드를 리턴하게 작성하였음
		//동등객체를 동일객체 취급을 하기 위함
		System.out.println("s1의 hashCode : " + s1.hashCode());
		System.out.println("s2의 hashCode : " + s2.hashCode());
		/*System.out.println("s3의 hashCode : " + s3.hashCode());*/
		
		s2 += "oracle";
		
		System.out.println("s1의 해쉬코드 : " + s1.hashCode());
		System.out.println("s2의 해쉬코드 : " + s2.hashCode());
		
		System.out.println("s1의 주소값과 s2의 비교값이 변경 후에도 같은지 비교 : " 
											+ (s1 == s2));
	}
	
	public void stringBuilderTest() {
		//StringBuilder는 문자열을 저장하기 위한 객체이다.
		//문자열 저장소에 저장하는 것이 아닌 객체를 통해 저장을 한다.
		StringBuilder sb = new StringBuilder("java");
		
		System.out.println("sb의 값 : " + sb);
		System.out.println("sb의 hashCode : " + sb.hashCode());
		
		//기존 문자열에 문자열을 추가하는 메소드
		sb.append("oracle");
		System.out.println("sb의 값 : " + sb);
		
		//자주 변경되는 문자열의 경우 String보다 StringBuilder가 더 효율적이다.
		System.out.println("sb의 hashCode : " + sb.hashCode());
	}
	
	public void splitTest() {
		String str = "java,oracle,JDBC,HTML5,CSS3";
		
		String[] split = str.split(",");
		
		System.out.println("분리된 문자열 갯수 split : " + split.length);
		
		/*for(int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}*/
		
		//배열 또는 컬렉션 사용시 향상된 for문을 사용할 수 있다.
		for(String s : split) {
			System.out.println(s);
		}
		
		//분리한 문자열을 String배열로 처리하고 싶을 때는 split을 사용하면 되고,
		//분리된 문자열을 객체로 취급하기 위해서는 StringTokenizer 클래스를
		//사용하여 분리한다.
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("분리된 문자열의 갯수 stn : " + stn.countTokens());
	
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
		System.out.println("값을 꺼낸 후 문자열의 갯수 stn : " + stn.countTokens());
	
	}
}



















