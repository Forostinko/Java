package HW;//Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор
//и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление и остаток от деления.
//Также сделать проверку на четность этих переменных и вывести результат.

public class HW_2_Task1 {
    public static void main(String[] args) {
        int a = 1000;
        int b = 14;

        System.out.print("a + b = ");
        System.out.println(a + b);

        System.out.print("a - b = ");
        System.out.println(a - b);

        System.out.print("a * b = ");
        System.out.println(a * b);

        System.out.print(a / b);
        System.out.println(a % b);
        System.out.print("a / b = ");
        System.out.println(a * 1.0 / b);

//        proverit' na chetnost'
        System.out.print(a % 2);
        System.out.print("a - even number?");
        System.out.print(a % 2 == 0);

    }
}
