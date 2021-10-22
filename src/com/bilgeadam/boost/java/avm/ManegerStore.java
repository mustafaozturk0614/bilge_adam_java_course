package com.bilgeadam.boost.java.avm;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bilgeadam.javaboost.ödev.BAUtils;

public class ManegerStore {
	static Scanner scanner = new Scanner(System.in);
	static Store store = new Store();
	
	public static int crateStore() {
		
		System.out.println("\n\t\tDÜKKAN AÇMA İŞLEMLERİ\n");
		System.out.println(1 + "-" + EStoreNames.TECSTORE);
		System.out.println(2 + "-" + EStoreNames.RESTAURANT);
		System.out.println(3 + "-" + EStoreNames.CLOTHİNGSTORE);
		System.out.println("4- BİR ÜST MENÜYE DÖN");
		System.out.println();
		System.out.println("LÜTFEN AÇILACAK DÜKKAN TÜRÜNÜ SEÇİNİZ: ");
		
		int input = scanner.nextInt();
		scanner.nextLine();
		
		return input;
	}
	
	public static void informationStore(int input) {
		TecStrore tecStore = new TecStrore();
		
		try {
			switch (input) {
				case 1:
					
					// tecStore.getAvmİnformationAvm().addStorlist(tecStore.beCustomer(tecStore));
					store.getAvmİnformationAvm().addStorlist(tecStore.beCustomer(tecStore));
					break;
				case 2:
					RestaurantStore restauranStore = new RestaurantStore();
					store.getAvmİnformationAvm().addStorlist(restauranStore.beCustomer(restauranStore));
					break;
				case 3:
					ClothingStore clothingStore = new ClothingStore();
					store.getAvmİnformationAvm().addStorlist(clothingStore.beCustomer(clothingStore));
					
					break;
				case 4:
					proces();
					
					break;
				
				default:
					throw new IllegalArgumentException(
							"Yanlış bir tercih yaptınız lütfen lütfen sınırlar çinde tercih yapınız ");
			}
			
		} catch (InputMismatchException ime) {
			System.out.println(ime.getMessage());
			
			informationStore(input);
			
		}
		
	}
	
	public static void proces() {
		try {
			do {
				System.out.println("\n\t\t***AVM İŞLEMLERİNE HOŞGELDİNİZ****\n");
				System.out.println("1-DÜKKAN KAYIT İŞLEMLERİ\n");
				System.out.println("2-DÜKKAN LİSTESİ\n");
				System.out.println("3-ÇIKIŞ\n");
				
				System.out.println("lütfen işlem seçiniz\n");
				int input = scanner.nextInt();
				scanner.nextLine();
				switch (input) {
					case 1:
						ManegerStore.informationStore(crateStore());
						break;
					
					case 2:
						store.print();
						break;
					case 3:
						System.out.println("Program sonlandı....");
						System.exit(0);
						break;
					
					default:
						throw new IllegalArgumentException(
								"Yanlış bir tercih yaptınız lütfen lütfen sınırlar çinde tercih yapınız ");
					
				}
				
			} while (BAUtils
					.wantToEnd("Devam etmek için herhangi bir tuşa basınız Çıkmak istiyorsanız Q tuşuna basınız", "q"));
			
		} catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
			scanner.nextLine();
			proces();
		} catch (InputMismatchException e) {
			System.out.println("Lütfen sayısal değerler giriniz");
			scanner.nextLine();
			proces();
			scanner.next();
		}
		
	}
	
	public static void main(String[] args) {
		proces();
		
	}
}
