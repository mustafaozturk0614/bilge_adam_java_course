package com.bilgeadam.boost.java.file;

import java.util.List;

import com.bilgeadam.boost.java.libary.book.Book;

public interface IFile {
	
	boolean isExsist();
	
	void writeOfBooksFile(Book book);
	
	void createOfBooksFile(Boolean isExist);
	
	void addOfBookList(Book book);
	
	List<String> readOfBooksFile();
	
}
