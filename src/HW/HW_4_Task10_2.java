package HW;

import java.util.Arrays;

public class HW_4_Task10_2 {
    public static void main(String[] args) {
        int n = 20;
        int prev = 0;
        int prevPrev = 0;
        int current;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                current = 1;
            } else {
                current = prev + prevPrev;
            }
            System.out.println(current);
            prevPrev = prev;
            prev = current;
        }
    }
}

