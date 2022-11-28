package com.sparta;

public class InputChecker {
    public static boolean inputIsValid(String str) {
        if(str == null || str.length() < 1) {
            return false;
        }
        return true;
    }

    public static boolean inputIsValid(String[] str) {
        if(str == null || str.length < 0) {
            return false;
        }
        return true;
    }
}
