package Codewars;
//1) https://www.codewars.com/kata/555086d53eac039a2a000083/solutions/java
public class HW_6 {
//        public static boolean isLove(final int flower1, final int flower2) {
//            return flower1 % 2 != flower2 % 2;
//        }

    //2) https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java

//    public static void main(String[] args) {
//        int a = 10;
//        String s = String.valueOf(a);
//        System.out.println(s);
//    }

    //3) https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java

//    public static int findSmallestInt(int[] args) {
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < args.length; i++) {
//            if (min > args[i]) {
//                min = args[i];
//            }
//        }
//        return min;
//    }

    //4) https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java

    public static String countingSheep(int num) {
        //"1 sheep...2 sheep...3 sheep..."

        String result = "";
        for (int i = 1; i <= num; i++) {
            result += i + " sheep...";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }

}


