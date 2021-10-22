package com.bilgeadam.javaboost.ödev;

import java.util.Scanner;

public class Odev003_TekmiCiftmi {
	
	public static void main(String[] args) {
		
		while (true) {
			System.out.print("Lütfen bir adet tam sayı giriniz:  ");
			
			Scanner sc = new Scanner(System.in);
			int sayi = sc.nextInt();
			
			if (sayi < 0)
				break;
			
			else if (sayi >= 0) {
				if (sayi % 2 == 0) {
					System.out.println("\nGirdiğiniz sayı Çift sayıdır  ");
					
				} else {
					System.out.println("\nGirdiğiniz sayı Tek sayıdır");
				}
				
			} else {
				System.out.println("\nyanlış bir  değer girdiniz");
			}
			System.out.print("\nDevam etmek için herhangi bir tuşa basınız Çıkmak için Q tuşuna basınız");
			String ex = sc.next();
			if (ex.equalsIgnoreCase("q") || ex.equalsIgnoreCase("Q")) {
				;
				System.out.println("\nSistemden Çıkılıyor");
				sc.close();
				break;
			} else {
				continue;
			}
			
		}
		
	}
	
}
