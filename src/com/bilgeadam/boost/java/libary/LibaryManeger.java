package com.bilgeadam.boost.java.libary;

import java.io.Serializable;
import java.util.Scanner;

import com.bilgeadam.boost.java.file.BookFile;
import com.bilgeadam.boost.java.libary.book.Book;
import com.bilgeadam.boost.java.libary.book.BookManeger;

public class LibaryManeger implements ILibary, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BookFile file;
	static Scanner scanner = new Scanner(System.in);
	
	@Override
	public void addBook(Book book, BookFile file) {
		System.out.println("Kitabı eklemek için '+' tusa basnız");
		
	}
	
	@Override
	public void deleteBook() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	
	public void findBook(Book book) {
		
		System.out.println("lütfen bulmak istediğiniz kitap isminiz giriniz");
		String name = scanner.nextLine().trim();
		System.out.println("lütfen bulmak istediğiniz yazar isminiz giriniz");
		
	}
	
	@Override
	
	public void listBook(Book book) {
		if (book.getLibary().getBookList().contains(book)) {
			
		} else {
			int i = book.getLibary().getBookList().size();
			book.getLibary().getBookList().set(i, book);
			
		}
		
	}
	
	@Override
	public void writeToBook() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void readToBook() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		BookManeger bookManeger = new BookManeger();
		Book book = new Book();
		
		BookFile bookFile = new BookFile();
		bookFile.writeOfBooksFile(bookManeger.createBook(book));
	}
}
