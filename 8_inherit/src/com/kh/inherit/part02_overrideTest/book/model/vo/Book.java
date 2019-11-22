package com.kh.inherit.part02_overrideTest.book.model.vo;

public class Book {
	//모든 클래스는 Object 클래스의 후손이다
	//많이 사용하는 메소드를 오버라이딩 해서 쓸 수 있다.
	private String title;
	private String author;
	private int price;
	
	public Book() {}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	//1. toString() 메소드 오버라이딩
	//클래스의 풀 패키지명과 객체의 해쉬코드를 16진수로 변환하여 리턴하는 메소드이다.
	//오버라이딩 하기 위해서는 부모 클래스에 선언된 메소드 헤드와 동일하게 작성해야 하며
	//접근제한자는 같거나 더 넓은 범위로, 리턴타입과 매개변수는 동일하게 작성해야 한다.
	/*public String toString() {
		return title + ", " + author + ", " + price;
	}*/
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	//2. equals() 오버라이딩
	// 두 객체의 주소값을 비교하여 같으면 true, 틀리면 false를 리턴하는 메소드이다.
	//객체가 가진 값까지 비교하기 위한 목적으로 오버라이딩 해서 사용한다.
	public boolean equals(Object obj) {
		//객체의 주소가 같으면 같은객체이다.
		if(this == obj) {
			return true;
		}
		
		//전달받은 객체가 null인 경우 무조건 다른객체이다.
		if(obj == null) {
			return false;
		}
		
		//전달받은 객체를 형변환하여 각 필드별로 비교한다.
		Book other = (Book) obj;
		
		
		//원본 객채의 제목이 null이면 비교할 객체의 제목도 null이어야 하고
		//그렇지 않은 경우 false를 리턴하고 종료함
		if(title == null) {
			if(other.title != null) {
				return false;
			}
		//두 객체의 이름이 서로 다른 경우에도 false를 리턴함
		}else if(!title.equals(other.title)){
			return false;
		}
		
		//작가의 경우도 마찬가지로 비교한다.
		if(author == null) {
			if(other.author != null) {
				return false;
			}
		}else if(!author.equals(other.author)) {
			return false;
		}
		
		//기본 자료형의 경우 값만 일치하는지 비교한다.
		if(price != other.price) {
			return false;
		}
		
		//모든 조건을 만족하면 같은객체다.
		return true;
	}
	
	//3. hashCode 오버라이딩
	public int hashCode() {
		/*final int prime = 31;
		
		int result = 1;
		//필드값이 일치하면 동일한 정수값을 리턴하도록 연산
		result 
		= prime * result + ((author == null)?0:author.hashCode());
		result
		= prime * result + price;
		result
		= prime * result + ((title == null)?0:title.hashCode());
		
		
		return result;*/
		
		return (author + price + title).hashCode();
	}
}





















