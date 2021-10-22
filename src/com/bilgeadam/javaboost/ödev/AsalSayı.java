package com.bilgeadam.javaboost.ödev;

import java.util.Scanner;

public class AsalSayı {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir sayı girniz");
		int sayi = sc.nextInt();
		boolean Asalmı = true;
		//
		if (sayi == 1)
			
			System.out.println("1 asal bir sayı değildir");
		
		else if (sayi == 2) {
			
			System.out.println("2 en küçük asal sayıdır");
			
		}
		
		else if (sayi > 2) {
			
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					Asalmı = false;
					break;
				}
				
			}
			if (Asalmı == false) {
				
				System.out.printf("girdiğiniz %d saysısı asal sayı değildir", sayi);
				
			} else {
				System.out.printf("girdiğiniz %d saysısı asal bir sayıdır. ", sayi);
				
			}
		} else {
			System.out.println("yanlış bir değer girdiniz");
		}
	}
	
}
