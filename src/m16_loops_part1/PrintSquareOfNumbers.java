package m16_loops_part1;

public class PrintSquareOfNumbers {

    public static void main(String[] args) {

        /*
        Print the square of numbers which starts from 1 and ends at 10 as below:

        num | num^2
        ------------
           1 | 1
           2 | 4
           3 | 9
           4 | 16
           5 | 25
           6 | 36
           7 | 49
           8 | 64
           9 | 81
          10 | 100
         */

        System.out.println("num\t|\tnum^2");
        System.out.println("------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t|\t" + i * i);
        }
    }

}
