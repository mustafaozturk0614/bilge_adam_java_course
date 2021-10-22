package com.bilgeadam.boost.java.libary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.boost.java.libary.book.Book;

public class Libary implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6564576931102177740L;
	private String libaryName;
	private String adress;
	private String countOfRoom;
	private BookShelf[] capacitiyBookShelfs;
	private List<Book> bookList;
	
	public Libary() {
		this.bookList = new ArrayList<Book>();
	}
	
	public Libary(String libaryName, String adress, String countOfRoom, BookShelf[] capacitiyBookShelfs) {
		this();
		this.libaryName = libaryName;
		this.adress = adress;
		this.countOfRoom = countOfRoom;
		this.capacitiyBookShelfs = capacitiyBookShelfs;
		
	}
	
	public String getLibaryName() {
		return libaryName;
	}
	
	public void setLibaryName(String libaryName) {
		this.libaryName = libaryName;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getCountOfRoom() {
		return countOfRoom;
	}
	
	public void setCountOfRoom(String countOfRoom) {
		this.countOfRoom = countOfRoom;
	}
	
	public BookShelf[] getCapacitiyBookShelfs() {
		return capacitiyBookShelfs;
	}
	
	public void setCapacitiyBookShelfs(BookShelf[] capacitiyBookShelfs) {
		this.capacitiyBookShelfs = capacitiyBookShelfs;
	}
	
	public List<Book> getBookList() {
		return bookList;
	}
	
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
}
