package com.bilgeadam.boost.java.libary.book;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.bilgeadam.boost.java.libary.BookShelf;
import com.bilgeadam.boost.java.libary.ETypeOfBook;
import com.bilgeadam.boost.java.libary.Libary;

public class BookManeger implements IBook, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Scanner scanner = new Scanner(System.in);
	Book book;
	
	public BookManeger() {
		this.book = book;
	}
	
	public BookManeger(Book book) {
		this.book = book;
		
	}
	
	@Override
	public Book createBook(Book book1) {
		book1 = choseClass();
		System.out.println("Lütfen kitabın ismini giriniz");
		book1.setBookName(scanner.nextLine());
		System.out.println("Lütfen yazar ismini giriniz");
		book1.setAuthorName(scanner.nextLine());
		book1.setPublishingDate(convertDate());
		book1.setLibary(new Libary("milli kütüphane", "ankara", "80", new BookShelf[40]));
		System.out.println(book1.toString());
		return book1;
	}
	
	@Override
	public LocalDate convertDate() {
		DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Lütfen Basım Tarihini giriniz ismini giriniz");
		String inputString = scanner.nextLine();
		
		LocalDate date = LocalDate.parse(inputString, fullFormat);
		
		return date;
		
	}
	
	public Book choseClass() {
		
		FictionBook fictionBook;
		NonFiction nonFiction;
		System.out.println("lütfen kitap türü giriniz");
		String type = scanner.nextLine();
		if (ETypeOfBook.FİCTİON.getName().equalsIgnoreCase(type)) {
			book = new FictionBook();
			fictionBook = (FictionBook) book;
			System.out.println("lütfen alt türü giriniz");
			String subType = scanner.nextLine();
			fictionBook.setSubTypeOFBook(subType);
			
			return fictionBook;
			
		} else {
			book = new NonFiction();
			return nonFiction = (NonFiction) book;
		}
		
	}
	
	public Book getBook() {
		return book;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	public static void main(String[] args) {
		Book book = new Book();
		BookManeger bookManeger = new BookManeger(book);
		bookManeger.createBook(book);
		
	}
	
}
