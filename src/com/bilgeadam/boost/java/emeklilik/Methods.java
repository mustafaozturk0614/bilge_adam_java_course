package com.bilgeadam.boost.java.emeklilik;

import java.util.Scanner;

import com.bilgeadam.boost.java.ödev.BAUtils;

public class Methods {
	static Scanner scanner = new Scanner(System.in);
	
	public static void menü() {
		do {
			Person person = new Person();
			try {
				
				String input;
				System.out.println("Emeklilik Hesaplama");
				System.out.println();
				
				person = person.addRetiredPErson(person);
				
				System.out.println(" Yaşınız                         :" + person.calculatAge(person.getBirtDate()));
				
				if (person.getGender() == Gender.MAN) {
					
					Man man = (Man) person;
					
					System.out.println(" Emeklilik yaşınız               :" + Man.getRetiredage());
					System.out
							.println(" Emekliliğinize kalan yıl sayısı :" + man.calculateRetired(person.getBirtDate()));
					person.toSerializable(man);
					person.deSerializable();
				} else {
					Woman woman = (Woman) person;
					System.out.println(" Emeklilik yaşınız              :" + Woman.getRetiredage());
					
					System.out.println(
							" Emekliliğinize kalan yıl sayısı:" + woman.calculateRetired(person.getBirtDate()));
					person.toSerializable(woman);
					person.deSerializable();
				}
				person.addList(person);
			} catch (IllegalArgumentException e) {
				System.out.println("ups " + e.getMessage() + "  lütfen bilgilerinizi kontrol ediniz");
			} catch (NullPointerException np) {
				
				System.out.println("np");
			}
			
			catch (Exception e) {
				
				System.out.println("yanlış girdiniz lütfen doğru bilgiler giriniz");
			}
			
			person.printlist();
			
		} while (BAUtils.wantToEnd("çıkmak için q tuşuna basınız", "q"));
		
	}
	
	public static void main(String[] args) {
		menü();
		
	}
}