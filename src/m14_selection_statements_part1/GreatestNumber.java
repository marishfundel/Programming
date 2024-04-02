package m14_selection_statements_part1;

public class GreatestNumber {

    public static void main(String[] args) {

        int a, b;
        a = 6788;
        b = 100;

        if (a > b) {
            System.out.println("The greatest number is " + a);
        } else if (a == b) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The greatest number is " + b);
        }



    }
}
