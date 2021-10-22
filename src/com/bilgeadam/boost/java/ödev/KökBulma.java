package com.bilgeadam.boost.java.ödev;

import java.util.Scanner;

public class KökBulma {
	
	public static void main(String[] args) {
		KökBulma.Kök();
		
	}
	
	public static void Kök() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("(ax²+bx+c) ikinci dereceir denkleminin sabitlerini  sırayla girin");
		
		System.out.print("a değerini giriniz :");
		double a = scanner.nextInt();
		System.out.print("b değerini giriniz   :");
		double b = scanner.nextInt();
		System.out.print("c değerini giriniz   :");
		double c = scanner.nextInt();
		double delta = (Math.pow(b, 2)) - 4 * a * c;
		
		if (delta < 0) {
			System.out.println("Denklemin Gerçel Kökü Yoktur.");
		}
		if (delta > 0) {
			double x1 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
			double x2 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
			System.out.println("x1= " + x1 + " x2= " + x2);
			
		}
		if (delta == 0) {
			double x = (-1 * b) / (2 * a);
			System.out.println("x1= x2= " + x);
			
		}
		scanner.close();
	}
}
