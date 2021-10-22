package com.bilgeadam.boost.java.şehir;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// gelen istekleri yerine getirendir.
public class _Server5_Object {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			ServerSocket serverSocket = new ServerSocket(5555);
			System.out.println("Server Başlamaya hazır");
			
			Socket socket = serverSocket.accept();
			
			InputStream inputStream = socket.getInputStream();
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			City city = (City) objectInputStream.readObject();
			
			OutputStream outputStream = socket.getOutputStream();
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(city.addlist());
			
			serverSocket.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
