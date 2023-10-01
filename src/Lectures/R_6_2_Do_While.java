package Lectures;

public class R_6_2_Do_While {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("\n do{} while (i < 5) starting with 0:" );
        do {
            System.out.println(" " + i);
            i++;
        } while (i < 5);

        i = 5;
        System.out.println("\n do{} while (i < 5) starting with 5:" );
        do {
            System.out.println(" " + i);
            i++;
        } while (i < 5);
            System.out.println("\n");
    }
}
