package com.ardelean.drills.any;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chars {


    // Will print the list of vowels which appear the most often, and also the count.
    // Case-insensitive
    // Example "Ana are mere" will pring [A, E] appear 3 times
    void maxCountVowel(Set<Character> vowels, String input) {
        Map<Character, Integer> charByCount = new HashMap<>();
        int max = - 1;
        for (Character letter : input.toCharArray()) {
            char toUpperCase = Character.toUpperCase(letter);
            if (vowels.contains(toUpperCase)) {
                charByCount.merge(toUpperCase, 1, Integer::sum);
                max = Math.max(max, charByCount.get(toUpperCase));
            }
        }
        int maxCount = max;
        List<Character> result = charByCount.keySet().stream()
                .filter(key -> charByCount.get(key) == maxCount).collect(Collectors.toList());
        System.out.println(result + " appears " + maxCount + " times");
    }

    // Same as above but with streams. Note that we have to traverse the input many times
    void maxCountVowel2(Set<Character> vowels, String input) {
        String normalized = input.toUpperCase();
        Stream<Character> stream = normalized.chars().mapToObj(c -> (char) c);
        Map<Character, Integer> map = stream.filter(vowels::contains)
                .collect(Collectors.toMap(chars1 -> chars1, chars1 -> 1, Integer::sum));

        int max = map.values().stream().max(Integer::compare).get();

        List<Character> result = map.keySet().stream().filter(key -> map.get(key) == max).collect(Collectors.toList());
        System.out.println(result + " appears " + max + " times");
    }
}
