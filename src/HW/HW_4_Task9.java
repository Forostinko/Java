package HW;
//Дан массив произвольных целых чисел.
//проверить, отсортирован ли он, т.е. все ли числа в массиве стоят так, что каждое следующее число больше предыдущего.

public class HW_4_Task9 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        boolean isSorted = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is NOT sorted");
        }


    }
}
