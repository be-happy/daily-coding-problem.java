package me.i7w.dailycodingproblem.google.day0001;

//Daily Coding Problem: Problem #1 [Easy]
//
//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//For example, given `[10, 15, 3, 7]` and `k` of `17`, return `true` since `10 + 7` is `17`.
//Bonus: Can you do this in one pass?

// guess 1: can use only one time
// guess 2: duplicates
// guess 3: empty -> false

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    // T: O(n^2)
    // S: O(1)
    public boolean bruteforce(int[] ints, int k) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] + ints[j] == k) return true;
            }
        }
        return false;
    }

    // T: O(n*log(n))
    // S: O(1)
    public boolean sortArray(int[] ints, int k) {
        Arrays.sort(ints);
        for (int l = 0, r = ints.length - 1; l < r; ) {
            int t = ints[l] + ints[r];
            if (t == k) return true;
            else if (t < k) l++;
            else r--;
        }
        return false;
    }

    // T: O(n)
    // S: O(n)
    public boolean useSet(int[] ints, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i : ints) {
            if (set.contains(k - i)) return true;
            else set.add(i);
        }
        return false;
    }

}
