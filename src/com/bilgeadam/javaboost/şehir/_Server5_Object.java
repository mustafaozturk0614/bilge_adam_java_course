package com.bilgeadam.javaboost.şehir;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

// gelen istekleri yerine getirendir.
public class _Server5_Object {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			ServerSocket serverSocket = new ServerSocket(5555);
			System.out.println("Server Başlamaya hazır");
			
			Socket socket = serverSocket.accept();
			
			InputStream inputStream = socket.getInputStream();
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			
			ArrayList<City> list = (ArrayList<City>) objectInputStream.readObject();
			
			// stream()
			list.forEach((temp) -> System.out.println(temp.getId() + " " + temp.getCitiyName()));
			
			serverSocket.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
