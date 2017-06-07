package com.ctci.StringsAndArrays;

/**
 * Created by Pinkel Gurung on 6/4/17.
 */
public class StringCompression {


    public static void main (String[] args) {

        String testString = "aaabbbcccd";
        System.out.println(compressString(testString));

    }

    private static String compressString( String str ){

        StringBuilder compressedString = new StringBuilder();
        int repeatCount = 0;

        for ( int i = 0; i < str.length(); i++ ) {
            repeatCount++;

            if( i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){

                compressedString.append(str.charAt(i));
                compressedString.append(repeatCount);
                repeatCount=0;

            }
        }
        return compressedString.length()< str.length() ? compressedString.toString():str;
    }
}
