package com.ardelean.drills.medium;

public class Strings {

    // https://www.techiedelight.com/check-given-string-rotated-palindrome-not/
    // check if given string is rotated palindome
    // CBAABCD is a rotated palindrome as it is a rotation of palindrome ABCDCBA
    // naive approach

    // naive approach
    public boolean isRotatedPalindrome(String input) {
        System.out.println("-----------------");
        if (input == null) {
            throw new IllegalArgumentException("input should not be null");
        }
        int length = input.length();

        for (int i = 0; i < length; i++) {
            System.out.println(input);
            if (isPalindrome(input, 0, length - 1)) {
                return true;
            }
            input = input.substring(1) + input.charAt(0);
        }
        return false;

    }
    public boolean isPalindrome(String input, int low, int high) {

        return (low >= high) || (input.charAt(low) == input.charAt(high) &&
                isPalindrome(input, low + 1, high - 1));
    }
}
