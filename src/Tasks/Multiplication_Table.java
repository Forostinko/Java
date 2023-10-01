package Tasks;
//Вывести число от 1 до 10. Вывести таблицу умножения от 1 до 10 для этих чисел
public class Multiplication_Table {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= 10; i ++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
