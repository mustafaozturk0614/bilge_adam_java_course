package com.bilgeadam.boost.java.şehir;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class City implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7137362176345221736L;
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
	
	public List<City> addlist() throws IOException {
		ArrayList<City> cityList = new ArrayList<City>();
		String empty = "";
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\file\\şehirler.txt"));
		while (true) {
			String lineString = bufferedReader.readLine();
			if (lineString == null) {
				break;
			} else {
				
				StringTokenizer tokenizer = new StringTokenizer(lineString, ", \n ");
				
				while (tokenizer.hasMoreElements()) {
					
					empty = (String) tokenizer.nextToken();
					
					cityList.add(new City(counter, empty));
				}
			}
			
		}
		bufferedReader.close();
		return cityList;
		
	}
	
	public static void main(String[] args) throws IOException {
		City city = new City();
		city.addlist();
		
	}
}
