package com.Java_master_class.reverse;

import java.sql.SQLOutput;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arry = sc.nextLine();

        char[] charArray = arry.toCharArray();

        String[] elements = new String[charArray.length];
        for(int i=0; i < charArray.length; i++){
            elements[i] = String.valueOf(charArray[i]);
        }

        for(String element : elements){
            System.out.print(element);
        }

        int length = elements.length;
        switch (length) {
            case 3 -> {
                //level 1
                String arry2 = elements[length - 1] + elements[0] + elements[length - 2];
                String[] elements2 = Reverse(arry2);
                System.out.println("\n"+arry2);

                //level 2
            int length2 = elements2.length;
            String arry3 =  elements2[length2 - 1] + elements2[0] + elements2[length2 - 2];
            System.out.println(arry3);

            //level 3
            String[] elements3 = Reverse(arry3);
            int length3 = elements3.length;
            System.out.println(elements3[length3 - 1] + elements3[0] + elements3[length3 - 2]);
            }


            case 4 -> {
                //level 1
                String array1 = elements[length - 1] + elements[0] + elements[length - 2]+elements[1];
                System.out.println("\n"+array1);

                //level 2
                String[] elements2 = Reverse(array1);
                int length2 = elements2.length;
                String array2 =  elements2[length2 - 1] + elements2[0] + elements2[length2 - 2]+elements2[1];
                System.out.println(array2);

                //level 3
                String[] elements3 = Reverse(array2);
                int length3 = elements3.length;
                String array3 = elements3[length3 - 1] + elements3[0] + elements3[length3 - 2]+elements3[1];
                System.out.println(array3);

                }
            case 5 -> {
                // System.out.println("\n" + elements[length - 1] + elements[0] + elements[length - 2] + elements[1] +elements[length - 3]);
                //level 1
                String array1 = elements[length - 1] + elements[0] + elements[length - 2]+elements[1]+elements[length - 3];
                System.out.println("\n"+array1);

                //level 2
                String[] elements2 = Reverse(array1);
                int length2 = elements2.length;
                String array2 =  elements2[length2 - 1] + elements2[0] + elements2[length2 - 2]+elements2[1]+elements2[length2 - 3];
                System.out.println(array2);

                //level 3
                String[] elements3 = Reverse(array2);
                int length3 = elements3.length;
                String array3 = elements3[length3 - 1] + elements3[0] + elements3[length3 - 2]+elements3[1]+elements3[length3 - 3];
                System.out.println(array3);

                //leve 4
                String[] elements4 = Reverse(array3);
                int length4 = elements4.length;
                String array4 = elements4[length4 - 1] + elements4[0] + elements4[length4 - 2] + elements4[1]+elements4[length4 - 3];
                System.out.println(array4);

                //leve 5
                String[] elements5 = Reverse(array4);
                int length5 = elements5.length;
                System.out.println(elements5[length5 - 1] + elements5[0] + elements5[length5 - 2] + elements5[1]+elements5[length5 - 3]);
            }
            case 6 -> {
             //   System.out.println("\n" + elements[length - 1] + elements[0] + elements[length - 2] + elements[1] + elements[length - 3] + elements[2]);
                //level 1
                String array1 = elements[length - 1] + elements[0] + elements[length - 2]+elements[1]+elements[length - 3]+ elements[2];
                System.out.println("\n"+array1);

                //level 2
                String[] elements2 = Reverse(array1);
                int length2 = elements2.length;
                String array2 =  elements2[length2 - 1] + elements2[0] + elements2[length2 - 2]+elements2[1]+elements2[length2 - 3]+ elements2[2];
                System.out.println(array2);

                //level 3
                String[] elements3 = Reverse(array2);
                int length3 = elements3.length;
                String array3 = elements3[length3 - 1] + elements3[0] + elements3[length3 - 2]+elements3[1]+elements3[length3 - 3]+ elements3[2];
                System.out.println(array3);

                //leve 4
                String[] elements4 = Reverse(array3);
                int length4 = elements4.length;
                String array4 = elements4[length4 - 1] + elements4[0] + elements4[length4 - 2] + elements4[1]+elements4[length4 - 3]+ elements4[2];
                System.out.println(array4);

                //leve 5
                String[] elements5 = Reverse(array4);
                int length5 = elements5.length;
                String array5 = elements5[length5 - 1] + elements5[0] + elements5[length5 - 2] + elements5[1]+elements5[length5 - 3]+ elements5[2];
                System.out.println(array5);
                //level 6
                String[] elements6 = Reverse(array5);
                int length6 = elements6.length;
                System.out.println(elements6[length5 - 1] + elements6[0] + elements6[length6 - 2] + elements6[1]+elements6[length6 - 3]+ elements6[2]);
            }
            case 7 -> {
             //   System.out.println("\n" + elements[length - 1] + elements[0] + elements[length - 2] + elements[1] + elements[length - 3] + elements[2] + elements[length - 4]);
                //level 1
                String array1 = elements[length - 1] + elements[0] + elements[length - 2]+elements[1]+elements[length - 3]+ elements[2] + elements[length - 4];
                System.out.println("\n"+array1);

                //level 2
                String[] elements2 = Reverse(array1);
                int length2 = elements2.length;
                String array2 =  elements2[length2 - 1] + elements2[0] + elements2[length2 - 2]+elements2[1]+elements2[length2 - 3]+ elements2[2] + elements2[length2 - 4];
                System.out.println(array2);

                //level 3
                String[] elements3 = Reverse(array2);
                int length3 = elements3.length;
                String array3 = elements3[length3 - 1] + elements3[0] + elements3[length3 - 2]+elements3[1]+elements3[length3 - 3]+ elements3[2] + elements3[length3 - 4];
                System.out.println(array3);

                //leve 4
                String[] elements4 = Reverse(array3);
                int length4 = elements4.length;
                String array4 = elements4[length4 - 1] + elements4[0] + elements4[length4 - 2] + elements4[1]+elements4[length4 - 3]+ elements4[2] + elements4[length4 - 4];
                System.out.println(array4);

                //leve 5
//                String[] elements5 = Reverse(array4);
//                int length5 = elements5.length;
//                String array5 = elements5[length5 - 1] + elements5[0] + elements5[length5 - 2] + elements5[1]+elements5[length5 - 3]+ elements5[2] + elements5[length5 - 4];
//                System.out.println(array5);
//
//                //level 6
//                String[] elements6 = Reverse(array5);
//                int length6 = elements6.length;
//                System.out.println(elements6[length5 - 1] + elements6[0] + elements6[length6 - 2] + elements6[1]+elements6[length6 - 3]+ elements6[2] + elements6[length6 - 4]);
            }
        }
    }

    public static String[] Reverse(String array){
        char[] charArray = array.toCharArray();

        String[] elements = new String[charArray.length];
        for(int i=0; i < charArray.length; i++){
            elements[i] = String.valueOf(charArray[i]);
        }
        return elements;
    }
}
