package m14_selection_statements_part1;

public class GratestNumberNested {

    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 999;

        if (num1 != num2) {
            System.out.println("The numbers are not equal");
            if (num1 > num2) {
                System.out.println("The greatest number is num1");
            } else {
                System.out.println("The greatest number is num2");
            }
        } else {
            System.out.println("The numbers are equal");
        }



    }
}
