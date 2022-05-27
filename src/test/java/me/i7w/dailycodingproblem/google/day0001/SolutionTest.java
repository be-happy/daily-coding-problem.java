package me.i7w.dailycodingproblem.google.day0001;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    void empty() {
        assertFalse(solution.bruteforce(new int[]{}, 1));
        assertFalse(solution.sortArray(new int[]{}, 1));
        assertFalse(solution.useSet(new int[]{}, 1));
    }

    @Test
    void example() {
        assertTrue(solution.bruteforce(new int[]{10, 15, 3, 7}, 17));
        assertTrue(solution.sortArray(new int[]{10, 15, 3, 7}, 17));
        assertTrue(solution.useSet(new int[]{10, 15, 3, 7}, 17));
    }
}