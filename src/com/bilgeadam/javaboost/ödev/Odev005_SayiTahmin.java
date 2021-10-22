package com.bilgeadam.javaboost.ödev;

import java.util.Scanner;

public class Odev005_SayiTahmin {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int sayi = 7;
		int hak = 3;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			hak -= 1;
			System.out.printf("\n----Toplam 3 hakkınız bulunmaktadır---- %d. hakkınız----", i);
			System.out.print("\n\nLütfen 1-10 arasında bir sayı giriniz: ");
			
			int sayi1 = sc.nextInt();
			
			if (sayi == sayi1)
			
			{
				System.out.printf("\n****TEBRİKLER***girdiğiniz  %d sayısı doğru sayıdır", sayi1);
				break;
				
			}
			if (hak == 0) {
				
				System.out.println("\n***MALESEF KAYBETTİNİZ***");
				break;
				
			}
			
			else {
				System.out.printf("\ngirdiğniz %d sayısı yanlış sayıdır ", sayi1);
				System.out.println("geriye " + (3 - i) + "hakkınız kaldı");
			}
			
		}
		sc.close();
	}
	
}
