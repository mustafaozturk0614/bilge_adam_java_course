package com.bilgeadam.javaboost.ödev;

import java.util.Scanner;

public class MultiArray3 {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		int satir, sutun;
		String simge = "";
		
		System.out.println("Lütfen bir simge giriniz");
		simge = klavye.nextLine();
		
		System.out.println("Lütfen satır sayısını giriniz");
		satir = klavye.nextInt();
		
		System.out.println("Lütfen sutun sayısını giriniz");
		sutun = klavye.nextInt();
		
		String[][] matrix = new String[satir][sutun];
		for (int i = 0; i < matrix.length; i++) { // satır
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = simge;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}