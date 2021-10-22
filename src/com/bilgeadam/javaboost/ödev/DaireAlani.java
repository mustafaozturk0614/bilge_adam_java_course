package com.bilgeadam.javaboost.ödev;

import java.util.Scanner;

public class DaireAlani {
	public static void main(String[] args) {
		
		double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("dairenin yarı çapını giriniz");
		double r = sc.nextDouble();
		double alan = PI * Math.pow(r, 2);
		
		System.out.println("Girmiş olduğumuz dairenin alanı: " + alan);
		sc.close();
	}
	
}
