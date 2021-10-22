package com.bilgeadam.javaboost.clientserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TTServer {
	
	public static void main(String[] args) {
		String name;
		String password;
		PortIp portIp = new PortIp();
		portIp.setPort(4711);
		String readline;
		PswEncoderDecoder encoderDecoder = new PswEncoderDecoder();
		try {
			
			ServerSocket serverSocket = new ServerSocket(portIp.getPort());
			while (true) {
				Socket socket = serverSocket.accept();
				
				OutputStream output = socket.getOutputStream();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				PrintWriter writer = new PrintWriter(output, true);
				readline = bufferedReader.readLine();
				name = readline;
				password = bufferedReader.readLine();
				password = encoderDecoder.decoderMethod(password);
				// System.out.println("isim " + readline;
				// System.out.println("şifre" + readline);
				// System.out.println(password);
				writer.println("isim " + name);
				writer.println(password);
				writer.println("isminizin uzunluğu " + name.length());
			}
			// System.out.println("Adınızı Giriniz");
			// name=scanner.nextLine();
			// System.out.println("lütfen şifrenizi giriniz");
			// password=scanner.nextLine();
			//
			// writer.println(name);
			// writer.println(password);
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
	
}