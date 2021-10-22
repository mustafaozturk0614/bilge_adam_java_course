package com.bilgeadam.boost.java.libary.book;

import java.io.Serializable;
import java.time.LocalDate;

import com.bilgeadam.boost.java.libary.ETypeOfBook;
import com.bilgeadam.boost.java.libary.Libary;

public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1018984254651446020L;
	protected String bookName;
	protected String authorName;
	protected LocalDate publishingDate;
	protected ETypeOfBook typeOfBook;
	protected Libary libary;
	
	public Book() {
		
	}
	
	public Libary getLibary() {
		return libary;
	}
	
	public void setLibary(Libary libary) {
		this.libary = libary;
	}
	
	public Book(String bookName, String authorName, LocalDate publishingDate, ETypeOfBook typeOfBook) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishingDate = publishingDate;
		this.typeOfBook = typeOfBook;
	}
	
	public Book(String bookName, String authorName, LocalDate publishingDate) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishingDate = publishingDate;
	}
	
	@Override
	public String toString() {
		return "KİTAP BİLGİLERİ=>[Kitap İsmi=" + bookName + ", Yazar Adı=" + authorName + ",Yayınlanma Tarihi="
				+ publishingDate + ", Kitap Türü=" + typeOfBook + "Kütüphane=" + "(" + getLibary() + ")" + "]";
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public LocalDate getPublishingDate() {
		return publishingDate;
	}
	
	public void setPublishingDate(LocalDate publishingDate) {
		this.publishingDate = publishingDate;
	}
	
	public ETypeOfBook getTypeOfBook() {
		return typeOfBook;
	}
	
	public void setTypeOfBook(ETypeOfBook typeOfBook) {
		this.typeOfBook = typeOfBook;
	}
	
}
