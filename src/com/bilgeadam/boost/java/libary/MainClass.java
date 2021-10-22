package com.bilgeadam.boost.java.libary;

import java.util.Scanner;

import com.bilgeadam.boost.java.file.BookFile;
import com.bilgeadam.boost.java.libary.book.Book;
import com.bilgeadam.boost.java.libary.book.BookManeger;

public class MainClass {
	Scanner scanner = new Scanner(System.in);
	BookFile file = new BookFile();
	BookManeger bookManeger = new BookManeger();
	Book book = new Book();
	
	public void menu() {
		System.out.println("\t\t====>KÜTÜPHANE İŞLEMLERİ<=====\n");
		System.out.println("1-Kitap Ekle");
		System.out.println("2-Kitap Sil");
		System.out.println("3-Kitap Sorgula");
		System.out.println("4-Kitap Listesi");
		System.out.println("5-Çıkış\n");
		System.out.println("lütfen yapmak istediğiniz islemi şeçiniz");
		String input = scanner.nextLine();
		
		switch (input) {
			case "1":
				file.createOfBooksFile(file.isExsist());
				book = bookManeger.createBook(book);
				file.writeOfBooksFile(book);
				file.serializable(book);
				file.deserilazble(book);
				// file.addOfBookList(book);
				
				// file.getBooksFileDataList().stream().forEach(System.out::println);
				// System.out.println(book.getLibary().getBookList().size());
				
				// System.out.println(file.getBooksFileDataList().size());
				// book.getLibary().getBookList().stream().forEach(System.out::println);
				break;
			case "2":
				file.readOfBooksFile();
				break;
			case "3":
				
				break;
			case "4":
				
				break;
			case "5":
				
				break;
			
			default:
				break;
		}
		
	}
	
	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
		mainClass.menu();
	}
	
}
