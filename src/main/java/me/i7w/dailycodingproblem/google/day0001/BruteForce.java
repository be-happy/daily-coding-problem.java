package me.i7w.dailycodingproblem.google.day0001;

// T: O(n^2)
// S: O(1)
public class BruteForce implements Solution {
    public boolean solution(int[] ints, int k) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] + ints[j] == k) return true;
            }
        }
        return false;
    }
}
