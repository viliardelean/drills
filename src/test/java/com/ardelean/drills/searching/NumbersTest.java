package com.ardelean.drills.searching;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    Numbers underTest = new Numbers();

    @Test
    public void binarySearch() {
        int[] values = {2, 6, 8, 13, 20, 22, 27, 29};
        assertEquals(-1, underTest.binarySearch(values, 23));
        assertEquals(4, underTest.binarySearch(values, 20));
    }

    @Test
    public void binarySearchRecursive() {
        int[] values = {2, 6, 8, 13, 20, 22, 27, 29};
        assertEquals(-1, underTest.binarySearchRecursive(values, 23));
        assertEquals(4, underTest.binarySearchRecursive(values, 20));
    }
}