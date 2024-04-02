package m16_loops_part1;

public class FibonacciSequence {

    public static void main(String[] args) {

        int num1 = 0,
            num2 = 1,
            num3 = 1;


        for (int i = 0; i <=9 ; i++) {
            System.out.print(num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

        }




        }

    }

