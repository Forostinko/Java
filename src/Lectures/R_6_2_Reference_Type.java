package Lectures;

import java.util.Arrays;

public class R_6_2_Reference_Type {
    public static void main(String[] args) {

        int[] arr1 = new int[] {1, 2, 3};
        System.out.println("arr1 = " + Arrays.toString(arr1));

        int[] arr2 = new int[] {4, 5, 6};
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
