package com.bilgeadam.boost.java.ödev;

import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		AnaMenu();
		
	}
	
	public static void AnaMenu() {
		Scanner scanner = new Scanner(System.in);
		String userMail, UserPassword;
		String dbMail = SabitVeri.DB_EMAIL;
		String dbPassword = SabitVeri.DB_PASSWORD;
		int hak = 4;
		
		while (hak >= 1) {
			
			System.out.println("\t\t===GİRİŞ SAYFASI===");
			System.out.println("E-mail Adresinizi Giriniz: ");
			userMail = scanner.nextLine().trim();
			System.out.println("Şifrenizi Giriniz: ");
			UserPassword = scanner.nextLine().trim();
			if (userMail.equalsIgnoreCase(dbMail) && UserPassword.equals(dbPassword)) {
				
				System.out.println("*****************************");
				System.out.println("Admin Sayfasına Yönlendiriliyorsunuz ");
				HesapMakinesi();
				System.out.println("------------------------------------");
				
			} else {
				hak--;
				
				System.out.println("Email veya şifre yanlış girdiniz");
				System.out.println("kalan hakkınız: " + (hak));
				System.out.println("------------------------------------");
				
				if (hak == 0) {
					System.out.println(
							"4 kere yanlış hakkınız kartınız bloke oldu müşteri hizmetlerini arayınız 444 555 99622");
					// System.exit(0);
					break;
					
				}
				
			}
		}
	}
	
	private static void HesapMakinesi() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("\t\t=======HESAP MAKİNESİ=======");
		System.out.println();
		System.out.println("1-Toplama İşlemi ");
		System.out.println("2-Çıkarma İşlemi ");
		System.out.println("3-Çarpma İşlemi ");
		System.out.println("4-Bölme İşlemi ");
		System.out.println("5-Üs alma İşlemi ");
		System.out.println("6-Kelimeyi Ters Çevirme ");
		System.out.println("7-Kelimedeki A Adetini Bulma ");
		System.out.println("8-Kelimede ki 'Ş' harfini  'S' e çevirme");
		System.out.println("0-çıkış");
		System.out.println("*****************************************");
		System.out.println("*****************************************");
		System.out.println("Lütfen Yapmak istediğiniz işlem numarasını giriniz:  ");
		
		int input = klavye.nextInt();
		Character character = Character.valueOf((char) input);
		
		if (Character.isDigit(character)) {
			System.out.println("lütfen 0-8 arası bir sayı giriniz: ");
		}
		
		else {
			switch (input) {
				case 1: {
					System.out.println("\t=======Toplama İşlemi=======");
					
					System.out.println("Toplama sonucu: " + Toplama());
					Kontrol();
					break;
				}
				
				case 2: {
					System.out.println("\t=======Çıkarma İşlemi=======");
					
					System.out.println("Çıkarma sonucu: " + Cıkarma());
					Kontrol();
					break;
				}
				case 3: {
					System.out.println("\t=======Çarpma İşlemi=======");
					System.out.println("Çarpma sonucu: " + Carpma());
					Kontrol();
					break;
				}
				case 4: {
					System.out.println("\t=======Bölme İşlemi=======");
					System.out.println("Bölme sonucu: " + Bölme());
					Kontrol();
					break;
				}
				case 5: {
					System.out.println("\t=======Üs Alma İşlemi=======");
					System.out.println("sonuç :" + UsAlma());
					Kontrol();
					break;
				}
				case 6: {
					System.out.println("\t=======Ters Çevirme İşlemi=======");
					System.out.println("ters çevirme işleminin sonucu " + TersCevirme());
					Kontrol();
					break;
				}
				case 7: {
					System.out.println("\t=======Harf Adeti  İşlemi=======");
					System.out.println("Girmiş olduğunuz metindeki 'a' adeti: " + Sayma());
					Kontrol();
					break;
				}
				case 8: {
					System.out.println("\t=======Harf Değiştirme İşlemi=======");
					
					System.out.println("yeni metin :" + HarfDegistirme());
					Kontrol();
					break;
				}
				case 0: {
					
					System.exit(0);
					break;
				}
				
				default: {
					System.out.println("0-8 arası bir sayı  giriniz");
					Kontrol();
					
					break;
				}
				
			}
		}
		
	}
	
	private static int Toplama() {
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = klavye.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = klavye.nextInt();
		
		return sayi1 + sayi2;
		
	}
	
	private static int Cıkarma() {
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = klavye.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = klavye.nextInt();
		
		return sayi1 - sayi2;
	}
	
	private static int Carpma() {
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = klavye.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = klavye.nextInt();
		
		return sayi1 * sayi2;
	}
	
	private static int Bölme() {
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = klavye.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = klavye.nextInt();
		
		return sayi1 / sayi2;
	}
	
	private static double UsAlma() {
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = klavye.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = klavye.nextInt();
		double us = Math.pow(sayi1, sayi2);
		
		return us;
		
	}
	
	private static String TersCevirme() {
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("Bir metin giriniz: ");
		String metin = klavye.next();
		String yenimetin = "";
		int index = metin.length() - 1;
		
		while (index >= 0) {
			yenimetin = yenimetin + metin.charAt(index);
			index--;
			
		}
		return yenimetin;
		
	}
	
	public static int Sayma() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir metin giriniz ");
		String metin = klavye.nextLine();
		String yenimetin = "";
		int index = metin.length() - 1;
		int sayaç = 0;
		
		while (true) {
			int indexA = metin.indexOf("a");
			
			if (indexA == -1) {
				
				return sayaç;
				
			} else {
				metin = metin.substring(indexA + 1);
				
				sayaç = sayaç + 1;
				
			}
		}
		
	}
	
	private static String HarfDegistirme() {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir metin giriniz ");
		String metin = klavye.nextLine();
		
		int index = metin.length() - 1;
		
		if (metin.contains("ş") || metin.contains("Ş")) {
			
			String yeniMetin = metin.toUpperCase().replace("Ş", "S");
			return yeniMetin;
			
		} else {
			return "metin ş harfi içermiyor";
			
		}
		
	}
	
	public static String Kontrol() {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("çıkmak istiyorsanız 'Q' tuşuna basınız");
		System.out.println("devam etmek için bir tuşa basın");
		String knt = klavye.nextLine();
		while (true) {
			
			if (knt.equalsIgnoreCase("Q")) {
				System.out.println("sistemden çıkılıyor");
				System.exit(0);
				
			} else {
				System.out.println("devam ediliyor...");
				break;
				
			}
			
		}
		return knt;
		
	}
}