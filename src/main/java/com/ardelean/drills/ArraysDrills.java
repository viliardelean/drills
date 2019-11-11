package com.ardelean.drills;

import java.util.Arrays;

public class ArraysDrills {

	public int maxValue(int[] array) {

		int maxValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}

	public char[] replaceCharacters(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'a') {
				array[i] = '@';
			} else if (array[i] == 'i') {
				array[i] = '1';
			}
		}
		return array;
	}

	public int[] duplicateValue(int[] array) {
		int[] duplicatedValues = new int[10];
		int duplicate = 0;
		int index = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					duplicate = array[i];
					duplicatedValues[index] = duplicate;
					index++;
				}
			}
		}
		return duplicatedValues;
	}

}
