package com.bilgeadam.boost.java.avm;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.bilgeadam.javaboost.ödev.BAUtils;

public class RestaurantStore extends Store implements IStore {
	static Scanner scanner = new Scanner(System.in);
	private static List<String> menu;
	private int numberOfTable;
	private boolean isSelfSevice;
	
	public RestaurantStore() {
		super.typeOfStore = EStoreNames.RESTAURANT.getName();
		List<String> menu = new ArrayList<String>();
		menu.add("Ana Yemekler");
		
		this.isSelfSevice = false;
	}
	
	public RestaurantStore(String typeOfStore, int shopSize, String brandName, String taxNumber, Avm avmİnformationAvm,
			int productOfVariety, List<String> menu, int numberOfTable, boolean isSelfSevice) {
		
		super(typeOfStore, shopSize, brandName, taxNumber, avmİnformationAvm, productOfVariety);
		super.typeOfStore = EStoreNames.RESTAURANT.getName();
		this.menu = menu;
		this.numberOfTable = numberOfTable;
		
		this.isSelfSevice = false;
		
	}
	
	@Override
	public String toString() {
		return typeOfStore.toUpperCase() + "[ Dükkan Büyüklüğü=" + shopSize + ", Marka İsmi=" + brandName
				+ ", Vergi Numarası=" + taxNumber + ", Ürün Çeşidi=" + productOfVariety + ",Masa Sayısı="
				+ numberOfTable + ", Self Service mi?=" + isSelfSevice + ", Kayıt TArihi= " + logDate + "]\n\n";
	}
	
	public List<String> getMenu() {
		return menu;
	}
	
	public void setMenu(List<String> menu) {
		this.menu = menu;
	}
	
	public int getNumberOfTable() {
		return numberOfTable;
	}
	
	public void setNumberOfTable(int numberOfTable) {
		this.numberOfTable = numberOfTable;
	}
	
	public boolean isSelfSevice() {
		return isSelfSevice;
	}
	
	public void setSelfSevice(boolean isSelfSevice) {
		this.isSelfSevice = isSelfSevice;
	}
	
	@Override
	public Store beCustomer(Store store) {
		
		RestaurantStore restauranStore = (RestaurantStore) store;
		
		try {
			
			System.out.println("lütfen Dükkan alanını giriniz ");
			restauranStore.setShopSize(scanner.nextInt());
			scanner.nextLine();
			System.out.println("lütfen MArka isimini giriniz ");
			restauranStore.setBrandName(scanner.nextLine());
			scanner.nextLine();
			System.out.println("lütfen Vergi numaranızı giriniz ");
			restauranStore.setTaxNumber(scanner.nextLine());
			scanner.nextLine();
			restauranStore.setAvmİnformationAvm(this.avmİnformationAvm);
			System.out.println("lütfen ürün satacağınız ürün çeşidini giriniz ");
			restauranStore.setProductOfVariety(scanner.nextInt());
			scanner.nextLine();
			System.out.println("lütfen Masa sayısını giriniz ");
			restauranStore.setNumberOfTable(scanner.nextInt());
			scanner.nextLine();
			System.out.println("restaurant Self Servismi E/H ");
			String chose = scanner.nextLine();
			if (chose.equalsIgnoreCase("e")) {
				
				restauranStore.setSelfSevice(true);
				
			} else {
				restauranStore.setSelfSevice(false);
			}
			defaultMenu();
			
			printlist();
			
			return restauranStore;
		} catch (InputMismatchException ime) {
			System.out.println("***HATA***lütfen Sayısal bir değer giriniz\n ");
			scanner.nextLine();
			beCustomer(store);
		}
		
		return restauranStore;
	}
	
	public static void defaultMenu() {
		if (menu == null) {
			menu = new ArrayList<String>();
			menu.add("Aparatifler");
			menu.add("soğuk içecekler");
			menu.add("sıcak içecekler");
			menu.add("Tatlılar");
			
		}
		
	}
	
	public static void printlist() {
		System.out.println("***MENÜ***");
		for (int i = 0; i < menu.size(); i++) {
			System.out.println(menu.get(i));
		}
		System.out.println("menü genel başlıkları aşağıdaki gibidir yeni başlık eklemek için E ye basınız");
		String choseString = scanner.nextLine();
		if (choseString.equalsIgnoreCase("e")) {
			
			do {
				System.out.println("lütfen Eklemek istediğiniz ürün başlığını giriniz :");
				String urun = scanner.nextLine();
				menu.add(urun);
			} while (BAUtils.wantToEnd("Sonlandırmak için Q ya basınız ", "q"));
			
		}
		
	}
	
	public static void main(String[] args) {
		
	}
}
