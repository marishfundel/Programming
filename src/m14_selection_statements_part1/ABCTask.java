package m14_selection_statements_part1;

public class ABCTask {
    public static void main(String[] args) {

        int a, b, c;

        a = 90;
        b = 18;
        c = 25;

        if (a < 10) {
            b = 1;
        } else if (a > 10) {
           c = 1;
        } else {
            b = 0;
            c = 0;
        }

        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
