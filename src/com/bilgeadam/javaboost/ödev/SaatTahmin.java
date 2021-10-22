package com.bilgeadam.javaboost.ödev;

import java.util.Date;
import java.util.Scanner;

public class SaatTahmin {
	static int hak = 10;
	static int howcount = 1;
	static Scanner scanner = new Scanner(System.in);
	
	public static void saatTahmin(int tahmin) {
		
		Date nowDate = new Date();
		int hour = nowDate.getHours();
		
		// OffsetTime denemeOffsetTime = OffsetTime.now(); 2 YÖNTEMDE KULLANILABİLİR
		// denemeOffsetTime.getHour();
		// System.out.println(denemeOffsetTime.getHour());
		try {
			
			while (hak > 0) {
				
				// System.out.println("lütfen tahmini bir saat giriniz\n");
				// String tahmin1 = scanner.nextLine();
				//
				// char karakter = String.valueOf(tahmin1).charAt(0);
				// System.out.println(karakter);
				//
				// if (Character.isDigit(karakter)) {
				// int tahmin = Integer.parseInt(tahmin1);
				// tahmin = Math.abs(tahmin);
				//
				// if (tahmin > 24 || tahmin == 0) {
				// System.out.println("Lütfen 1 ile 24 arası sayılar giriniz");
				// hak--;
				// System.out.println(hak + " hakkınız kaldı\n");
				if (tahmin > hour) {
					if ((tahmin - hour) <= 2) {
						System.out.println("AZ KALDI\n");
						hak--;
						System.out.println(hak + " hakkınız kaldı\n");
						getResult();
						
					} else {
						System.out.println("arada çok fark var sayıyı küçültün\n");
						hak--;
						System.out.println(hak + " hakkınız kaldı\n");
						getResult();
						
					}
					
				}
				
				else if (hour > tahmin) {
					if ((hour - tahmin) <= 2) {
						System.out.println("AZ KALDI\n");
						hak--;
						System.out.println(hak + " hakkınız kaldı\n");
						getResult();
						
					} else {
						System.out.println("arada çok fark var sayıyı büyültün\n");
						hak--;
						System.out.println(hak + " hakkınız kaldı\n");
						getResult();
						
					}
					
				}
				
				else {
					System.out.println("tebrikler");
					System.out.println(10 - hak + 1 + ".denemede bildiniz");
					if (replay()) {
						getResult();
					} else {
						break;
					}
				}
				
			}
			if (hak == 0) {
				replay();
			}
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Boolean replay() {
		boolean result = true;
		System.out.println("tekrar oynamak istermisiniz? E H ");
		String choseString = scanner.nextLine();
		if (choseString.equalsIgnoreCase("e")) {
			howcount++;
			hak = 10;
			result = true;
			return result;
			
		} else {
			System.out.println(howcount + "kere oynadınız GÜLE GÜLE..");
			result = false;
			return result;
		}
		
	}
	
	public static void getResult() {
		while (true) {
			System.out.println("****Saat tahmin****\n");
			System.out.println(hak + " Hakkınız var\n");
			System.out.println("lütfen tahmini bir saat giriniz\n");
			String simge = scanner.nextLine();
			
			char karakter = simge.charAt(0);
			System.out.println(karakter);
			
			if (Character.isDigit(karakter)) {
				int tahmin = Integer.parseInt(simge);
				saatTahmin(tahmin);
			} else if (Character.isLetter(karakter)) {
				System.out.println("Harf girdiniz Lütfen sayı geiriniz");
				getResult();
			} else {
				System.out.println("1-24 arası bir sayı giriniz");
			}
			
		}
	}
	
	public static void main(String[] args) {
		getResult();
	}
}
