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

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Instance fields 
    //~ ----------------------------------------------------------------------------------------------------------------

    ListDrills tested = new ListDrills();

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods 
    //~ ----------------------------------------------------------------------------------------------------------------

    @Test
    public void elementsStartingWith() {

        String[] input = { "London", "Loma Linda", "California" };
        assertTrue(tested.elementsStartingWith(Arrays.asList(input), "L").contains("London"));
        assertFalse(tested.elementsStartingWith(Arrays.asList(input), "L").contains("California"));
    }

    // remove elements with less than 3 characters from a list of strings and return the same list
    /*@Test
     * public void elementsStartingWith() {
     *
     *  String[] input = { "London", "Loma Linda", "California" };
     *  assertTrue(tested.elementsStartingWith(Arrays.asList(input), "L").contains("London"));
     *  assertFalse(tested.elementsStartingWith(Arrays.asList(input), "L").contains("California"));
     *}*/

    // return the average (as double) of a List of numbers (integers)
    /*@Test
     * public void elementsStartingWith() {
     *
     *  String[] input = { "London", "Loma Linda", "California" };
     *  assertTrue(tested.elementsStartingWith(Arrays.asList(input), "L").contains("London"));
     *  assertFalse(tested.elementsStartingWith(Arrays.asList(input), "L").contains("California"));
     *}*/

}
