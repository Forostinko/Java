package Lectures.Class_L7;

public class Point {
    int x;
    int y;


    //constanta
    public Point(int x, int y) {
//        System.out.println(this);
        this.x = x;
        this.y = y;
    }

    public boolean isValid () {
        return x < 0 && y >0;
    }
}
