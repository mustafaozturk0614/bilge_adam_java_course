package com.bilgeadam.javaboost.şehir;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

// istemde buluna
// e�er obje g�ndereceksem biz veri g�ndermek i�in OutputStream
public class _Client5_Object {
	
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost", 5555);
			System.out.println("Ba�lant� tamam");
			OutputStream outputStream = socket.getOutputStream();
			
			// Object g�nderiyorum
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			
			ArrayList<StudentObject> objectList = new ArrayList<StudentObject>();
			objectList.add(new StudentObject(1, "Hamit"));
			objectList.add(new StudentObject(2, "Hamit2"));
			objectList.add(new StudentObject(3, "Hamit3"));
			objectList.add(new StudentObject(4, "Hamit4"));
			objectList.add(new StudentObject(5, "Hamit5"));
			
			objectOutputStream.writeObject(objectList);
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
