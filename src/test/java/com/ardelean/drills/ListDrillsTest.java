/**
 *  Copyright Murex S.A.S., 2003-2019. All Rights Reserved.
 * 
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.ardelean.drills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;

public class ListDrillsTest {

	// ~
	// ----------------------------------------------------------------------------------------------------------------
	// ~ Instance fields
	// ~
	// ----------------------------------------------------------------------------------------------------------------

	ListDrills tested = new ListDrills();

	// ~
	// ----------------------------------------------------------------------------------------------------------------
	// ~ Methods
	// ~
	// ----------------------------------------------------------------------------------------------------------------

	@Test
	public void elementsStartingWith() {

		List<String> input = new ArrayList<String>() {
			{
				add("London");
				add("Loma Linda");
				add("California");
			}
		};
		assertTrue(tested.elementsStartingWith(input, "L").contains("London"));
		assertFalse(tested.elementsStartingWith(input, "L").contains("California"));
	}

	// remove elements with less than 3 characters from a list of strings and return
	// the same list
	@Test
	public void removeElements() {
		List<String> input = new ArrayList<String>() {
			{
				add("London");
				add("Loma Linda");
				add("California");
				add("bit");
				add("as");
			}
		};
		assertTrue(tested.removeElements(input).contains("bit"));
		assertFalse(tested.removeElements(input).contains("as"));
	}

	// return the average (as double) of a List of numbers (integers)
	
	 @Test 
	 public void averageDouble() {List<Integer> input = new ArrayList<Integer>() {
			{
				add(3);
				add(5);
				add(6);
				add(4);
				add(8);
			}
		};
		assertEquals(5.2, tested.averageDouble(input) , 0.0);
		//assertFalse(tested.averageDouble(input).contains("as"));
	 
	 }	 

}
