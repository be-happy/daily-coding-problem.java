package me.i7w.dailycodingproblem.google.day0001;

import java.util.Arrays;

// T: O(n*log(n))
// S: O(1)
public class SortedArray implements Solution {
    @Override
    public boolean solution(int[] ints, int k) {
        Arrays.sort(ints);
        for (int l = 0, r = ints.length - 1; l < r; ) {
            int t = ints[l] + ints[r];
            if (t == k) return true;
            else if (t < k) l++;
            else r--;
        }
        return false;
    }
}
