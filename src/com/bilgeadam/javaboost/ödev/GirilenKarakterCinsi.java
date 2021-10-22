package com.bilgeadam.javaboost.ödev;

import java.util.Scanner;

public class GirilenKarakterCinsi {
	
	public static void main(String[] args) {
		boolean isResult = true;
		
		while (isResult) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("lütfen bir karakter giriniz");
			String simge;
			simge = scanner.nextLine();
			char karakter = simge.charAt(0);
			
			if (Character.isDigit(karakter)) {
				System.out.println("girdiğimiz simge saydır");
			} else if (Character.isLetter(karakter)) {
				
				System.out.println("girdiğimiz simge harftir");
				
			} else {
				
				System.out.println("girdiğimiz simge özel bir simgedir");
				
			}
			scanner.close();
		}
		
	}
	
}
