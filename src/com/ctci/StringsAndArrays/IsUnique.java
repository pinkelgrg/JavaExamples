package com.ctci.StringsAndArrays;

/**
 * Created by Pinkel Gurung on 6/4/17.
 */
public class IsUnique {
    public static void main(String[] args) {

        String testString = "abcd";
        System.out.println(hasUniqueChars(testString));

    }
    private static boolean hasUniqueChars(String testString) {

        boolean[] array = new boolean[128];
        if (testString.length()>128) {
            return false;
        }

        for( int i=0; i<testString.length(); i++ ){
            int char_val = testString.charAt(i);
            if(array[char_val]){
                return false;
            }
            array[char_val]=true;
        }
        return true;

    }
}
