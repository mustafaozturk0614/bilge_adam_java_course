package com.bilgeadam.javaboost.clientserver;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PswEncoderDecoder {
	
	public String encoderMethod(String password) {
		
		Encoder encoder = Base64.getEncoder();
		String toPaswordString = encoder.encodeToString(password.getBytes());
		// System.out.println("şifrelenmiş veri" + toPaswordString);
		
		return toPaswordString;
		
	}
	
	public String decoderMethod(String password) {
		
		Decoder decoder = Base64.getDecoder();
		String toPaswordString = new String(decoder.decode(password));
		// System.out.println("şifrelenmiş veri" + toPaswordString);
		
		return toPaswordString;
		
	}
	
}
