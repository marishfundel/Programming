package m17_loops_part2;

public class StairPattern {

    public static void main(String[] args) {

        for (int rows = 0; rows < 6; rows++) {
            for (int space = 1; space <= rows; space++) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }


    }
}
