package m18_loops_part3;

public class LabelStatement {

    public static void main(String[] args) {

        outer:
        for (int k = 1; k <= 5; k++) {
            System.out.print(k + " : ");
            inner:
            for (char i = 'A'; i < 'E'; i++) {
                if ( k==3 ){
                    break outer;
                }
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
