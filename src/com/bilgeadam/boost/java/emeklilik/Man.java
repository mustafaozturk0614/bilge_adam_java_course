package com.bilgeadam.boost.java.emeklilik;

import java.time.LocalDate;

public class Man extends Person implements Iperson {
	private static final int RETİREDAGE = 65;
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param id
	 * @param nameString
	 * @param surNameString
	 * @param birtDate
	 * 
	 * 
	 * 
	 * 
	 * 
	 *                      /**
	 * @param name
	 * @param surname
	 * @param birtDate
	 * @param gender
	 */
	public Man(String name, String surname, LocalDate birtDate, Gender gender) {
		super(name, surname, birtDate, gender);
		this.setGender(Gender.MAN);
	}
	
	/**
	 * @param name
	 * @param surname
	 * @param birtDate
	 *
	 * 
	 */
	public Man() {
		this.setGender(Gender.MAN);
		
	}
	
	public Man(String name, String surname, LocalDate birtDate) {
		super(name, surname, birtDate);
		this.setGender(Gender.MAN);
	}
	
	@Override
	public LocalDate formatBirthday() {
		// TODO Auto-generated method stub
		return super.formatBirthday();
	}
	
	@Override
	
	public int calculateRetired(LocalDate date) {
		int difference = RETİREDAGE - (calculatAge(date));
		if (difference < 0) {
			
			throw new IllegalArgumentException("emeklilik yaşınız geçmiş");
		}
		return difference;
		
	}
	
	public static int getRetiredage() {
		return RETİREDAGE;
	}
	
}
