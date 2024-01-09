package com.ardelean.drills;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArraysDrillsTest {

	private ArraysDrills testedClass = new ArraysDrills();

	// return the largest number of an Array with normal for loop
	@Test
	public void testMaxValue() {
		int[] input = { 3, 4, 7, 9, 13, 20, 2, 8 };
		int[] input2 = { 5 };
		assertEquals(20, testedClass.maxValue(input));
	}

	@Test
	public void replaceCharacters() {
		char[] input = { 'a', 'v', 'i', 'o', 'n' };
		assertEquals('v', testedClass.replaceCharacters(input)[1]);
	}

	// return the int value which appears twice in an array (nested for loops)
	@Test
	public void duplicateValue() {
		int[] input1 = { 7, 4, 7, 3, 9, 8, 13, 10, 3, 20, 2, 8 };
		int[] input2 = { 1, 4, 2, 7, 10, 9, 13, 10, 20, 2, 8 };
		int[] output = { 7, 8 };

		assertEquals(8, testedClass.duplicateValue(input1)[2]);
		// assertEquals(10, testedClass.duplicateValue(input2));
	}
}
