import java.util.Arrays;

public class Special_Characters {
    public static void main (String[] args) {

        // Special characters and escape sequence

//        System.out.println("back slash:\\---\\");
//        System.out.println("new line:\n---");
//        System.out.println("tab:t---");
//        System.out.println("return to start of the line:\r---");
//        System.out.println("double quotes:\"---");
//        System.out.println("\n\n");


// boolean      true/false
// 2 > 1     2 > 2     2 > 3
// 2 >= 1    2 >= 2    2 >= 3
// 2 == 1    2 == 2    2 == 3
// 2 != 1    2 != 2    2 != 3
// 2 < 1     2 < 2     2 < 3
// 2 <= 1    2 <= 2    2 <= 3

//boolean booleanResult1 = 5 < 3;       //false
//System.out.print("booleanResult1: ");
//System.out.println(booleanResult1);

// Unary operator
//System.out.println("!false  is ");      System.out.println(!false);
//System.out.println("!true  is ");       System.out.println(!true);

//System.out.println("false && false is ");        System.out.println(false && false);    //false
//System.out.println("false && true  is ");        System.out.println(false && true);     //false
//System.out.println("true  && false is ");        System.out.println(true && false);     //false
//System.out.println("true  && true  is ");        System.out.println(true && true);      //true

//        System.out.println("\n");
//        System.out.println("false || false is ");        System.out.println(false || false);   //false
//        System.out.println("false || true  is ");        System.out.println(false || true);    //tru
//        System.out.println("true  || false is ");        System.out.println(true || false);    //true
//        System.out.println("true  || true  is ");        System.out.println(true || true);     //true
//
//        boolean booleanResult2 = 3 < 2 && false;
//        System.out.println(booleanResult1 && booleanResult2);


//        int number = 2;
////        if (number % 2 == 0) {
//////            System.out.println(number * number);
////            System.out.println("number " + number + " is even");
////        } else {
//////            System.out.println(number * number *number);
////            System.out.println("number " + number + " is odd");
////        }
//
//        //or the same
//        System.out.print("number " + number);
//        if (number % 2 == 0) {
//            System.out.println(" is even");
//        } else {
//            System.out.println(" is odd");
//        }
//
//        System.out.print("number " + number + "delitsa na 3");
//        if (number % 2 == 0) {
//            System.out.println(" bez ostatka");
//        } else {
//            System.out.println(" s ostatkom" + (number % 3));
//        }


//        int[] variable1 = {4, 5, 6, 2};
//        System.out.println(Arrays.toString(variable1));
//
//        for (int i = ' '; i < 255; i++) {
//            System.out.println(i + " " + (char) i);
//        }


        // max
        int[] variable1 = {4, 5, 6, 2};
        System.out.println(Arrays.toString(variable1));

        int max = variable1[0];

        for (int i = 1; i < variable1.length; i++) {
            if (max < variable1[i]) {
                max = variable1[i];
            }
        }
        System.out.println("max valiu is " + max);

        //or the same
        System.out.println(Arrays.toString(variable1));
        max = Integer.MIN_VALUE;
        for (int i = 1; i < variable1.length; i++) {
            if (max < variable1[i]) {
                max = variable1[i];
            }
        }
        System.out.println("max valiu is " + max);


    }
}
