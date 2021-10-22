package com.bilgeadam.boost.java.ödev;

import java.util.Scanner;

public class MultiArray {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		int satir, sutun;
		String simge = "";
		
		System.out.println("Lütfen satır sayısını giriniz");
		satir = klavye.nextInt();
		
		System.out.println("Lütfen sutun sayısını giriniz");
		sutun = klavye.nextInt();
		klavye.nextLine();
		String[][] matrix = new String[satir][sutun];
		for (int i = 0; i < matrix.length; i++) {
			
			// satır
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Lütfen bir simge giriniz");
				simge = klavye.nextLine();
				
				matrix[i][j] = simge;
				
			}
			
			System.out.println();
		}
	}
}