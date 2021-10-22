package com.bilgeadam.boost.java.avm;

public enum EStoreNames {
	
	TECSTORE(1, "teknoloji"), CLOTHİNGSTORE(2, "giyim"), RESTAURANT(3, "yemek");
	
	private final int id;
	private final String name;
	
	private EStoreNames(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
}
