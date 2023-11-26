package com.Java_master_class.reverse;

public class ary {

    public static void main(String[] args) {
        // Example array
        String[] array = {"1", "2", "3", "4", "5", "6"};

        // Convert array to a string
//        String result = concatenateArray(array);

        // Print the result
//        System.out.println(concatenateArray(array));

//        char[] charArray = result.toCharArray();

//        String[] array1 = new String[charArray.length];

//        for(int i=0; i < charArray.length; i++){
//            array1[i] = String.valueOf(charArray[i]);
//        }

//        System.out.println(concatenateArray(array1));

        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }

//    public static String concatenateArray(String[] array) {
//        StringBuilder result = new StringBuilder();
//
//        // Concatenate the elements in a specific order
//        for (int i = array.length-1; i >= 0; i--) {
//            result.append(array[i]);
//        }
//
//        return result.toString();
//    }
}
