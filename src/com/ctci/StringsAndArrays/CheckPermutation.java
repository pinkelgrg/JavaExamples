package com.ctci.StringsAndArrays;

/**
 * Created by Pinkel Gurung on 6/4/17.
 */
public class CheckPermutation {

    public static void main(String[] args) {

        String testString1 = "dog";
        String testString2 = "god";

        System.out.println(isPermutation(testString1, testString2));

    }

    private static boolean isPermutation(String str1, String str2) {

        return str1.trim().length() == str2.trim().length() && sortStr(str1).equals(sortStr(str2));
    }

    private static String sortStr(String str) {

        char[] myCharArr = str.toCharArray();

        java.util.Arrays.sort(myCharArr);

        return new String(myCharArr);

    }
}