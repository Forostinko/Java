package Lectures.Class_L7;

public class Square {

        public static void main(String[] args) {
            Point daleco = new Point(4, 3);
            System.out.println(daleco.isValid());

            Point blizco = new Point(0, 0);
            System.out.println(blizco.isValid());

            Line line1 = new Line();
            line1.p1 = daleco;
            line1.p2 = blizco;

            System.out.println(line1.length());
        }
    }

