package Lectures;// =====================  ELSE IF  =========================================

//public class Lecture4 {
//    public static void main(String[] args) {
//        boolean itMoves= true;
//        boolean shouldItMove = false;
//
//        if (itMoves == shouldItMove) {
//            System.out.println("No problem");
//        } else if (itMoves) {
//            System.out.printf("Use duct tape");
//        } else {
//            System.out.println("Use WD-40");
//        }
//    }
//}

// ===================== ARRAY  ============================================

// 40 55 63 17 22 68 89 97 89
//---------------------------
//  0  1  2  3  4  5  6  7  8   <-  Array Indices
// Array length = 9
// First index = 0
// Last index = 8

//public class Lecture4_Array {
//    public static void main(String[] args) {
//
//        int[] scoreMarks = new int[] {5, 5, 5, 5, 4, 3, 2, 1, 4, 5, 5, 5};
////        System.out.println(scoreMarks[i]);
////        System.out.println(scoreMarks[5]);
//
//        for (int i = 0; i < scoreMarks.length; i = i + 1) {
//            int score = scoreMarks[i];
//            if (score < 4) {
//                scoreMarks[i] = score + 1;
//            }
//        }
//        System.out.println(Arrays.toString(scoreMarks));
//    }
//}

// ==  Sum  ==
//public class Lecture4_Array {
//    public static void main(String[] args) {
//
//        int[] scoreMarks = new int[] {5, 5, 5, 5, 4, 3, 2, 1, 4, 5, 5, 5};
//
//        int sum = 0;
//
//        for (int i = 0; i < scoreMarks.length; i = i + 1) {
//           sum = sum + scoreMarks[i];
//            }
//        System.out.println(sum);
//        // midlle score
//        System.out.println(sum / scoreMarks.length);
//        System.out.println(sum * 1.0 / scoreMarks.length);
//        }
//    }

//public class Lecture4_Array {
//   public static void main(String[] args) {
//       int n = 43;
//       int sum = 0;
//
//       for ( int i = 0; i <= n; i++) {
//           sum += i;     //sum = sum + i;
//       }
//       System.out.println(sum);
//   }
//}

//  == MIN element ==
//public class Lecture4_Array {
//    public static void main(String[] args) {
//
//        int[] scoreMarks = new int[] {5, 5, 5, 5, 4, 3, 2, 1, 4, 5, 5, 5};
//
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < scoreMarks.length; i = i + 1) {
//            int elem = scoreMarks[i];
//            if (elem < min) {
//                min = elem;
//            }
//        }
//        System.out.println(min);
//    }
//}

//  == MAX element ==
//public class Lecture4_Array {
//    public static void main(String[] args) {
//
//        int[] scoreMarks = new int[] {5, 5, 5, 5, 4, 3, 2, 1, 4, 5, 5, 5};
//
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < scoreMarks.length; i = i + 1) {
//            int elem = scoreMarks[i];
//            if (elem > max) {
//                max = elem;
//            }
//        }
//        System.out.println(max);
//    }
//}

// == get square ==
//public class Lecture4_Array {
//    public static void main(String[] args) {
//
//        int[] arr = new int[] {5, 5, 5, 5, 4, 3, 2, 1, 4, 5, 5, 5};
//        int[] results = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i = i + 1) {
//            int elem = arr[i];
//            results[i] = elem * elem;
//        }
//        System.out.println(Arrays.toString(results));
//    }
//}

// == WHILE ==
//public class Lecture4_Array {
//    public static void main(String[] args) {
//        int counter = 0;
//
//        while (counter < 5) {
//            System.out.println("I am here!");
//        counter++;
//        }
//
//        // The same!
////        for (int counter = 0; counter < 5; counter++) {
////            System.out.println("I am here!");
////        }
//    }
//}

// == DO WHILE ==
//public class Lecture4_Array {
//    public static void main(String[] args) {
//        int counter = 0;
//
//        do {
//            System.out.println("I am here!");
//            counter++;
//        } while (counter < 5);
//    }
//}

//public class Lecture4_Array {
//    public static void main(String[] args) {
//        int min = 0;
//        int max = 100;
//        int myNumber = 15;
//
//        int guess;
//        do {
//            guess = (min + max) / 2;
//            System.out.println("I am guessing!");
//            System.out.println(guess);
//
//            if (guess < myNumber) {
//                min = guess;
//            } else {
//                max = guess;
//            }
//        }while (guess != myNumber);
//    }
//}

// == same with while  ==
//public class Lecture4_Array {
//    public static void main(String[] args) {
//        int min = 0;
//        int max = 100;
//        int myNumber = 15;
//
//        int guess = (min + max) / 2;
//        System.out.println("I am guessing!");
//        System.out.println(guess);
//        while (guess != myNumber) {
//
//            if (guess < myNumber) {
//                min = guess;
//            } else {
//                max = guess;
//            }
//            guess = (min + max) / 2;
//            System.out.println("I am guessing!");
//            System.out.println(guess);
//        }
//    }
//}

// ====  FACTORIAL  (n!)======

public class L_4_Array {
  public static void main(String[] args) {
      int a = 5;

      if (a < 0) {
          System.out.println("Error");
      } else {
          int factorial = 1;
          for (int i = 0; i <= a; i++) {
              factorial *= i;
          }
          System.out.println(a + "! = " + factorial);
      }
  }
}