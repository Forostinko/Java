package Codewars;
//https://www.codewars.com/kata/570e8ec4127ad143660001fd/train/java
public class L6 {
//    public static int billboard(String name, int price) {
//        int result = 0;
//        for ( int i = 0; i < name.length(); i++) {
//            result += price;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(billboard("sergey", 15));
//
//    }

    //https://www.codewars.com/kata/57241e0f440cd279b5000829/train/java
        public static long sumMul(int n, int m) {
            long result = 0;
            for ( int i = 0; i < m; i+= n) {
                result += i;
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(sumMul(3, 13));
        }
    }

