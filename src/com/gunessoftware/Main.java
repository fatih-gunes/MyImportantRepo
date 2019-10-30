package com.gunessoftware;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String str = "hi there";


        System.out.println(reverseString(str));

    }

    private static String reverseString(String s) {
        char[] chars = s.toCharArray();

        char[] returnChars = new char[chars.length];
        int returnIndex = 0;
        for (int i = chars.length-1; i >= 0; i--) {
            returnChars[returnIndex] = chars[i];
            returnIndex++;
        }
        return new String(returnChars);
    }
}
