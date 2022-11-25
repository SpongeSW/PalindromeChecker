package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @DisplayName("Check if input for method 1 of palindromes returns true")
    @ParameterizedTest
    @ValueSource(strings = {"kayak", "deified", "Do geese see God?", "Mr. Owl ate my metal worm"})
    void method_1(String str) {
        boolean expected = true;
        boolean result = new PalindromeChecker().method_1(str);

        assertEquals(expected, result);
    }

    @DisplayName("Check if input for method 2 of palindromes returns true")
    @ParameterizedTest
    @ValueSource(strings = {"kayak", "deified", "Do geese see God?", "Mr. Owl ate my metal worm"})
    void method_2(String str) {
        boolean expected = true;
        boolean result = new PalindromeChecker().method_2(str);

        assertEquals(expected, result);
    }

    @DisplayName("Check if input for method 1 of non palindromes returns false")
    @ParameterizedTest
    @ValueSource(strings = {"rotation", "treasure", "I am not a palindrome.", "Boot"})
    void method_1False(String str) {
        boolean expected = false;
        boolean result = new PalindromeChecker().method_1(str);

        assertEquals(expected, result);
    }

    @DisplayName("Check if input for method 2 of non palindromes returns false")
    @ParameterizedTest
    @ValueSource(strings = {"rotation", "treasure", "I am not a palindrome.", "Boot"})
    void method_2False(String str) {
        boolean expected = false;
        boolean result = new PalindromeChecker().method_2(str);

        assertEquals(expected, result);
    }
}