package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @DisplayName("Check if input for method 1 of palindromes returns true")
    @ParameterizedTest
    @ValueSource(strings = {"kayak", "deified", "Do geese see God?", "Mr. Owl ate my metal worm"})
    void method_1True(String str) {
        String expected = str + " is a palindrome.";
        String result = new PalindromeChecker().method_1(str);

        assertEquals(expected, result);
    }

    @DisplayName("Check if input for method 2 of palindromes returns true")
    @ParameterizedTest
    @ValueSource(strings = {"kayak", "deified", "Do geese see God?", "Mr. Owl ate my metal worm"})
    void method_2True(String str) {
        String expected = str + " is a palindrome.";
        String result = new PalindromeChecker().method_2(str);

        assertEquals(expected, result);
    }

    @DisplayName("Check if input for method 1 of non palindromes returns false")
    @ParameterizedTest
    @ValueSource(strings = {"rotation", "treasure", "I am not a palindrome.", "Boot"})
    void method_1False(String str) {
        String expected = str + " is not a palindrome.";
        String result = new PalindromeChecker().method_1(str);

        assertEquals(expected, result);
    }

    @DisplayName("Check if input for method 2 of non palindromes returns false")
    @ParameterizedTest
    @ValueSource(strings = {"rotation", "treasure", "I am not a palindrome.", "Boot"})
    void method_2False(String str) {
        String expected = str + " is not a palindrome.";
        String result = new PalindromeChecker().method_1(str);

        assertEquals(expected, result);
    }

    @DisplayName("Check if input for method 3 of palindromes returns true")
    @ParameterizedTest
    @ValueSource(strings = {"kayak", "deified", "Do geese see God?", "Mr. Owl ate my metal worm"})
    void method_3True(String str) {
        String expected = str + " is a palindrome.";
        String result = new PalindromeChecker().method_3(str);

        assertEquals(expected, result);
    }

    @DisplayName("Check if input for method 3 of palindromes returns false")
    @ParameterizedTest
    @ValueSource(strings = {"rotation", "treasure", "I am not a palindrome.", "Boot"})
    void method_3False(String str) {
        String expected = str + " is not a palindrome.";
        String result = new PalindromeChecker().method_1(str);

        assertEquals(expected, result);
    }

    @DisplayName("Check if string array input for method 1 of palindromes returns proper answers")
    @Test
    void method_1Arr() {
        String[] input = {"kayak", "rotation", "Do geese see God?", "I am not a palindrome.", "Mr. Owl ate my metal worm"};
        String expected = "kayak is a palindrome.\nrotation is not a palindrome.\nDo geese see God? is a palindrome.\n" +
                "I am not a palindrome. is not a palindrome.\nMr. Owl ate my metal worm is a palindrome.\n";
        String result = new PalindromeChecker().method_1(input);

        assertEquals(expected, result);
    }

    @DisplayName("Check if string array input for method 2 of palindromes returns proper answers")
    @Test
    void method_2Arr() {
        String[] input = {"kayak", "rotation", "Do geese see God?", "I am not a palindrome.", "Mr. Owl ate my metal worm"};
        String expected = "kayak is a palindrome.\nrotation is not a palindrome.\nDo geese see God? is a palindrome.\n" +
                "I am not a palindrome. is not a palindrome.\nMr. Owl ate my metal worm is a palindrome.\n";
        String result = new PalindromeChecker().method_2(input);

        assertEquals(expected, result);
    }

    @DisplayName("Check if string array input for method 1 of palindromes returns proper answers")
    @Test
    void method_3Arr() {
        String[] input = {"kayak", "rotation", "Do geese see God?", "I am not a palindrome.", "Mr. Owl ate my metal worm"};
        String expected = "kayak is a palindrome.\nrotation is not a palindrome.\nDo geese see God? is a palindrome.\n" +
                "I am not a palindrome. is not a palindrome.\nMr. Owl ate my metal worm is a palindrome.\n";
        String result = new PalindromeChecker().method_3(input);

        assertEquals(expected, result);
    }
}