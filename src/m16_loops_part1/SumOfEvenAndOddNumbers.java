package m16_loops_part1;

public class SumOfEvenAndOddNumbers {

    public static void main(String[] args) {


    int sumEven = 0;
    int sumOdd = 0;

        for (int i = 0; i < 10; i+= 2) {
sumEven += i;
        }
        for (int i = 1; i < 10; i += 2) {
sumOdd += i;
        }
        System.out.println("Sum of even numbers " + sumEven);
        System.out.println("Sum of odd numbers "  + sumOdd);
    }
}
