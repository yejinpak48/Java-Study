package com.kh.inherit.part02_overrideTest.book.model.vo;

public class Book {
	//��� Ŭ������ Object Ŭ������ �ļ��̴�
	//���� ����ϴ� �޼ҵ带 �������̵� �ؼ� �� �� �ִ�.
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

	
	//1. toString() �޼ҵ� �������̵�
	//Ŭ������ Ǯ ��Ű����� ��ü�� �ؽ��ڵ带 16������ ��ȯ�Ͽ� �����ϴ� �޼ҵ��̴�.
	//�������̵� �ϱ� ���ؼ��� �θ� Ŭ������ ����� �޼ҵ� ���� �����ϰ� �ۼ��ؾ� �ϸ�
	//���������ڴ� ���ų� �� ���� ������, ����Ÿ�԰� �Ű������� �����ϰ� �ۼ��ؾ� �Ѵ�.
	/*public String toString() {
		return title + ", " + author + ", " + price;
	}*/
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	//2. equals() �������̵�
	// �� ��ü�� �ּҰ��� ���Ͽ� ������ true, Ʋ���� false�� �����ϴ� �޼ҵ��̴�.
	//��ü�� ���� ������ ���ϱ� ���� �������� �������̵� �ؼ� ����Ѵ�.
	public boolean equals(Object obj) {
		//��ü�� �ּҰ� ������ ������ü�̴�.
		if(this == obj) {
			return true;
		}
		
		//���޹��� ��ü�� null�� ��� ������ �ٸ���ü�̴�.
		if(obj == null) {
			return false;
		}
		
		//���޹��� ��ü�� ����ȯ�Ͽ� �� �ʵ庰�� ���Ѵ�.
		Book other = (Book) obj;
		
		
		//���� ��ä�� ������ null�̸� ���� ��ü�� ���� null�̾�� �ϰ�
		//�׷��� ���� ��� false�� �����ϰ� ������
		if(title == null) {
			if(other.title != null) {
				return false;
			}
		//�� ��ü�� �̸��� ���� �ٸ� ��쿡�� false�� ������
		}else if(!title.equals(other.title)){
			return false;
		}
		
		//�۰��� ��쵵 ���������� ���Ѵ�.
		if(author == null) {
			if(other.author != null) {
				return false;
			}
		}else if(!author.equals(other.author)) {
			return false;
		}
		
		//�⺻ �ڷ����� ��� ���� ��ġ�ϴ��� ���Ѵ�.
		if(price != other.price) {
			return false;
		}
		
		//��� ������ �����ϸ� ������ü��.
		return true;
	}
	
	//3. hashCode �������̵�
	public int hashCode() {
		/*final int prime = 31;
		
		int result = 1;
		//�ʵ尪�� ��ġ�ϸ� ������ �������� �����ϵ��� ����
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





















