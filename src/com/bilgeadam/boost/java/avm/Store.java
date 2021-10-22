package com.bilgeadam.boost.java.avm;

import java.time.LocalDate;
import java.util.Date;

public class Store {
	protected String typeOfStore;
	protected int shopSize;
	protected String brandName;
	protected String taxNumber;
	protected Avm avmİnformationAvm;
	protected int productOfVariety;
	protected Date logDate;
	
	public Store() {
		Avm avm = new Avm("AnkaMALL", "Ankara", LocalDate.parse("2002-12-12"));
		avmİnformationAvm = avm;
		logDate = new Date();
	}
	
	public Store(String typeOfStore, int shopSize, String brandName, String taxNumber, Avm avmİnformationAvm,
			int productOfVariety) {
		Avm avm = new Avm("AnkaMALL", "Ankara", LocalDate.parse("2002-12-12"));
		avmİnformationAvm = avm;
		this.typeOfStore = typeOfStore;
		this.shopSize = shopSize;
		this.brandName = brandName;
		this.taxNumber = taxNumber;
		this.avmİnformationAvm = avmİnformationAvm;
		this.productOfVariety = productOfVariety;
		avm.setStoreList(avmİnformationAvm.getStoreList());
	}
	
	@Override
	public String toString() {
		return "Store [typeOfStore=" + typeOfStore + ", shopSize=" + shopSize + ", brandName=" + brandName
				+ ", taxNumber=" + taxNumber + ", avmİnformationAvm=" + avmİnformationAvm + ", productOfVariety="
				+ productOfVariety + "]";
	}
	
	public String getTypeOfStore() {
		return typeOfStore;
	}
	
	public void setTypeOfStore(String typeOfStore) {
		this.typeOfStore = typeOfStore;
	}
	
	public int getShopSize() {
		return shopSize;
	}
	
	public void setShopSize(int shopSize) {
		this.shopSize = shopSize;
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public String getTaxNumber() {
		return taxNumber;
	}
	
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	
	public Avm getAvmİnformationAvm() {
		return avmİnformationAvm;
	}
	
	public void setAvmİnformationAvm(Avm avmİnformationAvm) {
		this.avmİnformationAvm = avmİnformationAvm;
	}
	
	public int getProductOfVariety() {
		return productOfVariety;
	}
	
	public void setProductOfVariety(int productOfVariety) {
		this.productOfVariety = productOfVariety;
	}
	
	public void print() {
		if (avmİnformationAvm.getStoreList().isEmpty()) {
			System.out.println("Listenizde henüz kayıtlı bir dükkan yoktur ");
			
		}
		System.out.println("****" + avmİnformationAvm.getAvmName().toUpperCase() + "*****\n");
		System.out.println("<==Dükkan Listesi==>\n");
		this.avmİnformationAvm.getStoreList().stream().forEach(System.out::println);
		
	}
}
