package com.sparta;

public class Starter {
    public static void start() {
        //  code goes here
        String testString = "racecar RaceCar raceCar";
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        System.out.println(palindromeChecker.method_1(testString));
        System.out.println(palindromeChecker.method_2(testString));
    }
}
