package org.example.algoexpert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoNumberSum {

    public static void main(String[] args) {

        twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);

    }

    static int[] twoNumberSum(int[] array, int target) {

        Set<Integer> nums = new HashSet<>();

        for (int num : array) {
            int potentialMatch = target - num;
            /* The method contains is not an under-the-hood 'for' statement, but a 'map' */
            if (nums.contains(potentialMatch)) {
                return new int[] {potentialMatch, num};
            } else {
                nums.add(num);
            }
        }

        return new int[0];
    }

}
