package com.ctci.StringsAndArrays;

/**
 * Created by Pinkel Gurung on 6/4/17.
 */
public class isPalindrome {
    public static void main(String[] args){


        String testString = "No lemon, no melon";

        isPalindrome_UseBitVector(testString);
        isPalindrome_UseOddCount(testString);

    }

    private static void isPalindrome_UseOddCount(String testString){

        int oddCount = 0;

        int []table = new int[getCharNumber('z') - getCharNumber('a') + 1];

        for( Character c: testString.toCharArray()) {

            int x = getCharNumber(c);
            if( x != -1) {
                table[x]++;
                if ( table[x] % 2 == 0) {
                    oddCount--;
                }else{
                    oddCount++;
                }
            }
        }
        if( oddCount < 2 ){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }

    private static void isPalindrome_UseBitVector(String testString){
        int bitVector = 0;
        for(Character c: testString.toCharArray()){
            bitVector = toggle(bitVector, getCharNumber(c));
        }
        System.out.println(bitVector);
        System.out.println((bitVector & (bitVector-1)) == 0);

    }

    private static int getCharNumber(Character c) {

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if (val >= a && val <=z) {
            return val - a;
        }
        return -1;

    }

    private static int toggle (int bitVector, int index) {

        if( index < 0 ) return  bitVector;
        int mask = 1 << index;
        if ((bitVector &  mask)== 0) {
            bitVector |= mask;
        }else {
            bitVector &= ~mask;
        }
        return bitVector;
    }
}
