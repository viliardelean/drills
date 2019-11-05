package com.ardelean.drills;

public class StringDrills {

	public int lengthOfString(String str) {
		return str.length();
	}

	public String reverseWithFor(String string) {
		String result = "";
		if (null == string || string.length() == 0) {
			return result;
		}
		for (int i = string.length() - 1; i >= 0; i--) {
			result += string.charAt(i);
		}
		return result;
	}

	public String reverseWithWhile(String string) {
		String result = "";
		if (null == string || string.length() == 0) {
			return result;
		}
		int i = string.length() - 1;
		while (i >= 0) {
			result += string.charAt(i);
			i--;
		}

		return result;
	}

	public String reverseRecursively(String string) {
		if (null == string || string.length() == 0) {
			return string;
		}
		return reverseRecursively(string.substring(1)) + string.charAt(0);
	}

	public String lastThreeDigits(String mystr) {
		String result = mystr.substring(mystr.length() - 3);
		return result;
	}

	public String replaceMiddleWithMinus(String mystr) {
		if (mystr.length() % 2 == 1) {
			String firstString = "";
			String middleString = "-";
			String lastString = "";
			firstString = mystr.substring(0, (mystr.length() / 2));
			lastString = mystr.substring((mystr.length() / 2) + 1, mystr.length());
			mystr = firstString + middleString + lastString;
			return mystr;
		}
		return mystr;
	}

	public boolean checkIfInmatriculation(String inmatriculation) {
		if (inmatriculation.length() != 7) {
			return false;
		}
		

		return true;
	}
}
