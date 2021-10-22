package com.bilgeadam.boost.java.ödev;

import java.util.Scanner;

public class MultiArray2 {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		int satir, sutun, sayi;
		
		System.out.println("Lütfen tek bir sayı  giriniz");
		sayi = klavye.nextInt();
		
		System.out.println("Lütfen satır sayısını giriniz");
		satir = klavye.nextInt();
		
		System.out.println("Lütfen sutun sayısını giriniz");
		sutun = klavye.nextInt();
		int ort = (sayi + 1) / 2;
		int minSayi = 1;
		
		int[][] matrix = new int[satir][sutun];
		
		for (int i = 0; i < matrix.length; i++) { // satır
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == i) {
					matrix[i][j] = ort;
					
				} else if (i > j) {
					matrix[i][j] = minSayi;
					
				} else {
					matrix[i][j] = sayi;
				}
				
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
