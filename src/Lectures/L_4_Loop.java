package Lectures;//public class Lecture4_Loop {
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i = i + 1) {
//            System.out.println("Hello");
//        }
//    }
//}

public class L_4_Loop {
    public static void main(String[] args) {
        int i = 0;
        for (; i < 5; i = i + 1) {
            System.out.println("i");
            System.out.println("Hello");
        }
        System.out.println("Final value of i = ");
        System.out.println(i);
    }
}
