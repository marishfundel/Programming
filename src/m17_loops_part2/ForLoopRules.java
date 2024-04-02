package m17_loops_part2;

public class ForLoopRules {

    public static void main(String[] args) {

        // Rule 1: avoid infinite loops;

       // for (;;) {
      //      System.out.println("n");
        //}

        // rule 2.

       // for (int i = 0, j = 20, k = 100; i < 11; i++, j--, k += 100) {
          ///  System.out.println(i + " " + j + " " + k);
      //  }

        // Rule 3. Re-assigning a variable in the for loop block is possible

      //  for (int x = 0; i < 5; x++) {

       // }

        // Rule N 4: loop's variable can not be used outside of the for loop's body.

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }

    }
}
