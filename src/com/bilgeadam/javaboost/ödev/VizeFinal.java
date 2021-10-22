package com.bilgeadam.javaboost.ödev;

import java.util.Scanner;

public class VizeFinal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen vize notunuzu Giriniz: ");
		double v = scanner.nextDouble();
		System.out.print("Lütfen final notunuzu Giriniz: ");
		double f = scanner.nextDouble();
		double ort = v * 0.4 + f * 0.6;
		if (v > 100 || f > 100) {
			System.out.println("lütfen 100 den küçük bir değer giriniz");
			
		} else if (v < 0 || f < 0) {
			System.out.println("lütfen 0 dan küçük bir değer girmeyiniz");
		}
		
		else if (ort >= 90 && ort <= 100) {
			
			System.out.printf("Ortalamanız: %.2f geçme otunuz ise: AA ", ort);
			
		} else if (ort >= 80 && ort < 90) {
			System.out.printf("Ortalamanız: %.2f geçme otunuz ise: BA ", ort);
			
		} else if (ort >= 70 && ort < 80) {
			System.out.printf("Ortalamanız: %.2f geçme otunuz ise: BB ", ort);
			
		} else if (ort >= 60 && ort < 70) {
			System.out.printf("Ortalamanız: %.2f geçme otunuz ise: CB ", ort);
			
		} else if (ort >= 50 && ort < 60) {
			System.out.printf("Ortalamanız: %.2f geçme otunuz ise: CC ", ort);
			
		} else if (ort >= 45 && ort < 50) {
			System.out.printf("Ortalamanız: %.2f geçme notunuz ise: DC ", ort);
			
		} else if (ort < 45) {
			System.out.printf("Ortalamanız: %.2f  notunuz ise: FF ", ort);
			System.out.println("******KALDINIZ*******");
			
		}
		scanner.close();
	}
}
