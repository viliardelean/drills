package com.ardelean.drills.medium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringsTest {

    private Strings underTest = new Strings();

    @Test
    public void isPalindrome() {
        String palindrome1 = "ABCDCBA";
        String palindrome2 = "AABCDCB";
        String palindrome3 = "BCDCBAA";
        String notPpalindrome = "ABAR";
        assertTrue(underTest.isRotatedPalindrome(palindrome1));
        assertTrue(underTest.isRotatedPalindrome(palindrome2));
        assertTrue(underTest.isRotatedPalindrome(palindrome3));
        assertFalse(underTest.isRotatedPalindrome(notPpalindrome));
    }
}