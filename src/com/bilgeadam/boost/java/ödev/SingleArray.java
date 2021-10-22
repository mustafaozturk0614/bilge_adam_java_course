package com.bilgeadam.boost.java.ödev;

import java.util.Random;
import java.util.Scanner;

public class SingleArray {
	static Scanner scanner = new Scanner(System.in);
	static int[] ints;
	
	public static void main(String[] args) {
		
		actionmenu();
	}
	
	private static int[] createArray() {
		System.out.print("lütfen elaman sayısını belirtiniz: ");
		
		int numberOfElements = scanner.nextInt();
		scanner.nextLine();
		System.out.print("\nlütfen oluşturulacak sayıların 1 ile hangi sayı arasında olacağını belirtiniz: ");
		int topOfNumber = scanner.nextInt();
		scanner.nextLine();
		
		ints = new int[numberOfElements];
		
		Random randomClass = new Random();
		
		int toplam = 0;
		
		for (int i = 0; i < ints.length; i++) {
			int randomNumber = randomClass.nextInt(topOfNumber) + 1;
			ints[i] = randomNumber;
			
		}
		return ints;
		
	}
	
	private int toplam() {
		
		int toplam = 0;
		for (int i = 0; i < ints.length; i++) {
			toplam = toplam + ints[i];
			
		}
		
		return toplam;
		
	}
	
	private double averageCalculate() {
		
		double average = (double) toplam() / ints.length;
		return average;
		
	}
	
	private void isSingle() {
		
		int singleCount = 0;
		int evenCount = 0;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] % 2 == 0) {
				evenCount++;
			} else {
				singleCount++;
			}
			
		}
		int[] singles = new int[singleCount];
		int[] evens = new int[evenCount];
		
		System.out.println("dizide " + singleCount + " tane tek sayı vardır");
		System.out.println();
		System.out.println("dizide " + evenCount + " tane çift sayı vardır");
		System.out.println("---------------------------------------");
		
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] % 2 == 0) {
				evens[evenCount - 1] = ints[i];
				evenCount--;
			} else {
				singles[singleCount - 1] = ints[i];
				singleCount--;
			}
			
		}
		System.out.println("1-tek Sayı listesi");
		System.out.println("2-çift sayı listesi");
		System.out.println("3-işlem yapmadan çıkış");
		int input2 = scanner.nextInt();
		scanner.nextLine();
		switch (input2) {
			case 1: {
				System.out.println("Dizi içerisindeki tek sayılar");
				for (int i : singles) {
					
					System.out.print(i + " ");
					
				}
				
				break;
			}
			case 2: {
				System.out.println("Dizi içerisindeki çift sayılar");
				for (int i : evens) {
					
					System.out.print(i + " ");
					
				}
				
				break;
			}
			case 3: {
				System.out.println("Sistemden Çıkılıyor...");
				
				break;
			}
			default:
			
		}
	}
	
	private void elementOfArray() {
		
		for (int i = 0; i < ints.length; i++) {
			System.out.print(ints[i] + " ");
			
		}
		
	}
	
	private int fac() {
		
		int min = ints[0];
		int fac = 1;
		
		for (int i = 1; i < ints.length; i++) {
			if (min > ints[i]) {
				
				min = ints[i];
				
			}
			
		}
		for (int i = 1; i <= min; i++) {
			fac = fac * i;
		}
		System.out.println("dizideki en küçük sayı " + min);
		return fac;
		
	}
	
	private void primeNumber() {
		boolean İsPrime = true;
		int count = 0;
		int[] primes = new int[ints.length];
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] == 1) {
				primes[i] = ints[i];
				İsPrime = false;
				
			}
			
			else if (ints[i] == 2) {
				primes[i] = ints[i];
				
				count++;
				
			} else {
				for (int j = 2; j < ints[i]; j++) {
					if (ints[i] % j == 0) {
						İsPrime = false;
						break;
						
					}
				}
				if (İsPrime == false) {
					primes[i] = 1;
					İsPrime = true;
					
				} else {
					primes[i] = ints[i];
					count++;
				}
				
			}
		}
		
		for (int i = 0; i < primes.length; i++) {
			if (primes[i] != 1)
				System.out.print(primes[i] + " ");
			
		}
	}
	
	private static String kontrol() {
		
		System.out.println("\nçıkmak istiyorsanız 'Q' tuşuna basınız");
		System.out.println("devam etmek için bir tuşa basın");
		String knt = scanner.nextLine();
		
		while (true) {
			
			if (knt.equalsIgnoreCase("Q")) {
				System.out.println("sistemden çıkılıyor");
				System.exit(0);
				
			} else {
				System.out.println("devam ediliyor...");
				System.out.println("---------------------------------------");
				break;
				
			}
			scanner.close();
			
		}
		return knt;
		
	}
	
	private static void actionmenu() {
		SingleArray object = new SingleArray();
		object.createArray();
		while (true) {
			
			System.out.println("\t\t=======Array işlemleri=======");
			System.out.println();
			System.out.println("1-Dizi elemanlarını göster ");
			System.out.println("2-Dizi elemanlarının toplamı");
			System.out.println("3-Dizi elemanlarının ortalaması");
			System.out.println("4-Dizi de ki çift ve tek sayı adetini bulma ");
			System.out.println("5-Dizinin ilk elemanı ve son elamanı");
			System.out.println("6-Dizi elemanlarının içersindek asal sayılar");
			System.out.println("7-dizi de ki en küçük sayının faktöriyeli");
			System.out.println("8-Çıkış");
			System.out.println();
			System.out.print("lütfen bir işlem seciniz: ");
			int input = scanner.nextInt();
			scanner.nextLine();
			switch (input) {
				case 1: {
					System.out.println("Dizi elemanları");
					object.elementOfArray();
					kontrol();
					
					break;
				}
				case 2: {
					System.out.println("Dizi elamanlarının Toplamının sunucu : " + object.toplam() + "\n");
					kontrol();
					
					break;
				}
				case 3: {
					System.out.println("Dizi elamanlarının Ortalaması : " + object.averageCalculate() + "\n");
					kontrol();
					
					break;
				}
				case 4: {
					System.out.println("=====Dizi elemanlarının içinde ki çift ve tek sayı adeti========");
					object.isSingle();
					kontrol();
					
					break;
				}
				case 5: {
					System.out.println("Dizinin ilk ve son elemanı");
					System.out.println("Dizinin ilk elemanı: " + ints[0] + "\n");
					System.out.println("Dizinin son elemanı: " + ints[ints.length - 1] + "\n");
					kontrol();
					break;
				}
				case 6: {
					System.out.println("Dizi elemanlarının içersindek asal sayılar");
					object.primeNumber();
					kontrol();
					break;
				}
				case 7: {
					System.out.println("Dizi de ki en küçük sayının faktöriyeli: " + object.fac() + "\n");
					kontrol();
					break;
				}
				case 8: {
					System.out.println("programdan çıkılıyor...");
					
					System.exit(0);
					
					break;
				}
				default:
					System.out.println("lütfen belirtilen aralıkta bir sayı giriniz");
					
			}
		}
	}
}
