package com.ardelean.drills;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
		assertEquals("", testedClass.reverseWithFor(null));
	}
	
	// returns the last 3 characters as a string with substring
	@Test
	public void lastThreeDigits() {
		assertEquals("rel", testedClass.lastThreeDigits("dorel"));
		assertEquals("el", testedClass.lastThreeDigits("el"));
	}
	
	// if string has odd length, replace middle character with "-" 
	@Test
	public void replaceMiddleWithMinus() {
		assertEquals("do-el", testedClass.replaceMiddleWithMinus("dorel"));
		assertEquals("family", testedClass.replaceMiddleWithMinus("family"));
	}
	
	// given a String, check if it is a inmatriculation format. returns boolean
	//format AA11AAA
	@Test
	public void checkIfInmatriculation() {
		assertTrue(testedClass.checkIfInmatriculation("AR28TOE"));
		assertFalse(testedClass.checkIfInmatriculation("A328TOE"));
		assertFalse(testedClass.checkIfInmatriculation("AR328"));
		//assertTrue
		//assertEquals("", testedClass.reverseWithFor(null));
	}

}
