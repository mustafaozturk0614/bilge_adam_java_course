package com.bilgeadam.boost.java.ödev;

import java.util.Date;
import java.util.Scanner;

public class SaatTahmin2 {
	static int hak = 10;
	static int howcount = 1;
	static Scanner scanner = new Scanner(System.in);
	static int tahmin;
	
	public static void saatTahmin() {
		
		Date nowDate = new Date();
		int hour = nowDate.getHours();
		System.out.println(hour);
		// OffsetTime denemeOffsetTime = OffsetTime.now(); 2 YÖNTEMDE KULLANILABİLİR
		// denemeOffsetTime.getHour();
		// System.out.println(denemeOffsetTime.getHour());
		
		try {
			while (hak > 0) {
				System.out.println("****Saat tahmin****\n");
				System.out.println(hak + " Hakkınız var\n");
				System.out.println("lütfen tahmini bir saat giriniz\n");
				
				try {
					tahmin = scanner.nextInt();
				} catch (Exception e) {
					
					System.err.println("Harf Girdiniz lütfen sayı giriniz");
				} finally {
					scanner.nextLine();
				}
				
				if (tahmin > 24) {
					System.out.println("bir günde 24 saat vardır");
					hak--;
					System.out.println(hak + " hakkınız kaldı\n");
				} else if (tahmin > hour) {
					if ((tahmin - hour) <= 2) {
						System.out.println("AZ KALDI\n");
						hak--;
						System.out.println(hak + " hakkınız kaldı\n");
						
					} else {
						System.out.println("arada çok fark var sayıyı küçültün\n");
						hak--;
						System.out.println(hak + " hakkınız kaldı\n");
						
					}
					
				}
				
				else if (hour > tahmin) {
					if ((hour - tahmin) <= 2) {
						System.out.println("AZ KALDI\n");
						hak--;
						System.out.println(hak + " hakkınız kaldı\n");
						
					} else {
						System.out.println("arada çok fark var sayıyı büyültün\n");
						hak--;
						System.out.println(hak + " hakkınız kaldı\n");
						
					}
					
				}
				
				else {
					System.out.println("tebrikler");
					System.out.println(10 - hak + 1 + ".denemede bildiniz");
					System.out.println("tekrar oynamak istermisiniz? E H ");
					String choseString = scanner.nextLine();
					if (choseString.equalsIgnoreCase("e")) {
						howcount++;
						hak = 10;
						
					} else {
						System.out.println(howcount + "kere oynadınız GÜLE GÜLE..");
						break;
					}
					
				}
			}
			if (hak == 0) {
				if (replay()) {
					
				} else {
					
				}
				
			}
			
		} catch (Exception e) {
			// System.out.println("Harf Gridiniz lütfen sadece sayı giriniz");
			// ims.printStackTrace();
			// hak--;
			// scanner.nextLine();
			
		} finally {
			// if (hak == 0) {
			//
			// if (replay())
			//
			// {
			// saatTahmin();
			// } else {
			// break;
			// }
			// }
		}
		
	}
	
	public static boolean replay() {
		boolean result = true;
		System.out.println("tekrar oynamak istermisiniz? E H ");
		String choseString = scanner.nextLine();
		if (choseString.equalsIgnoreCase("e")) {
			howcount++;
			hak = 10;
			result = true;
			
		} else {
			System.out.println(howcount + "kere oynadınız GÜLE GÜLE..");
			hak = 10;
			
			result = false;
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		saatTahmin();
	}
}