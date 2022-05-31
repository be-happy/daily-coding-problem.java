package me.i7w.dailycodingproblem.google.day0001;

import java.util.HashSet;
import java.util.Set;

// T: O(n)
// S: O(n)
public class UseSet implements Solution {
    @Override
    public boolean solution(int[] ints, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i : ints) {
            if (set.contains(k - i)) return true;
            else set.add(i);
        }
        return false;
    }

}
