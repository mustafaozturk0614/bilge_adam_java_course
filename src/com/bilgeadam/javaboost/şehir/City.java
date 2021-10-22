package com.bilgeadam.javaboost.şehir;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class City {
	static int counter = 0;
	int id;
	private String citiyName;
	
	public City() {
		counter++;
		id = counter;
	}
	
	public City(int id, String citiyName) {
		this();
		this.id = id;
		this.citiyName = citiyName;
	}
	
	@Override
	public String toString() {
		return "City [id=" + id + ", citiyName=" + citiyName + "]";
	}
	
	public static int getCounter() {
		return counter;
	}
	
	public static void setCounter(int counter) {
		City.counter = counter;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCitiyName() {
		return citiyName;
	}
	
	public void setCitiyName(String citiyName) {
		this.citiyName = citiyName;
		
	}
	
	public void addlist() {
		ArrayList<City> cityList = new ArrayList<City>();
		String empty = "";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\file\\şehirler.txt"))) {
			
			while (true) {
				String lineString = bufferedReader.readLine();
				if (lineString == null) {
					break;
				} else {
					
					StringTokenizer tokenizer = new StringTokenizer(lineString, ",");
					
					while (tokenizer.hasMoreElements()) {
						
						empty = (String) tokenizer.nextToken();
						
						cityList.add(new City(id, empty));
					}
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		cityList.forEach((temp) -> System.out.println(temp.getId() + " " + temp.getCitiyName()));
		
	}
	
	public static void main(String[] args) {
		City city = new City(5, "b");
		System.out.println(city.toString());
		
	}
}
