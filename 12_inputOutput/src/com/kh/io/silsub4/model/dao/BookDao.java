package com.kh.io.silsub4.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

import com.kh.io.silsub4.model.vo.Book;

public class BookDao {
	public void fileSave(){
		Book[] brr = {new Book("�ڹ�������", "���ü�", 30000, new GregorianCalendar(2000,01,01), 0.1),
						new Book("ȫ�浿��", "���", 60000, new GregorianCalendar(1800,01,02), 0.2),
						new Book("Ī�����������߰��Ѵ�", "��", 34000, new GregorianCalendar(2001,05,01), 0.13),
						new Book("�����ǲ�", "����", 20000, new GregorianCalendar(1998,03,01), 0.15),
						new Book("�����̰���ƿø�������", "������", 40000, new GregorianCalendar(1880,01,03), 0.3)};
		
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"));){
			
			
			for (int i = 0; i < brr.length; i++) {
				oos.writeObject(brr[i]);
			}
			
			System.out.println("books.dat �� ���� �Ϸ�!");
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead(){
		Book[] brr = new Book[10];
		
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"));){
			
			
			for (int i = 0; i < brr.length; i++) {
				brr[i] = (Book) ois.readObject();
				System.out.println(brr[i]);
			}
			
			
			
		} catch(EOFException e){
			System.out.println("books.dat �б� �Ϸ�!");
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
