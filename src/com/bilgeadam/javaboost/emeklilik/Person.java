package com.bilgeadam.javaboost.emeklilik;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String surname;
	private LocalDate birtDate;
	private Gender gender;
	private Date logDate;
	private static List<Person> list;
	
	public Person() {
		this.gender = Gender.NO_INFORMATION;
		this.id = 1;
		
	}
	
	public Person(String name, String surname, LocalDate birtDate, Gender gender) {
		this();
		
		this.name = name;
		this.surname = surname;
		this.birtDate = birtDate;
		this.gender = gender;
	}
	
	public Person(String name, String surname, LocalDate birtDate) {
		this();
		
		this.name = name;
		this.surname = surname;
		this.birtDate = birtDate;
		
	}
	
	public static int calculatAge(LocalDate birthday) {
		long years = birthday.until(LocalDate.now(), ChronoUnit.YEARS);
		if ((int) years < 0) {
			
			throw new IllegalArgumentException("daha doğmadınız");
		}
		
		return (int) years;
	}
	
	public Person addRetiredPErson(Person person) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen isminiz giriniz");
		person.setname(scanner.nextLine());
		System.out.println("lütfen Soy isiminizi giriniz");
		person.setSurname(scanner.nextLine());
		person.setBirtDate(person.formatBirthday());
		System.out.println("lütfen cinsiyetinizi giriniz");
		String genString = scanner.nextLine();
		if (genString.equalsIgnoreCase(Gender.MAN.getGenderName())) {
			Man man = new Man(person.name, person.surname, person.getBirtDate());
			return (man);
		} else {
			Woman woman = new Woman(person.name, person.surname, person.getBirtDate());
			return woman;
		}
	}
	
	public LocalDate formatBirthday() {
		LocalDate birthdayDate = null;
		try {
			Scanner scanner = new Scanner(System.in);
			DateTimeFormatter yeniFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy ");
			DateTimeFormatter eskiFormatter = DateTimeFormatter.ofPattern("yyy-MM-dd ");
			System.out.println("lütfendoğum tarihinizi şeklinde  giriniz dddd.MMMM.yyyy ");
			String temp = scanner.nextLine();
			birthdayDate = LocalDate.parse(temp);
			// birthdayDate=LocalDate.parse(birthdayDate,eskiFormatter);
			return birthdayDate;
		} catch (Exception e) {
			throw new IllegalArgumentException("yanlış tarıih değeri girdiniz");
		} finally {
			
		}
		// return birthdayDate;
		
	}
	
	public Person genderDetermination(Person person) {
		List<Person> list = new ArrayList<Person>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen cinsiyetinizi giriniz");
		String genString = scanner.nextLine();
		if (genString.equalsIgnoreCase(Gender.MAN.getGenderName())) {
			person = new Man(person.name, person.surname, person.getBirtDate());
			return person;
		} else {
			person = new Woman(person.name, person.surname, person.getBirtDate());
			return person;
		}
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public LocalDate getBirtDate() {
		return birtDate;
	}
	
	public void setBirtDate(LocalDate birtDate) {
		this.birtDate = birtDate;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Date getLogDate() {
		return logDate;
	}
	
	public List<Person> getList() {
		return list;
	}
	
	public void addList(Person person) {
		if (this.list == null) {
			this.list = new ArrayList<Person>();
		}
		this.list.add(person);
	}
	
	public void printlist() {
		try {
			list.stream().forEach(System.out::println);
		} catch (NullPointerException e) {
			System.out.println("hoppp");
		}
		
	}
	
	public void toSerializable(Person person) {
		
		try {
			FileOutputStream file = new FileOutputStream("E:\\file\\emeklilik.txt");
			ObjectOutputStream oos = new ObjectOutputStream(file);
			
			oos.writeObject(person);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Person deSerializable() {
		Person person = null;
		try {
			FileInputStream file = new FileInputStream("E:\\file\\emeklilik.txt");
			ObjectInputStream ois = new ObjectInputStream(file);
			person = (Person) ois.readObject();
			ois.close();
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println(person);
		return person;
		
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", birtDate=" + birtDate + ", gender="
				+ gender + "]";
	}
	
}
