package com.bilgeadam.boost.java.avm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TecStrore extends Store implements IStore {
	private int warrantyPeriod;
	static Scanner scanner = new Scanner(System.in);
	
	public TecStrore() {
		super.typeOfStore = EStoreNames.TECSTORE.getName();
	}
	
	public TecStrore(String typeOfStore, int shopSize, String brandName, String taxNumber, Avm avmİnformationAvm,
			int productOfVariety, int warrantyPeriod) {
		super(typeOfStore, shopSize, brandName, taxNumber, avmİnformationAvm, productOfVariety);
		super.typeOfStore = EStoreNames.TECSTORE.getName();
		this.warrantyPeriod = warrantyPeriod;
		
	}
	
	@Override
	public String toString() {
		return typeOfStore.toUpperCase() + " [, Dükkan Alanı=" + shopSize + ", Marka İsmi=" + brandName + ", Vergi NO="
				+ taxNumber + ", Ürün Çeşidi=" + productOfVariety + ", Garanti Süresi=" + warrantyPeriod
				+ ", Kayıt Tarihi= " + logDate + "]";
	}
	
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}
	
	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
	
	@Override
	public Store beCustomer(Store store) {
		TecStrore tecStrore = (TecStrore) store;
		
		try {
			System.out.println("lütfen Dükkan alanını giriniz ");
			tecStrore.setShopSize(scanner.nextInt());
			scanner.nextLine();
			System.out.println("lütfen MArka isimini giriniz ");
			tecStrore.setBrandName(scanner.nextLine());
			
			System.out.println("lütfen Vergi numaranızı giriniz ");
			tecStrore.setTaxNumber(scanner.nextLine());
			scanner.nextLine();
			tecStrore.setAvmİnformationAvm(this.avmİnformationAvm);
			System.out.println("lütfen satacağınız ürün çeşidini giriniz ");
			tecStrore.setProductOfVariety(scanner.nextInt());
			scanner.nextLine();
			System.out.println("lütfen ürünlerin garanti süresini giriniz ");
			tecStrore.setWarrantyPeriod(scanner.nextInt());
			scanner.nextLine();
			return tecStrore;
		} catch (InputMismatchException ime) {
			System.out.println("***HATA***lütfen Sayısal bir değer giriniz\n ");
			scanner.nextLine();
			beCustomer(store);
		}
		
		return tecStrore;
	}
	
}
