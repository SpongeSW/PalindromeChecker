package com.sparta;

public class Starter {
    public static void start() {
        //  code goes here
        String testString = "Do geese see God?";
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String[] strArr = {"hello", "boot", "yes?", "non?"};

        System.out.println(palindromeChecker.method_1(strArr));

        System.out.println(palindromeChecker.method_1(testString));
        System.out.println(palindromeChecker.method_2(testString));
        System.out.println(palindromeChecker.method_3(testString));
    }
}
