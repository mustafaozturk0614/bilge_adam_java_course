package com.bilgeadam.javaboost.emeklilik;

import java.time.LocalDate;

public class Woman extends Person implements Iperson {
	private static final int RETİREDAGE = 60;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Woman(String name, String surname, LocalDate birtDate) {
		super(name, surname, birtDate);
		this.setGender(Gender.WOMAN);
	}
	
	public Woman() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int calculateRetired(LocalDate date) {
		int difference = RETİREDAGE - (calculatAge(date));
		return difference;
	}
	
	public static int getRetiredage() {
		return RETİREDAGE;
	}
	
}
