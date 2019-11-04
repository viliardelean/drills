package com.ardelean.drills;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class StringDrillsTest {

	private StringDrills testedClass= new StringDrills();
	
	@Test
	public void testLengthOfString() {
		assertEquals(testedClass.lengthOfString("mama"), 4);
	}
	
	@Test
	public void reverseWithFor() {
		assertEquals("lerod", testedClass.reverseWithFor("dorel"));
		assertEquals("", testedClass.reverseWithFor(null));
	}
	
	@Test
	public void reverseWithWhile() {
		assertEquals("lerod", testedClass.reverseWithFor("dorel"));
		//assertEquals("", testedClass.reverseWithFor(null));
	}
	
	@Test
	public void reverseRecursively() {
		assertEquals("lerod", testedClass.reverseWithFor("dorel"));
		//assertEquals("", testedClass.reverseWithFor(null));
	}
	
	// returns the last 3 characters as a string with substring
	@Test
	public void lastThreeDigits() {
		assertEquals("lerod", testedClass.reverseWithFor("dorel"));
		//assertEquals("", testedClass.reverseWithFor(null));
	}
	
	// if string has odd length, replace middle character with "-" 
	@Test
	public void replaceMiddleWithMinus() {
		assertEquals("lerod", testedClass.reverseWithFor("dorel"));
		//assertEquals("", testedClass.reverseWithFor(null));
	}
	
	// given a String, check if it is a inmatriculation format. returns boolean
	//format AA11AAA
	@Test
	public void checkIfInmatriculation() {
		assertEquals("lerod", testedClass.reverseWithFor("dorel"));
		//assertTrue
		//assertEquals("", testedClass.reverseWithFor(null));
	}

}
