package com.bilgeadam.boost.java.avm;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClothingStore extends Store implements IStore {
	static Scanner scanner = new Scanner(System.in);
	private int numberOfFittingRooms;
	private int numberOfHangers;
	
	public ClothingStore() {
		Avm avm = new Avm("AnkaMALL", "Ankara", LocalDate.parse("2002-12-12"));
		super.typeOfStore = EStoreNames.CLOTHİNGSTORE.getName();
		
	}
	
	public ClothingStore(String typeOfStore, int shopSize, String brandName, String taxNumber, Avm avmİnformationAvm,
			int productOfVariety, int numberOfFittingRooms, int numberOfHangers) {
		super(typeOfStore, shopSize, brandName, taxNumber, avmİnformationAvm, productOfVariety);
		this.numberOfFittingRooms = numberOfFittingRooms;
		Avm avm = new Avm("AnkaMALL", "Ankara", LocalDate.parse("2002-12-12"));
		this.avmİnformationAvm = avm;
		this.numberOfHangers = numberOfHangers;
		super.typeOfStore = EStoreNames.CLOTHİNGSTORE.getName();
		
	}
	
	@Override
	public String toString() {
		return typeOfStore.toUpperCase() + "[Deneme Kabin Sasyısı=" + numberOfFittingRooms + ", ASkılık saysıs="
				+ numberOfHangers + ", Dükkan Büyüklüğü=" + shopSize + ", MArka İsmi=" + brandName + ", Ürün Çeşidi="
				+ productOfVariety + " , Kayıt Tarihi= " + logDate + "]";
	}
	
	public int getNumberOfFittingRooms() {
		return numberOfFittingRooms;
	}
	
	public void setNumberOfFittingRooms(int numberOfFittingRooms) {
		this.numberOfFittingRooms = numberOfFittingRooms;
	}
	
	public int getNumberOfHangers() {
		return numberOfHangers;
	}
	
	public void setNumberOfHangers(int numberOfHangers) {
		this.numberOfHangers = numberOfHangers;
	}
	
	@Override
	
	public Store beCustomer(Store store) {
		
		ClothingStore clothingStore = (ClothingStore) store;
		try {
			System.out.println("lütfen Dükkan alanını giriniz ");
			clothingStore.setShopSize(scanner.nextInt());
			scanner.nextLine();
			System.out.println("lütfen MArka isimini giriniz ");
			clothingStore.setBrandName(scanner.nextLine());
			scanner.nextLine();
			System.out.println("lütfen Vergi numaranızı giriniz ");
			clothingStore.setTaxNumber(scanner.nextLine());
			scanner.nextLine();
			clothingStore.setAvmİnformationAvm(this.avmİnformationAvm);
			System.out.println("lütfen ürün satacağınız ürün çeşidini giriniz ");
			clothingStore.setProductOfVariety(scanner.nextInt());
			scanner.nextLine();
			System.out.println("lütfen deneme kabini sayısını giriniz ");
			clothingStore.setNumberOfFittingRooms(scanner.nextInt());
			scanner.nextLine();
			System.out.println("lütfen Askı sayısını giriniz ");
			clothingStore.setNumberOfHangers(scanner.nextInt());
			scanner.nextLine();
			
			return clothingStore;
			
		} catch (InputMismatchException ime) {
			System.out.println("***HATA***lütfen Sayısal bir değer giriniz\n ");
			scanner.nextLine();
			beCustomer(store);
		}
		return clothingStore;
		
	}
	
}
