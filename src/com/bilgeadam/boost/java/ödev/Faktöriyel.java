package com.bilgeadam.boost.java.ödev;

import java.util.Scanner;

public class Faktöriyel {
	public static void main(String[] args) {
		int inp = 23;
		int fac = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		while (true) {
			
			System.out.print("bir sayı giriniz: ");
			int sayi = scanner.nextInt();
			
			if (sayi == 99) {
				break;
			} else if (sayi >= 23) {
				continue;
				
			} else if (sayi > 0) {
				
				for (int i = 1; i <= sayi; i++)
					
					fac = fac * i;
				System.out.println(fac);
				
			}
			
		}
	}
}
