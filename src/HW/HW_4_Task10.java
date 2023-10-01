package HW;
//Дано положительное целое число n.
//
//        создать ряд из n чисел так, чтобы:
//        первые два элемента ряда равнялись 1
//        любой другой элемент ряда был суммой двух предыдущих.
//        Пример:
//        1, 1, 2, 3, 5, 8, …
//        Вывести получившийся ряд на экран.

import java.util.Arrays;

public class HW_4_Task10 {
    public static void main(String[] args) {
        int n = 20;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                result[i] = 1;
            } else {
                result[i] = result[i - 1] + result[i - 2];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
