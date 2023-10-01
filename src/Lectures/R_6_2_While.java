package Lectures;

public class R_6_2_While {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(" while (i < 5) starting with 0:" );
        while (i < 5) {
            System.out.println(" " + i);
            i++;
        }
        System.out.println(" while (i < 5) starting with 5:" );
        i = 5;
        while (i < 5) {
            System.out.println(" " + i);
            i++;
        }
    }
}
