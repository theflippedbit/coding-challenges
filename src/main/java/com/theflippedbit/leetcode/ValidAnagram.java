package com.theflippedbit.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 242. Valid Anagram
// https://leetcode.com/problems/valid-anagram/description/

public class ValidAnagram {

    // Notes:
    // - to be an anagram, each string must contain the same amount characters

    // sort
    public static boolean solutionSort(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }

    // frequency count
    public static boolean solutionFrequencyCounts(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // loop over s, adding to a frequency count of the characters seen
        // loop over t, deducting from the previous frequency count of each character
        // loop over the frequency count values, if all are zero then they're anagrams

        Map<Character, Integer> frequencyCount = new HashMap<>();

        for (Character sChar : s.toCharArray()) {
            int currentCount = frequencyCount.getOrDefault(sChar, 0);
            frequencyCount.put(sChar, currentCount + 1);
        }

        for (Character tChar : t.toCharArray()) {
            int currentCount = frequencyCount.getOrDefault(tChar, 0);
            // could exit early here by checking if we've gone below zero, instead of looping over everything later
            frequencyCount.put(tChar, currentCount - 1);
        }

        for (Integer currentCount : frequencyCount.values()) {
            if (currentCount != 0) {
                return false;
            }
        }

        return true;
    }

    // version 2
    // frequency count loop over both at the same time, they should be the same length
    // todo why does looping over them simultaneously take double the time as the above approach (27-29ms here vs 12-14ms for above)
    public static boolean solutionFrequencyCountsTwo(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freqencyCounts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int currentCount = freqencyCounts.getOrDefault(s.charAt(i), 0);
            freqencyCounts.put(s.charAt(i), ++currentCount);

            currentCount = freqencyCounts.getOrDefault(t.charAt(i), 0);
            freqencyCounts.put(t.charAt(i), --currentCount);
        }

        for (Integer currentCount : freqencyCounts.values()) {
            if (currentCount != 0) {
                return false;
            }
        }

        return true;
    }


    // hashmap optimization
    // frequency count using 'custom' hashmap
    public static boolean solutionCustomFrequencyOpt(String s, String t) {

        return false;
    }

}
