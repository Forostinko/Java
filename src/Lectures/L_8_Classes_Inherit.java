package Lectures;

public class L_8_Classes_Inherit {

    public static void addAndPrint(int a, int b) {
        System.out.println(a + b);
    }

    public static int add(int a, int b) {
        return  a + b;
    }

    public static void main(String[] args) {
        addAndPrint(1, 2);

        int result = add(1, 2);   //3
        result =  add(result, 3);    //6
        System.out.println(result);
    }
}
