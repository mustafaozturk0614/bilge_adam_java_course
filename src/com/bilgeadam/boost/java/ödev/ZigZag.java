package com.bilgeadam.boost.java.ödev;

public class ZigZag {
	public static void main(String[] args) {
		
		ZigZag aZag = new ZigZag();
		System.out.println(aZag.convert("PAYPALISHIRING", 3));
		
	}
	
	public String convert(String s, int numRows) {
		
		if (numRows == 1)
			return s;
		
		StringBuilder ret = new StringBuilder();
		int n = s.length();
		int cycleLen = 2 * numRows - 2;
		
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j + i < n; j += cycleLen) {
				ret.append(s.charAt(j + i));
				System.out.println(ret);
				if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
					ret.append(s.charAt(j + cycleLen - i));
				System.out.println(ret);
			}
		}
		return ret.toString();
	}
	
}
