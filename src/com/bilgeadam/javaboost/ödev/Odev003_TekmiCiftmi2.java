package com.bilgeadam.javaboost.ödev;

import java.util.Scanner;

public class Odev003_TekmiCiftmi2 {
	
	public static void main(String[] args) {
		
		int m = 2;
		
		// TODO Auto-generated method stub
		while (true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Lütfen bir adet tam sayı giriniz:  ");
			int sayi = sc.nextInt();
			int sonmod = sayi % m;
			
			switch (sonmod) {
				case 0: {
					System.out.println("girdğiniz sayı çifttir");
					
					break;
				}
				
				case 1: {
					System.out.println("girdğiniz sayı tektir");
					;
					
					break;
				}
				
			}
			
		}
		
	}
	
}
