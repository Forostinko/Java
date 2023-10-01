package HW;
//Дан массив произвольных целых чисел.
//необходимо подсчитать количество положительных и отрицательных чисел в этом массиве.

public class HW_4_Task8 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -5, -6, 7, 0, 8, 9};
        int positives = 0;
        int negatives = 0;

        for ( int i = 0; i < array.length; i++) {
            int elem = array[i];
            if (elem > 0) {
                positives++;
            } else if (elem < 0) {
                negatives++;
            }
        }
        System.out.println("positive: ");
        System.out.println(positives);
        System.out.println("negative: ");
        System.out.println(negatives);
    }
}

