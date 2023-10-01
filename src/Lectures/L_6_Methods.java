package Lectures;
// Method has: name, parametrs, return value
public class L_6_Methods {
//    public static void printText(String text) {
//        System.out.println(text);
//    }
//
//    public static void main(String[] args) {
//
//        String s = "sergey";
//        //int index = s.indexOf('g');
//        //                ^       ^
//        //                |       |
//        //             method   parametr (argument)
//
//        printText(s);
//
////        System.out.println(index);
//    }

    // method int use when need return
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = sum(x, y);

        System.out.println(z);
//        System.out.println(sum(10, 20));
    }
}

