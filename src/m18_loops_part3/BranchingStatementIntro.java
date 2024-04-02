package m18_loops_part3;

public class BranchingStatementIntro {

    public static void main(String[] args) {

        for (char i = 'A'; i < 'E'; i++) {
            if (i == 'C'){
                break;
            }
            System.out.println(i);
        }

        System.out.println("----------------------------------------------------");

        for (int i = 1; i < 6; i++) {
            if (i==3){
                continue;
            }
            System.out.println(i);
        }

    }
}
