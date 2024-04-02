package m15_selection_statements_part2;

public class TernaryNumber {

    public static void main(String[] args) {

        /*
        Write a program using a ternary operator, that checks the value of the variable num.
        If num is greater than 0, the program prints "Number is positive'.
        If num is less than 0, the program prints "Number is negative".
        If num is neither greater than nor less than 0, the program prints "Number is zero".
         */

        int num = -19;
        String value = (num > 0) ? "Number is positive": (num < 0) ? "Number is negative" : "Zero";
        System.out.println(value);



    }
}
