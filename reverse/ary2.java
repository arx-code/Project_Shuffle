package com.Java_master_class.reverse;

import java.util.Arrays;

public class ary2 {
    public static void main(String[] args) {

        String input = "123";

        //converting String into array
        char[] charArray = input.toCharArray();

        String[] array = new String[charArray.length];

        for(int i=0; i < charArray.length; i++){
            array[i] = String.valueOf(charArray[i]);
        }

        //divide into two
        int divideIndex = array.length/2;
        // Create two new arrays for the divided parts
        String[] firstPart = new String[divideIndex];
        String[] secondPart = new String[array.length - divideIndex];
        // Copy elements to the first part
        for (int i = 0; i < divideIndex; i++) {
            firstPart[i] = array[i];
        }

        // Copy elements to the second part
        for (int i = divideIndex; i < array.length; i++) {
            secondPart[i - divideIndex] = array[i];
        }

        //getting element
        System.out.println("\n1st "+ Arrays.toString(firstPart));
        System.out.println("\n2st "+Arrays.toString(secondPart));
        System.out.println(gettingLast(secondPart)+gettingFirst(firstPart));



    }
    public static String gettingLast(String[] array) {
        String out = null;
        for (int i = array.length - 1; i >= 0; i--) {
            out=(array[i]);
        }
        return out ;
    }
        public static String gettingFirst(String[] array) {
        String outF=null;
            for (int j = 0; j < array.length; j++) {
                outF=(array[j]);
            }
            return outF;
        }
}
