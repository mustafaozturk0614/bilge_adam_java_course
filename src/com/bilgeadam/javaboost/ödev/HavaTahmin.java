package com.bilgeadam.javaboost.ödev;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class HavaTahmin {
	
	public static void main(String[] args) {
		menu();
		
	}
	
	private static ArrayList<String> createToken(String string, String simge) {
		
		StringTokenizer tok = new StringTokenizer(string, simge);
		
		String emptyString = "";
		
		ArrayList<String> arrayList = new ArrayList<String>();
		while (tok.hasMoreElements()) {
			
			emptyString = (String) tok.nextElement();
			
			arrayList.add(emptyString);
			
		}
		
		return arrayList;
		
	}
	
	private static void airPollutionReport(ArrayList<String> arrayList) {
		
		String report = "";
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).contains(",\"components\":{")) {
				report = report + arrayList.get(i).substring(14);
				
			}
			
		}
		System.out.println("Hava Kirlilik Raporu: ".concat(report).concat("}\n"));
	}
	
	private static ArrayList<String> airPollution(double[] latlon) {
		String pollutionString = BAUtils.getPolutionData(latlon[0], latlon[1]);
		ArrayList<String> arrayList = createToken(pollutionString, "[}");
		
		// StringTokenizer tokenizer = new StringTokenizer(pollutionString, "[}");
		//
		// String emptyString = "";
		//
		// ArrayList<String> arrayList = new ArrayList<String>();
		// while (tokenizer.hasMoreElements()) {
		//
		// emptyString = (String) tokenizer.nextElement();
		//
		// arrayList.add(emptyString);
		//
		// }
		//
		return arrayList;
		
	}
	
	private static void menu() {
		// // 1 enlem boylam
		// // 2 Günlük hava raporu
		// // 3 Hava kirlilik raporu
		// // 4 15 saatlik hava raporu
		// // 5 çıkış
		String[] inputs = inputs();
		
		while (true) {
			
			System.out.println("\n\t\t========** HAVA TAHMİN **======== \n\n");
			System.out.println("1-Enlem Ve Boylam Değerleri ");
			System.out.println("2-Günlük Hava Raporu ");
			System.out.println("3-Hava Kirlilik Raporu ");
			System.out.println("4-15 saatlik hava raporu  ");
			System.out.println("5-çıkış ");
			
			int input = BAUtils.readInt("lütfen bir işlem seçiniz");
			switch (input) {
				case 1: {
					
					System.out.println(printLatutide(findLongitude(latitudeAndLongitudeListCreate(inputs))));
					BAUtils.wantToEnd("\nÇıkmak için Q tuşuna basın/Devam etmek için herhangi bir tuşa basınız.",
							" q\n");
					break;
					
				}
				case 2: {
					System.out.println("\n"
							+ getResult(WheatherListCreate(findLongitude(latitudeAndLongitudeListCreate(inputs)))));
					
					break;
					
				}
				case 3: {
					
					airPollutionReport(airPollution(findLongitude(latitudeAndLongitudeListCreate(inputs))));
					break;
					
				}
				case 4: {
					
					FifteenHour(ForecastDataList(inputs));
					break;
					
				}
				case 5: {
					
					System.exit(0);
					break;
					
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + input);
			}
			
		}
	}
	
	private static String[] inputs() {
		String[] information = new String[3];
		String country = BAUtils.readString("Lütfen bir ülke isimi  giriniz (TR, BRZ, JPN gibi)");
		String city = BAUtils.readString("Lütfen bir şehir isimi  giriniz ");
		String town = BAUtils.readString("Lütfen bir ilçe isimi  giriniz ");
		information[0] = country;
		information[1] = city;
		information[2] = town;
		
		return information;
		
	}
	
	private static ArrayList<String> ForecastDataList(String[] information) {
		
		String weatherString = "Enlem / Boylam Sorgusu : "
				+ BAUtils.getForecastData(information[2], information[1], information[0]);
		ArrayList<String> arrayList = createToken(weatherString, "[],{}");
		
		// StringTokenizer tokenizer = new StringTokenizer(weatherString, "[],{}");
		//
		// String emptyString = "";
		//
		// ArrayList<String> arrayList = new ArrayList<String>();
		// while (tokenizer.hasMoreElements()) {
		//
		// emptyString = (String) tokenizer.nextToken();
		//
		// arrayList.add(emptyString);
		// }
		return arrayList;
		
	}
	
	private static void FifteenHour(ArrayList<String> arrayList) {
		
		Map<String, String> map = new LinkedHashMap<String, String>();
		ArrayList<String> data = new ArrayList<String>();
		ArrayList<String> data2 = new ArrayList<String>();
		arrayList.remove(0);
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).contains("\"dt\"")) {
				data.add(arrayList.get(i));
				
			}
			if (arrayList.get(i).contains("\"temp\"")) {
				data2.add(arrayList.get(i));
				
			}
			
		}
		
		for (int i = 0; i < 5; i++) {
			map.put(BAUtils.timeAsString(Long.parseLong(data.get(i).substring(5))), data2.get(i).substring(6));
			
		}
		
		map.entrySet().forEach(System.out::println);
		
	}
	
	private static ArrayList<String> latitudeAndLongitudeListCreate(String[] information) {
		String[] location = new String[3];
		
		location[0] = information[2];
		location[1] = information[1];
		location[2] = information[0];
		
		String enlemBoylamString = "Enlem / Boylam Sorgusu : "
				+ BAUtils.getDirectData(information[2], information[1], information[0]);
		ArrayList<String> arrayList = createToken(enlemBoylamString, "{},");
		// StringTokenizer tokenizer = new StringTokenizer(enlemBoylamString, "{},");
		//
		// String emptyString = "";
		//
		// ArrayList<String> arrayList = new ArrayList<String>();
		// while (tokenizer.hasMoreElements()) {
		//
		// emptyString = (String) tokenizer.nextElement();
		//
		// arrayList.add(emptyString);
		//
		// }
		return arrayList;
	}
	
	private static double[] findLongitude(ArrayList<String> arrayList) {
		double lat = -1.0;
		double lon = -1.0;
		String a = "";
		String b = "";
		double[] latlon = new double[2];
		
		for (int j = 0; j < arrayList.size(); j++) {
			if (arrayList.get(j).startsWith(("\"lon\""))) {
				a = arrayList.get(j);
				// lat = Double.valueOf(a.substring(1));
				// System.out.println(a)
			}
			
			if (arrayList.get(j).startsWith(("\"lat\"")))
				b = arrayList.get(j);
			// lon = Double.valueOf(arrayList.get(j).substring(6));
			// latlon[1] = lon;
			
		}
		lat = Double.valueOf(b.substring(6));
		latlon[0] = lat;
		lon = Double.valueOf(a.substring(6));
		latlon[1] = lon;
		
		return latlon;
	}
	
	public static String printLatutide(double[] latlon) {
		
		return "enlem değeri : " + latlon[0] + "\nboylam değeri: " + latlon[1];
		
	}
	
	private static ArrayList<String> WheatherListCreate(double[] latlon) {
		
		String havaDurumu = "	Günlük Hava Raporu : " + BAUtils.getWeatherData(latlon[0], latlon[1]);
		ArrayList<String> arrayList = createToken(havaDurumu, "{},[");
		
		return arrayList;
		// StringTokenizer tokenizer = new StringTokenizer(havaDurumu, "{},[");
		//
		// String emptyString = "";
		//
		// ArrayList<String> arrayList = new ArrayList<String>();
		// while (tokenizer.hasMoreElements()) {
		//
		// emptyString = (String) tokenizer.nextElement();
		//
		// arrayList.add(emptyString);
		//
		// }
		
	}
	
	private static String getResult(ArrayList<String> arrayList) {
		
		String durum = "";
		String sıcaklık = "";
		String hissedilen = "";
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).contains("\"description\"")) {
				durum = sıcaklık + arrayList.get(i).substring(14);
				
			}
			if (arrayList.get(i).contains("\"temp\"")) {
				sıcaklık = sıcaklık + arrayList.get(i).substring(6);
				
			}
			if (arrayList.get(i).contains("\"feels_like\"")) {
				hissedilen = hissedilen + arrayList.get(i).substring(12);
				
			}
			
		}
		return "havanın durumu: ".concat(durum).concat("\nsıcaklık: ").concat(sıcaklık)
				.concat("\nhissedilen sıcaklık: ").concat(hissedilen) + "\n";
	}
}
