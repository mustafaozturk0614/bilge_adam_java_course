package com.bilgeadam.javaboost.ödev;

import java.util.Scanner;

public class Calculator {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Menu();
		scan.close();
		
	}
	
	public static void Menu() {
		while (true) {
			Calculator calculator = new Calculator();
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
			System.out.println("9-Karakök Bulma");
			System.out.println("10-En büyük sayıyı bulma");
			System.out.println("11-En küçük sayıyı bulma");
			System.out.println("12-Girilen sayı tek mi Çİft mi ?");
			System.out.println("13-Faktöiyel Hesaplama");
			System.out.println("14-Asal Sayı Mı?");
			System.out.println("15-Basamak SAyısı ");
			System.out.println("16-Amstron SAyısı Mı?");
			System.out.println("0-çıkış");
			System.out.println("*****************************************");
			System.out.println("*****************************************");
			System.out.println("Lütfen Yapmak istediğiniz işlem numarasını giriniz:  ");
			int input = scan.nextInt();
			
			switch (input) {
				case 1: {
					System.out.println("\t=======Toplama İşlemi=======");
					
					System.out.println("Toplama sonucu: " + calculator.add());
					Kontrol();
					break;
				}
				
				case 2: {
					System.out.println("\t=======Çıkarma İşlemi=======");
					
					System.out.println("Çıkarma sonucu: " + calculator.extraction());
					Kontrol();
					break;
				}
				case 3: {
					System.out.println("\t=======Çarpma İşlemi=======");
					System.out.println("Çarpma sonucu: " + calculator.multiplication());
					Kontrol();
					break;
				}
				case 4: {
					System.out.println("\t=======Bölme İşlemi=======");
					System.out.println("Bölme sonucu: " + calculator.division());
					Kontrol();
					break;
				}
				case 5: {
					System.out.println("\t=======Üs Alma İşlemi=======");
					System.out.println("sonuç :" + calculator.pow());
					Kontrol();
					break;
				}
				case 6: {
					System.out.println("\t=======Ters Çevirme İşlemi=======");
					System.out.println("ters çevirme işleminin sonucu " + calculator.reversing());
					Kontrol();
					break;
				}
				case 7: {
					System.out.println("\t=======Harf Adeti İşlemi=======");
					System.out.println("Girmiş olduğunuz metinde  aradığınız harf  adeti: " + calculator.findLetter());
					Kontrol();
					break;
				}
				case 8: {
					System.out.println("\t=======Harf Değiştirme İşlemi=======");
					
					System.out.println("değiştirilen metin :" + calculator.changeLetter());
					Kontrol();
					break;
				}
				case 9: {
					System.out.println("\t=======Karekök  İşlemi=======");
					
					System.out.println("Karekök işleminin sonucu :" + calculator.sqr());
					Kontrol();
					break;
				}
				case 10: {
					System.out.println("\t=======En Büyük Değer=======");
					
					System.out.println(calculator.maxNumber());
					Kontrol();
					break;
				}
				case 11: {
					System.out.println("\t=======En Küçük Değer=======");
					
					System.out.println(calculator.minNumber());
					Kontrol();
					break;
				}
				case 12: {
					System.out.println("\t=======Tek mi Çift mi=======");
					
					System.out.println("girdiğiniz sayı :" + calculator.isSingle());
					Kontrol();
					break;
				}
				case 13: {
					System.out.println("\t=======FAktöriyel Bulma=======");
					
					System.out.println(calculator.fac());
					Kontrol();
					break;
				}
				case 14: {
					System.out.println("\t=======FAktöriyel Bulma=======");
					
					System.out.println(calculator.primeNumber());
					Kontrol();
					break;
				}
				case 0: {
					
					System.exit(0);
					break;
				}
				
				default: {
					System.out.println("0-16 arası bir sayı  giriniz");
					Kontrol();
					
					break;
				}
			}
			
		}
	}
	
	public static int readInt(String query) {
		int retVal = -1;
		System.out.print("\t" + query);
		
		retVal = scan.nextInt();
		
		return retVal;
	}
	
	public static String readString(String query) {
		String retVal = null;
		System.out.print(query);
		
		retVal = scan.nextLine();
		
		return retVal;
	}
	
	public int add() {
		
		int num1 = readInt("lütfen 1. sayıyı giriniz");
		int num2 = readInt("lütfen 2. sayıyı giriniz");
		
		return num1 + num2;
		
	}
	
	public String fac() {
		
		int num1 = readInt("lütfen bir sayi giriniz: ");
		int fac = 1;
		if (num1 < 0)
			
			return "lütfen pozitif bir tam sayı giriniz ";
		else {
			while (num1 > 0)
			
			{
				
				fac = num1 * fac;
				num1 = num1 - 1;
				
			}
			return "Girmiş olduğunuz sayısının faktöriyeli: " + fac + "dir ";
			
		}
		
	}
	
	public int multiplication() {
		
		int num1 = readInt("lütfen 1. sayıyı giriniz: ");
		int num2 = readInt("lütfen 2. sayıyı giriniz: ");
		
		return num1 * num2;
		
	}
	
	public int division() {
		
		int num1 = readInt("lütfen 1. sayıyı giriniz: ");
		int num2 = readInt("lütfen 2. sayıyı giriniz: ");
		
		return num1 / num2;
		
	}
	
	public int extraction() {
		
		int num1 = readInt("lütfen 1. sayıyı giriniz: ");
		int num2 = readInt("lütfen 2. sayıyı giriniz: ");
		
		return num1 - num2;
		
	}
	
	public double pow() {
		
		int num1 = readInt("lütfen 1. sayıyı giriniz: ");
		int num2 = readInt("lütfen 2. sayıyı giriniz: ");
		double result = Math.pow(num1, num2);
		
		return result;
		
	}
	
	public String maxNumber() {
		
		int num1 = readInt("lütfen 1. sayıyı giriniz: ");
		int num2 = readInt("lütfen 2. sayıyı giriniz: ");
		
		if (num1 < num2)
			;
		return num1 + "en büyük sayıdır";
	}
	
	public String minNumber() {
		
		int num1 = readInt("lütfen 1. sayıyı giriniz: ");
		int num2 = readInt("lütfen 2. sayıyı giriniz: ");
		if (num1 < num2)
			;
		return num1 + "en küçük sayıdır";
		
	}
	
	public double sqr() {
		
		int num1 = readInt("lütfen 1. sayıyı giriniz: ");
		
		return Math.sqrt(num1);
	}
	
	public String isSingle() {
		
		int num1 = readInt("lütfen 1. sayıyı giriniz: ");
		
		if (num1 % 2 == 0) {
			
			return num1 + " sayısı çift sayıdır";
		} else {
			return num1 + " sayısı tek sayıdır";
		}
		
	}
	
	public String primeNumber() {
		
		int num1 = readInt("lütfen bir sayı giriniz: ");
		boolean Asalmı = true;
		//
		if (num1 == 1)
			
			System.out.println("1 asal bir sayı değildir");
		
		else if (num1 == 2) {
			
			System.out.println("2 en küçük asal sayıdır");
			
		}
		
		else if (num1 > 2) {
			
			for (int i = 2; i < num1; i++) {
				if (num1 % i == 0) {
					Asalmı = false;
					break;
				}
				
			}
			if (Asalmı == false) {
				
				return num1 + " saysısı Asal sayı değildir ";
				
			} else {
				return num1 + "  sayısı Asal bir sayıdır.";
				
			}
		} else {
			return "yanlış bir değer girdiniz";
		}
		return " Teşekkürle";
		
	}
	
	public String reversing() {
		String text = readString("lütfen bir metin giriniz: ");
		
		String tempTxtString = "";
		
		for (int i = text.length() - 1; i >= 0; i--)
		
		{
			tempTxtString = tempTxtString + text.charAt(i);
			
		}
		return tempTxtString;
		
	}
	
	public int findLetter() {
		
		int count = 0;
		String text = readString("lütfen bir metin giriniz: ");
		String karakter = readString("lütfen aranacak harfi giriniz: ");
		
		for (int i = 0; i < text.length(); i++) {
			
			if (text.charAt(i) == (karakter.charAt(0))) {
				count++;
			}
			
		}
		return count;
	}
	
	private static String changeLetter() {
		String text = readString("lütfen bir metin giriniz: ");
		
		int index = text.length() - 1;
		
		if (text.contains("ş") || text.contains("Ş")) {
			
			String yeniMetin = text.toUpperCase().replace("Ş", "S");
			return yeniMetin;
			
		} else {
			return "metin ş harfi içermiyor";
			
		}
		
	}
	
	public static String Kontrol() {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("çıkmak istiyorsanız 'Q' tuşuna basınız ");
		System.out.println("devam etmek için bir tuşa basın ");
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
