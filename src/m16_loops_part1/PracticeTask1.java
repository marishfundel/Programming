package m16_loops_part1;

public class PracticeTask1 {

    public static void main(String[] args) {

        for (int i = 2; i < 11; i+= 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("----------------------------");

        System.out.print(1);
        for (int i = 3; i <= 19; i ++) {
            if (i % 2 == 1) {
                System.out.print( "-" + i);
            }
        }
        System.out.println();
        System.out.println("----------------------------");

        // Print the even numbers which starts from 0 (exclusive) and ends at 10 (inclusive)
        // in the same line with a space between the numbers.
        //Output: 2 4 6 8 10

        for (int i = 1; i <= 10 ; i++) {
            if (i % 2 ==0) {
                System.out.print(i + " ");
            }
        }
        
    }
}
