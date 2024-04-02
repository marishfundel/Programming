package m14_selection_statements_part1;

public class Grade {

    public static void main(String[] args) {

        /*
        Write a program that calculates the average of Math, Chemistry,
        and Biology scores and prints the grade table;

        90-100 -> A
        80-89 -> B
        70-79 -> C
        60-69 -> D
        0-59 -> F
         */

        int math = 75;
        int chem = 68;
        int biol = 98;
        double average = (math + chem + biol) / 3;
        System.out.println("average is " + average);


        if (average >= 90 && average <= 100) {
            System.out.println("Grade is A");
        } else if (average >= 80 && average <=89) {
            System.out.println("Grade is B");
        } else if (average >= 70 && average <=79) {
            System.out.println("Grade is C");
        } else if (average >= 60 && average <=69) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is F");
        }


    }
}
