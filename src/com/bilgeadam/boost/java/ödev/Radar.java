package com.bilgeadam.boost.java.ödev;

import java.util.Scanner;

public class Radar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("hızınızı giriniz : ");
		int hız = sc.nextInt();
		double para = 0;
		
		if (hız > 80 && hız <= 85) {
			para = 200;
			para = 200 - (200 * 0.15);
			System.out.println("hızlı gidiyorsunuz lütfen yavaşlayın cezanız:**200 Tl** ");
			System.out.printf("eğer erken öderseniz Yüde 15 indirim alacaksınız %f TL dir.: ", para);
			
		} else if (hız > 85 && hız <= 100) {
			para = 300;
			para = 300 - (300 * 0.15);
			System.out.println("hızlı gidiyorsunuz lütfen yavaşlayın cezanız:**300 Tl** ");
			System.out.printf("eğer erken öderseniz Yüde 15 indirim alacaksınız \n indirimli fiyat : %f TL dir.: ",
					para);
		} else if (hız > 100) {
			System.out.println("hızlı gidiyorsunuz lütfen yavaşlayın cezanız:**1000 Tl**");
			System.out.println("XXXX-EHLİYETİNİZE EL KONULACAKTIR-XXXX");
		} else {
			System.out.println("*****TEBRİKLER HZI SINIRLARI İÇERİSİNDE GİDİYORSUNUZ***");
		}
		sc.close();
	}
	
}
