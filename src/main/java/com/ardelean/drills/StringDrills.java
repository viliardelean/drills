package com.ardelean.drills;

public class StringDrills {

	
	public int lengthOfString(String str) {
		return str.length();
	}

	public String reverseWithFor(String string) {
		String result = "";
		if (null == string || string.length()==0) {
			return result;
		}
		for (int i=string.length()-1; i>=0; i--) {
			result+=string.charAt(i);
		}
		return result;
	}
}
