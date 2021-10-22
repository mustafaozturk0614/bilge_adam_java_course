package com.bilgeadam.boost.java.libary;

import com.bilgeadam.boost.java.file.BookFile;
import com.bilgeadam.boost.java.libary.book.Book;

public interface ILibary {
	
	void addBook(Book book, BookFile file);
	
	void deleteBook();
	
	void writeToBook();
	
	void readToBook();
	
	void findBook(Book book);
	
	void listBook(Book book);
	
}
