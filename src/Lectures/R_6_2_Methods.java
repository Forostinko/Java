package Lectures;

public class R_6_2_Methods {
//    static void sumOld(int first, int second) {     //Math function f(f, y) = x + y  where y = ѵ 3 * 3 and x = 1
//        int sum = first + second;
//        System.out.println("sum = " + sum);
//    }
//
//    static int sum(int first, int second) {
//        return first + second;
//    }
//
//    public static void main(String[] args) {
//        sum (1, 2 + 2);
////        sum (1, (int)Math.sqrt(9));
////        sum (1, (int)Math.sqrt(3 * 3));      // f(x, y) = x + y        1 = ѵ 3 * 3
////        sum (1, (int)Math.sqrt(3 * 3), 0);
//
//        System.out.println("sum = " + sum(1, (int)Math.sqrt(3 * 3)));


    public static void main(String[] args) {
        System.out.println("max value is " + max(new int[] {1, 3, 5, 66, 78, 777}));
    }

    static int max (int[] arr) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(result < arr[i]) {
                result = arr[i];
            }
        }
        return result;
    }

}
