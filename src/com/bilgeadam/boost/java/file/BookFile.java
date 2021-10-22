package com.bilgeadam.boost.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.boost.java.libary.book.Book;

public class BookFile implements IFile, Serializable {
	
	private static final long serialVersionUID = 3841419849941649879L;
	protected static String pathString;
	protected static File file;
	protected List<String> booksFileDataList;
	
	public BookFile() {
		pathString = "E:\\file\\libary\\libary.txt";
		file = new File(pathString);
		booksFileDataList = new ArrayList<String>();
	}
	
	@Override
	
	public List<String> readOfBooksFile() {
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			
			while (true) {
				String lineString = bufferedReader.readLine();
				if (lineString == null) {
					break;
				}
				
				booksFileDataList.add(lineString);
				
			}
			
			return booksFileDataList;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return booksFileDataList;
	}
	
	@Override
	
	public void createOfBooksFile(Boolean isExist) {
		if (!isExsist()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			
		}
		
	}
	
	@Override
	
	public void writeOfBooksFile(Book book) {
		booksFileDataList = readOfBooksFile();
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
			if (!booksFileDataList.contains((book.getBookName() + "-" + book.getAuthorName()))) {
				bufferedWriter.write(book.getAuthorName() + "-" + book.getBookName() + "\n");
				System.out.println("kitap kütüphaneye eklendi");
				
			} else {
				System.out.println("kitap vardır");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public boolean isExsist() {
		boolean result = true;
		
		if (file.exists()) {
			result = true;
			
		} else {
			result = false;
		}
		return result;
		
	}
	
	@Override
	
	public void addOfBookList(Book book) {
		boolean result = findBook(book);
		if (result) {
			book.getLibary().getBookList().add(book);
			System.out.println("kitap kütüphanenizde vardır Lütfen bilgilerinizi kontrol ediniz");
			
		} else {
			
		}
		
	}
	
	public boolean findBook(Book book) {
		boolean result = true;
		if (book.getLibary().getBookList().contains(book.getBookName() + "-" + book.getAuthorName())) {
			
			result = false;
			return result;
		} else {
			result = true;
			return result;
		}
		
	}
	
	public static String getPathString() {
		return pathString;
	}
	
	public static void setPathString(String pathString) {
		BookFile.pathString = pathString;
	}
	
	public static File getFile() {
		return file;
	}
	
	public static void setFile(File file) {
		BookFile.file = file;
	}
	
	public List<String> getBooksFileDataList() {
		return booksFileDataList;
	}
	
	public void setBooksFileDataList(List<String> booksFileDataList) {
		this.booksFileDataList = booksFileDataList;
	}
	
	public void serializable(Book book) {
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("E:\\file\\libary\\steril.txt", true))) {
			oos.writeObject(book);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void deserilazble(Book book) {
		File a = new File("E:\\file\\libary\\steril.txt");
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(a))) {
			
			while (true) {
				book = (Book) ois.readObject();
				
				for (int i = 0; i < a.length(); i++) {
					
					book.getLibary().getBookList().set(i, book);
					
				}
				book.getLibary().getBookList().stream().forEach(System.out::println);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
