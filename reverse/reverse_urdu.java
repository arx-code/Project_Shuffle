package com.Java_master_class.reverse;

import java.util.Scanner;

public class reverse_urdu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arry = sc.nextLine();

        char[] charArray = arry.toCharArray();

        String[] elements = new String[charArray.length];
        for(int i=0; i < charArray.length; i++){
            elements[i] = String.valueOf(charArray[i]);
        }

        for(String element : elements){
            System.out.print(element+" ");
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
            }
            case 8 -> {
                //level 1
                String array1 = elements[length - 1] + elements[0] + elements[length - 2]+elements[1]+elements[length - 3]+ elements[2]+ elements[length-4] + elements[3];
                System.out.println("\n"+array1);

                //level 2
                String[] elements2 = Reverse(array1);
                int length2 = elements2.length;
                String array2 =  elements2[length2 - 1] + elements2[0] + elements2[length2 - 2]+elements2[1]+elements2[length2 - 3]+ elements2[2]+ elements2[length2-4] + elements2[3];
                System.out.println(array2);

                //level 3
                String[] elements3 = Reverse(array2);
                int length3 = elements3.length;
                String array3 = elements3[length3 - 1] + elements3[0] + elements3[length3 - 2]+elements3[1]+elements3[length3 - 3]+ elements3[2]+ elements3[length3-4] + elements3[3];
                System.out.println(array3);

                //leve 4
                String[] elements4 = Reverse(array3);
                int length4 = elements4.length;
                String array4 = elements4[length4 - 1] + elements4[0] + elements4[length4 - 2] + elements4[1]+elements4[length4 - 3]+ elements4[2]+ elements4[length4-4] + elements4[3];
                System.out.println(array4);

                //leve 5
//                String[] elements5 = Reverse(array4);
//                int length5 = elements5.length;
//                String array5 = elements5[length5 - 1] + elements5[0] + elements5[length5 - 2] + elements5[1]+elements5[length5 - 3]+ elements5[2]+ elements5[length5-4] + elements5[3];
//                System.out.println(array5);
                //level 6
//                String[] elements6 = Reverse(array5);
//                int length6 = elements6.length;
//                System.out.println(elements6[length5 - 1] + elements6[0] + elements6[length6 - 2] + elements6[1]+elements6[length6 - 3]+ elements6[2]+ elements6[length6-4] + elements6[3]);
            }
            case 9 -> {
                //level 1
                String array1 = elements[length - 1] + elements[0] + elements[length - 2]+elements[1]+elements[length - 3]+ elements[2]+ elements[length-4] + elements[3]+elements[length-5];
                System.out.println("\n"+array1);

                //level 2
                String[] elements2 = Reverse(array1);
                int length2 = elements2.length;
                String array2 =  elements2[length2 - 1] + elements2[0] + elements2[length2 - 2]+elements2[1]+elements2[length2 - 3]+ elements2[2]+ elements2[length2-4] + elements2[3]+elements2[length2-5];
                System.out.println(array2);

                //level 3
                String[] elements3 = Reverse(array2);
                int length3 = elements3.length;
                String array3 = elements3[length3 - 1] + elements3[0] + elements3[length3 - 2]+elements3[1]+elements3[length3 - 3]+ elements3[2]+ elements3[length3-4] + elements3[3]+elements3[length3-5];
                System.out.println(array3);

                //leve 4
                String[] elements4 = Reverse(array3);
                int length4 = elements4.length;
                String array4 = elements4[length4 - 1] + elements4[0] + elements4[length4 - 2] + elements4[1]+elements4[length4 - 3]+ elements4[2]+ elements4[length4-4] + elements4[3]+elements4[length4-5];
                System.out.println(array4);

                //leve 5
                String[] elements5 = Reverse(array4);
                int length5 = elements5.length;
                String array5 = elements5[length5 - 1] + elements5[0] + elements5[length5 - 2] + elements5[1]+elements5[length5 - 3]+ elements5[2]+ elements5[length5-4] + elements5[3]+elements5[length5-5];
                System.out.println(array5);
                //level 6
                String[] elements6 = Reverse(array5);
                int length6 = elements6.length;
                String array6 = elements6[length5 - 1] + elements6[0] + elements6[length6 - 2] + elements6[1]+elements6[length6 - 3]+ elements6[2]+ elements6[length6-4] + elements6[3]+elements6[length6-5];
                System.out.println(array6);
                //level 7
                String[] elements7 = Reverse(array6);
                int length7 = elements7.length;
                String array7 =elements7[length7 - 1] + elements7[0] + elements7[length7 - 2] + elements7[1]+elements7[length7 - 3]+ elements7[2]+ elements7[length7-4] + elements7[3]+elements7[length7-5];
                System.out.println(array7);
                //level 8
                String[] elements8 = Reverse(array7);
                int length8 = elements8.length;
                String array8 = elements8[length8 - 1] + elements8[0] + elements8[length8 - 2] + elements8[1]+elements8[length8 - 3]+ elements8[2]+ elements8[length8-4] + elements8[3]+elements8[length8-5];
                System.out.println(array8);
                //level 9
                String[] elements9 = Reverse(array8);
                int length9 = elements9.length;
                String array9 =elements9[length9 - 1] + elements9[0] + elements9[length9 - 2] + elements9[1]+elements9[length9 - 3]+ elements9[2]+ elements9[length9-4] + elements9[3]+elements9[length9-5];
                System.out.println(array9);
            }
            default -> {
                System.out.println("More than 9");
            }
        }
//        //level 1
//        String array1 = elements[length - 1] + elements[0] + elements[length - 2]+elements[1]+elements[length - 3]+ elements[2]+ elements[length-4] + elements[3]+elements[length-5];
//        System.out.println("\n"+array1);
//
//        System.out.println("experimental");
//        for(int i=0; i<elements.length; i++){
//            System.out.println(elements[i]);
//        }

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
