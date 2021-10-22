package com.bilgeadam.boost.java.ödev;

import java.util.Scanner;

public class Odev004_Hipotenus {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.print("Lütfen 1.dik kenarın uzunlğunu  giriniz:  ");
		
		Scanner sc = new Scanner(System.in);
		int sayi = sc.nextInt();
		System.out.print("Lütfen 2.dik kenarın uzunlğunu  giriniz:  ");
		int sayi2 = sc.nextInt();
		
		double c = Math.sqrt(Math.pow(sayi, 2) + Math.pow(sayi2, 2));
		
		System.out.println(c);
		sc.close();
		
	}
	
}
