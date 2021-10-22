package com.bilgeadam.boost.java.avm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Avm {
	protected String AvmName;
	protected String city;
	protected LocalDate foundationYear;
	protected List<Store> storeList;
	
	public Avm() {
		this.storeList = new ArrayList<Store>();
	}
	
	public Avm(String avmName, String city, LocalDate foundationYear) {
		this();
		AvmName = avmName;
		this.city = city;
		this.foundationYear = foundationYear;
	}
	
	@Override
	public String toString() {
		return "Avm [AvmName=" + AvmName + ", city=" + city + ", foundationYear=" + foundationYear + ", storeList="
				+ storeList + "]";
	}
	
	public String getAvmName() {
		return AvmName;
	}
	
	public void setAvmName(String avmName) {
		AvmName = avmName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		
		this.city = city;
	}
	
	public LocalDate getFoundationYear() {
		return foundationYear;
	}
	
	public void setFoundationYear(LocalDate foundationYear) {
		this.foundationYear = foundationYear;
	}
	
	public List<Store> getStoreList() {
		return storeList;
	}
	
	public void setStoreList(List<Store> storeList) {
		Store store = new Store();
		this.storeList = storeList;
		storeList.add((Store) store.getAvmİnformationAvm().getStoreList());
	}
	
	public void addStorlist(Store store) {
		if (storeList == null) {
			this.storeList = new ArrayList<Store>();
		}
		this.storeList.add(store);
		
	}
	
	public void printlist() {
		this.storeList.stream().forEach(System.out::println);
	}
	
}
