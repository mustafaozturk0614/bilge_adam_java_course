package com.bilgeadam.boost.java.şehir;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

// istemde buluna
// e�er obje g�ndereceksem biz veri g�ndermek i�in OutputStream
public class _Client5_Object {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			Socket socket = new Socket("localhost", 5555);
			System.out.println("Ba�lant� tamam");
			OutputStream outputStream = socket.getOutputStream();
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(new City());
			InputStream inputStream = socket.getInputStream();
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			
			ArrayList<City> list = (ArrayList<City>) objectInputStream.readObject();
			
			list.forEach((temp) -> System.out.println(temp.getId() + " " + temp.getCitiyName()));
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
