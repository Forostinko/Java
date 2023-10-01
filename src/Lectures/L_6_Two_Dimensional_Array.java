package Lectures;

// ===== Two-dimensional array (двумерный массив) ===================
// это массив массивов, то есть в каждой его ячейке находится ссылка на некий массив.
// or
// =====  Torn array  (рванный массив)  =============================

//public class Lecture6_Methods {
//    public static void main(String[] args) {
//        int[][] arr1 ={
//                {1, 2, 3},
//                {11, 22, 33},
//                {111, 222, 333, 444, 555},
//                {111, 333},
//                {111},
//        };
//        System.out.println( arr1[2][4] );
//    }
//}

// === ===
//public class Lecture6_Methods {
//    public static void main(String[] args) {
//        int[][] arr1 ={
//                {1, 2, 3},
//                {11, 22, 33},
//                {111, 222, 333, 444, 555},
//                {111, 333},
//                {111},
//        };
//
//        for ( int i = 0; i < arr1.length; i++) {
//            for ( int j = 0; j < arr1[i].length; j++) {
//                System.out.println( arr1[i][j] );
//                System.out.println(",");
//            }
//            System.out.println();
//        }
//    }
//}

// === max ===
public class L_6_Two_Dimensional_Array {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {11, 22, 33},
                {111, 222, 333, 444, 555},
                {111, 333},
                {111},
        };

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] > max) {
                    max = arr1[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
