package com.theflippedbit.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {

    private final int[] nums1 = new int[] {1, 2, 3};
    private final int[] nums2 = new int[] {-10,-11,10,3,-10};
    private final int[] nums3 = new int[] {5};
    private final int[] nums4 = new int[] {1,2,3,1};
    private final int[] nums5 = new int[] {1,2,3,4};
    private final int[] nums6 = new int[] {1,1,1,3,3,4,3,2,4,2};

    @Test
    public void naiveTests() {
        assertFalse(ContainsDuplicate.solutionNaive(nums1));
        assertTrue(ContainsDuplicate.solutionNaive(nums2));
        assertFalse(ContainsDuplicate.solutionNaive(nums3));
        assertTrue(ContainsDuplicate.solutionNaive(nums4));
        assertFalse(ContainsDuplicate.solutionNaive(nums5));
        assertTrue(ContainsDuplicate.solutionNaive(nums6));
    }

    @Test
    public void setTests() {
        assertFalse(ContainsDuplicate.solutionSet(nums1));
        assertTrue(ContainsDuplicate.solutionSet(nums2));
        assertFalse(ContainsDuplicate.solutionSet(nums3));
        assertTrue(ContainsDuplicate.solutionSet(nums4));
        assertFalse(ContainsDuplicate.solutionSet(nums5));
        assertTrue(ContainsDuplicate.solutionSet(nums6));
    }

}
