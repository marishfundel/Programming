package m17_loops_part2;

public class MultiplicationTable {

    public static void main(String[] args) {


        for (int num1 = 1; num1 < 10; num1++) {
        for (int num2 = 0; num2 < 10; num2++) {
            System.out.print(num1 + " x " + num2 + " = " + num1 * num2 + "\t\t");
        }
            System.out.println();
        }
        
    }
}
