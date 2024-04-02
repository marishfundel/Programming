package m14_selection_statements_part1;

public class Salary {

    public static void main(String[] args) {

        int salary = 40_000;
        int yearsOnJob = 2;

        if (salary >= 30_000) {
            if (yearsOnJob >= 2) {
                System.out.println("You are qualified for the loan.");
            } else {
                System.out.println("You are not qualified for the loan yet.");
            }
        } else {
            System.out.println("You must earn at least 30_000 per year.");

        }


    }
}
