package com.bilgeadam.boost.java.ödev;

import java.util.Scanner;

public class Faktöriyel2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz");
		int sayi = scanner.nextInt();
		int fac = 1;
		if (sayi < 0)
			
			System.out.println("lütfen pozitif bir tam sayı giriniz");
		else {
			while (sayi > 0)
			
			{
				
				fac = sayi * fac;
				sayi = sayi - 1;
				
			}
			System.out.printf("Girmiş olduğunuz sayısının faktöriyeli % d dir . ", fac);
			
		}
		
	}
	
}
