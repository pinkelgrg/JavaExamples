package com.ctci.StringsAndArrays;

/**
 * Created by Pinkel Gurung on 6/4/17.
 */
public class OneAway {
    public static void main(String[] args) {
        final String str1 = "ables";
        final String str2 = "bles";

        System.out.println(isOneAway(str1, str2));


    }
    private static boolean isOneAway (String firstString, String secondString) {
        boolean diffFound = false;
        if (Math.abs(firstString.length()-secondString.length()) >1) {
            return false;
        }

        String s1 = firstString.length() > secondString.length() ? firstString : secondString;
        String s2 = firstString.length() > secondString.length() ? secondString : firstString;

        int index1 = 0;
        int index2 = 0;

        while (index1 < s1.length() &&  index2 < s2.length()) {

            if( s1.charAt(index1) != s2.charAt(index2)) {

                if (diffFound){
                    return false;
                }else{
                    diffFound = true;
                    if( s1.length() == s2.length()) {
                        index2++;
                    }
                }
            }else{
                index2++;
            }
            index1++;
        }
        return true;
    }
}
