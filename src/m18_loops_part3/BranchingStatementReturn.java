package m18_loops_part3;

public class BranchingStatementReturn {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            if (i ==3){
               // continue; // skips the iteration
              // break; // exits the loop;
                return; // exit the method
            }
            System.out.println(i);
        }
        System.out.println("Hello world");






    }
}
