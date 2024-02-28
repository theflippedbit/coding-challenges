package com.theflippedbit.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    private final String s1 = "anagram";
    private final String t1 = "nagaram";

    private final String s2 = "rat";
    private final String t2 = "car";

    private final String s3 = "rat";
    private final String t3 = "tar";

    private final String s4 = "longest";
    private final String t4 = "short";

    private final String s5 = "players";
    private final String t5 = "parsley";

    @Test
    void solutionSort() {
        assertTrue(ValidAnagram.solutionSort(s1, t1));
        assertFalse(ValidAnagram.solutionSort(s2, t2));
        assertTrue(ValidAnagram.solutionSort(s3, t3));
        assertFalse(ValidAnagram.solutionSort(s4, t4));
        assertTrue(ValidAnagram.solutionSort(s5, t5));
    }

    @Test
    void solutionFrequencyCounts() {
        assertTrue(ValidAnagram.solutionFrequencyCounts(s1, t1));
        assertFalse(ValidAnagram.solutionFrequencyCounts(s2, t2));
        assertTrue(ValidAnagram.solutionFrequencyCounts(s3, t3));
        assertFalse(ValidAnagram.solutionFrequencyCounts(s4, t4));
        assertTrue(ValidAnagram.solutionFrequencyCounts(s5, t5));
    }

    @Test
    void solutionFrequencyCountsTwo() {
        assertTrue(ValidAnagram.solutionFrequencyCountsTwo(s1, t1));
        assertFalse(ValidAnagram.solutionFrequencyCountsTwo(s2, t2));
        assertTrue(ValidAnagram.solutionFrequencyCountsTwo(s3, t3));
        assertFalse(ValidAnagram.solutionFrequencyCountsTwo(s4, t4));
        assertTrue(ValidAnagram.solutionFrequencyCountsTwo(s5, t5));
    }

}
