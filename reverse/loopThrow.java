package com.Java_master_class.reverse;

import java.util.Scanner;

public class loopThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String array = sc.nextLine();

        char[] charArray = array.toCharArray();

        String[] elements = new String[charArray.length];

        for(int i=0; i < charArray.length; i++){
            elements[i] = String.valueOf(charArray[i]);
        }

        for(String element : elements){
            System.out.print(element+" ");
        }
        System.out.println();

        for (int i = 0; i< elements.length; i++){
            System.out.print(elements[i]);
            System.out.println();
            for (int j = elements.length - 1; j >= 0; j--) {
                System.out.print(elements[j] + " ");
            }
        }

        int[] ary = {1,2,3,5,6};
        System.out.println(concatenateArray(ary));
    }
    public static String concatenateArray(int[] array) {
        StringBuilder result = new StringBuilder();

        // Concatenate the elements in a specific order
        for (int i = 5; i >= 0; i--) {
            result.append(array[i]);
        }

        return result.toString();
    }
}
