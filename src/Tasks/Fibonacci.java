package Tasks;

import java.util.Scanner;
//Lecture 7.1
//Вывести  на экран 7 чисел  Фибоначи
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");

        Scanner sc = new Scanner(System.in);   //Подключение библиотеки для консоли
        int n = sc.nextInt();

//        int n = 7;
//        int n = 17;

        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("first " + n + " number fibonacci: ");

        for (int num: fibonacci) {
            System.out.println(num);
//            System.out.print(num +" ");  // for  int n = 17;
//            println - in string
//            print - in a column
        }
    }
}
