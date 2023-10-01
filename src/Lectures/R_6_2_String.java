package Lectures;

import java.util.Arrays;

public class R_6_2_String {
    public static void main(String[] args) {

//        String str1 = "string: 123";
//        String str2 = "string: 456";
//        System.out.println("\nstr1 = " + str1);
//        System.out.println("str2 = " + str2);

//        str2 = str1;
//        System.out.println("\nstr1 = " + str1);
//        System.out.println("str2 = " + str2);
//
//        //Reference type
//        str1 = str1 + "456";
//        System.out.println("\nstr1 = " + str1);
//        System.out.println("str2 = " + str2);


        //       class(type)     value
        //            |            |
//        str2 = new String("string: 123");  // copy, different object
//        //Method equals позволяет сравнивать значения
//        System.out.println(str1.equals(str2));
////        System.out.println(str1 == str2);   //false
//        System.out.println("\nstr1 = " + str1);
//        System.out.println("str2 = " + str2);
//
//        //===== String's Method  =====
//        System.out.println("s".toUpperCase());                       // S
//        System.out.println("s".length());                            //1
//        System.out.println("sun".charAt(1));                         //u
//        System.out.println("0123456789".substring(2));     //23456789
//        System.out.println("0123456789".substring(2, 4));            //23


        // ===== Equals =====
        Integer i1 = 1234;
        Integer i2 = 1234;
        System.out.println("i2 == i1 is " + i2.equals(i1));

        int[] arr1 = new int[] {1, 2, 3};
        int[] arr2 = new int[] {1, 2, 3};
        System.out.println("arr1 == arr2 is  " + Arrays.equals(arr1, arr2));

//        Integer[][] arr1 = new Integer[][] {{1, 2, 3}, {4, 5}};
//        Integer[][] arr2 = new Integer[][] {{1, 2, 3}, {4, 5}};
//        System.out.println("arr2 = " + Arrays.deepToString(arr2));
//        System.out.println("arr1 == arr2 is  " + Arrays.deepEquals(arr1, arr2));

    }
}

