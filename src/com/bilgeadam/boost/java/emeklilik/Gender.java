package com.bilgeadam.boost.java.emeklilik;

public enum Gender {
	MAN(1, "erkek"), WOMAN(2, "kadın"), NO_INFORMATION(3, "bilgiyok");
	
	private final String genderName;
	private final int id;
	
	private Gender(int id, String genderName) {
		
		this.genderName = genderName;
		this.id = id;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getGenderName() {
		return genderName;
	}
}
