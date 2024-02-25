package com.theflippedbit.leetcode;

import java.util.HashSet;
import java.util.Set;

// 217. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/

public class ContainsDuplicate {

    // Take the first element, loop over the rest of the array looking for duplicates,
    // take the next element.. repeat until checked all of them.
    public static boolean solutionNaive(int[] nums) {
        for (int i = 0; i < nums.length -1 ; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    // Track each element seen using a Set.
    // Loop over each element checking the Set to determine if they've previously been seen.
    public static boolean solutionSet(int[] nums) {
        Set<Integer> seenNums = new HashSet<>();

        for (Integer num : nums) {
            if (seenNums.contains(num)) {
                return true;
            }

            seenNums.add(num);
        }

        return false;
    }

    // simpler for loop internals, but not as easy to read
    // 'add' returns true if this set did not already contain the specified element
    //     if (!seenNums.add(num)) {
    //         return true;
    //     }

}
