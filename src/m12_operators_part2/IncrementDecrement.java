package m12_operators_part2;

public class IncrementDecrement {

    public static void main(String[] args) {

        int x = 5;
        int y = ++x; // x ==> 6 y =6
        System.out.println("y = " + y);
        System.out.println("x = " + x); // pre-increment

        int a = 10;
        int b = --a;
        System.out.println("a = " + a); // pre-decrement
        System.out.println("b = " +b); // ==< 9

        // post-increments and post-decrements

        int m = 5;
        int n = m++; // n = 5
        System.out.println("m = " + m); //m=6
        System.out.println("n = " + n); //n=5

        int r = 10;
        int t = r--;
        System.out.println("r = " + r); // r = 9
        System.out.println("t = " + t); // t = 10






    }
}
