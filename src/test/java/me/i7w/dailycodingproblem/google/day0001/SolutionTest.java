package me.i7w.dailycodingproblem.google.day0001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public interface SolutionTest<T extends Solution> {
    T createInstance();

    @Test
    default void empty() {
        assertFalse(createInstance().solution(new int[]{}, 1));
    }

    @Test
    default void example() {
        assertTrue(createInstance().solution(new int[]{10, 15, 3, 7}, 17));
    }
}
