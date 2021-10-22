package com.bilgeadam.javaboost.clientserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.bilgeadam.javaboost.ödev.BAUtils;

public class TheClient {
	static Scanner scanner = new Scanner(System.in);
	
	public static void client() throws UnknownHostException, IOException {
		String name;
		String password;
		String maskpassword;
		String lastpasword;
		
		PortIp portIp = new PortIp();
		portIp.setPort(4711);
		portIp.setIpAdress("localhost");
		Socket socket = null;
		PswEncoderDecoder encoderDecoder = new PswEncoderDecoder();
		
		try {
			socket = new Socket(portIp.getIpAdress(), portIp.getPort());
			
			OutputStream output = socket.getOutputStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter writer = new PrintWriter(output, true);
			
			System.out.println("Adınızı Giriniz");
			name = scanner.nextLine();
			System.out.println("lütfen şifrenizi giriniz");
			password = scanner.nextLine();
			maskpassword = encoderDecoder.encoderMethod(password);
			writer.println(name);
			writer.println(maskpassword);
			System.out.println(maskpassword);
			System.out.println(bufferedReader.readLine());
			lastpasword = bufferedReader.readLine();
			if (lastpasword.equalsIgnoreCase(password)) {
				
				System.out.println("şifre doğru çözümlenmiştir");
				
			} else {
				System.out.println("yanlışş");
			}
			
			System.out.println(bufferedReader.readLine());
			bufferedReader.close();
			socket.close();
			writer.close();
			output.close();
		} catch (IOException ex) {
			System.err.println(ex);
		} finally {
			
		}
		
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		do {
			client();
		} while (BAUtils.wantToEnd("çıkmak için q", "q"));
		
	}
	
}
