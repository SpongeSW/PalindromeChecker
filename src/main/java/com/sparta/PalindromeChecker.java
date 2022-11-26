package com.sparta;

public class PalindromeChecker {
    private boolean palindromeCheck(String str, String rev) {
        return str.equalsIgnoreCase(rev.toLowerCase());
    }

    public String method_1(String str) {
        String workingStr = str.replaceAll("[^a-zA-Z0-9]", "");
        String reverse = "";

        for(int i = workingStr.length() - 1; i >= 0; i--) {
            reverse += workingStr.charAt(i);
        }
        if(palindromeCheck(workingStr, reverse)){
            return str + " is a palindrome.";
        } else {
            return str + " is not a palindrome.";
        }
    }

    public String method_1(String[] str) {
        String result = "";
        for(String word : str) {
            result += method_1(word) + "\n";
        }
        return result;
    }

    public String method_2(String str) {
        String workingStr = str.replaceAll("[^a-zA-Z0-9]", "");
        String reverse = "";

        int i = workingStr.length() - 1;

        while(i >= 0) {
            reverse += workingStr.charAt(i);
            i--;
        }
        if(palindromeCheck(workingStr, reverse)){
            return str + " is a palindrome.";
        } else {
            return str + " is not a palindrome.";
        }
    }

    public String method_2(String[] str) {
        String result = "";
        for(String word : str) {
            result += method_1(word) + "\n";
        }
        return result;
    }

    public String method_3(String str) {
        String workingStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int startPoint = 0;
        int endPoint = workingStr.length() - 1;
        int halfPoint = endPoint / 2;

        boolean result = true;

        //racecar
        while(endPoint >= halfPoint && result) {
            startPoint++;
            endPoint--;

            if (workingStr.charAt(endPoint) != workingStr.charAt(startPoint)) {
                result = false;
            }
        }
        if(result) {
            return str + " is a palindrome.";
        } else {
            return str + " is not a palindrome.";
        }
    }

    public String method_3(String[] str) {
        String result = "";
        for(String word : str) {
            result += method_1(word) + "\n";
        }
        return result;
    }
}
