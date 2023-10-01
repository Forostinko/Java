package HW;
//Необходимо написать 4 метода:
//сложение 2х чисел
//вычитание 2х чисел
//умножение 2х чисел
//деление 2х чисел

public class HW_6_Methods {
    public static int sum (int a, int b) {
        return a + b;
    }

    public static int minus (int a, int b) {
        return a - b;
    }

    public static int mul (int a, int b) {
        return a * b;
    }

    public static double dev (int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 5));
        System.out.println(minus(25, 10));
        System.out.println(mul(5, 3));
        System.out.println(dev(60, 4));

    }
}
