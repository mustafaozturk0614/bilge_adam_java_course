package com.bilgeadam.boost.java.libary.book;

import java.time.LocalDate;

import com.bilgeadam.boost.java.libary.ETypeOfBook;

public class FictionBook extends Book {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String subTypeOFBook;
	
	public FictionBook() {
		typeOfBook = ETypeOfBook.FİCTİON;
	}
	
	public FictionBook(String bookName, String authorName, LocalDate publishingDate, ETypeOfBook typeOfBook,
			String subTypeOFBook) {
		super(bookName, authorName, publishingDate, typeOfBook);
		this.subTypeOFBook = subTypeOFBook;
	}
	
	public void a() {
		
	}
	
	public String getSubTypeOFBook() {
		return subTypeOFBook;
	}
	
	public void setSubTypeOFBook(String subTypeOFBook) {
		this.subTypeOFBook = subTypeOFBook;
	}
	
	@Override
	public String toString() {
		return "FictionBook [subTypeOFBook=" + subTypeOFBook + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", publishingDate=" + publishingDate + ", typeOfBook=" + typeOfBook + ", libary=" + libary + "]";
	}
	
}
