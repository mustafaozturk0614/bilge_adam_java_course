package com.bilgeadam.boost.java.ödev;

import java.util.HashMap;
import java.util.Map;

public class Libary {
	static Map<String, Object> bookList = new HashMap();
	
	public static void main(String[] args) {
		
		menu();
		
	}
	
	private static void menu() {
		
		while (true) {
			
			System.out.println("\n\t\t========** KÜTÜPHANE İŞLEMLERİ**======== \n\n");
			System.out.println("1-Kitap Listesi Görüntüle ");
			System.out.println("2-Kitap Ekle ");
			System.out.println("3-Kitap Çıkar");
			System.out.println("4-Kitap Sorgulama");
			System.out.println("5-Çıkış ");
			
			int input = BAUtils.readInt("lütfen bir işlem seçiniz");
			switch (input) {
				case 1: {
					
					System.out.println("\t***KÜTÜPHANE***\n\n");
					
					bookList.entrySet().forEach(System.out::println);
					
					break;
					
				}
				case 2: {
					
					addBook(information());
					
					break;
					
				}
				case 3: {
					System.out.println("Lütfen Çıkarmak istediğiniz kitap bilgelirini  giriniz");
					deleteBook(findBook(information()));
					
					break;
					
				}
				case 4: {
					findBook(information());
					
					break;
					
				}
				case 5: {
					
					System.exit(0);
					break;
					
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + input);
			}
			
		}
		
	}
	
	private static String[] information() {
		String bookName = BAUtils.readString("lütfen Bir Kitap ismi giriniz");
		String writeName = BAUtils.readString("lütfen Kitabın Yazarının ismini giriniz ");
		String[] book = { bookName, writeName };
		return book;
		
	}
	
	private static String[] findBook(String[] book) {
		
		String[] control = { "", "" };
		if (bookList.isEmpty()) {
			System.out.println("Kütüphaneniz Boştur!!!");
			return control;
		}
		
		else {
			
			for (int i = 0; i < book.length - 1;) {
				
				if (bookList.containsKey(book[0])) {
					System.out.println(book[0].toUpperCase() + " adlı kitap Kütüphanenizde  vardır.");
					control[0] = book[0];
					control[1] = book[1];
					return control;
				} else {
					System.out.println("\nAradığınız Kitap Kütüphanenizde kayıtlı değildir\n");
					// int input = BAUtils.readInt("Ana menüye dönmek için '1' tuşuna basınız\n");
					// if (input == 1) {
					System.out.println("Ana Menüye Dönülüyor...\n");
					
					menu();
					// } else {
					// System.out.println("sistemden çıkılıyor...\n");
					// System.exit(0);
					//
					// }
					
					return control;
					
				}
			}
			return control;
			
		}
	}
	
	private static void deleteBook(String[] book) {
		
		if (bookList.isEmpty()) {
			System.out.println("Ana Menüye Dönülüyor...");
			
		} else {
			
			boolean button = BAUtils.wantToEnd("Kitabı  silmek için \'D' tuşuna basınız", "d");
			if (button) {
				
				System.out.println("Ana Menüye Dönülüyor");
				
			} else {
				
				bookList.remove(book[0], book[1]);
				System.out.println(book[0].toUpperCase() + " adlı kitap siliniyor...");
			}
			
		}
	}
	
	// String[] control = findBook(information());
	//
	// if (control[0].toString().equalsIgnoreCase(book[0].toString())
	// && control[1].toString().equalsIgnoreCase(book[1].toString())) {
	//
	// boolean button = BAUtils.wantToEnd("kıitabı silmek için \'D' tuşuna basınız",
	// "d");
	// if (button) {
	//
	// System.out.println("Ana Menüye Dönülüyor");
	//
	// } else {
	//
	// bookList.remove(book[0], book[1]);
	// System.out.println(book[0].toUpperCase() + " adlı kitap siliniyor...");
	//
	// }
	// } else {
	// System.out.println("sistemden çıkılıyor");
	// }
	//
	// }
	
	private static void addBook(String[] book) {
		
		if (bookList.isEmpty()) {
			for (int i = 0; i < book.length - 1; i++) {
				bookList.put(book[i], book[i + 1]);
				
			}
			
		} else {
			for (int i = 0; i < book.length - 1; i++) {
				if (bookList.containsKey(book[0]) && bookList.containsKey(book[1])) {
					System.out.println("kitap daha önce eklenmiştir");
				} else {
					bookList.put(book[i], book[i + 1]);
					
				}
				
			}
			
		}
		
	}
	
}
