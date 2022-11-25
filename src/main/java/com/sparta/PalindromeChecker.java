package com.sparta;

public class PalindromeChecker {
    private boolean palindromeCheck(String str, String rev) {
        return str.equalsIgnoreCase(rev.toLowerCase());
    }

    public boolean method_1(String str) {
        String workingStr = str.replaceAll("[^a-zA-Z0-9]", "");
        String reverse = "";

        for(int i = workingStr.length() - 1; i >= 0; i--) {
            reverse += workingStr.charAt(i);
        }
        return palindromeCheck(workingStr, reverse);
    }

    public boolean method_2(String str) {
        String workingStr = str.replaceAll("[^a-zA-Z0-9]", "");
        String reverse = "";

        int i = workingStr.length() - 1;

        while(i >= 0) {
            reverse += workingStr.charAt(i);
            i--;
        }
        return palindromeCheck(workingStr, reverse);
    }
}
