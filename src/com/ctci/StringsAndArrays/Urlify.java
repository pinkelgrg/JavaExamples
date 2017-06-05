package com.ctci.StringsAndArrays;

/**
 * Created by Pinkel Gurung on 6/4/17.
 */
public class Urlify {
    public static void main (String[] args) {

        //Input : "Mr John Smith    ",13
        String testString = "Mr John Smith    ";
        int trueLength = 13;
        System.out.println(encodeString(testString.toCharArray(), trueLength));

    }

    private static String encodeString(char[] str, int trueLength){
        //count the number of spaces.
        int spaces = getNumberOfSpaces(str, trueLength);

        int lenWithSpaces=trueLength + (spaces * 2);
        int index = trueLength-1;
        for( int i = lenWithSpaces-1; i>=0; i--) {

            if (str[index] == ' '){
                str[i] = '0';
                str[i-1]= '2';
                str[i-2]= '%';
                i-=2;
            }else{
                str[i] = str[index];
            }
            index--;

        }


        return new String(str);
    }

    private static int getNumberOfSpaces(char[] str, int trueLength) {

        int spaces = 0;

        for (int i=0; i<trueLength; i++) {
            if (str[i]==' ') {
                spaces++;
            }
        }
        return spaces;
    }
}
