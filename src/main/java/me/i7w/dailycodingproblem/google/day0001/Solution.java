package me.i7w.dailycodingproblem.google.day0001;

//Daily Coding Problem: Problem #1 [Easy]
//
//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//For example, given `[10, 15, 3, 7]` and `k` of `17`, return `true` since `10 + 7` is `17`.
//Bonus: Can you do this in one pass?

// guess 1: can use only one time
// guess 2: duplicates
// guess 3: empty -> false

public interface Solution {
    // T: O(n^2)
    // S: O(1)
    boolean solution(int[] ints, int k);
}
