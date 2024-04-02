package m14_selection_statements_part1;

public class WaterMelon {

    public static void main(String[] args) {

        int number = 25;
        boolean isEnough = false;

        if (number >= 20) {
            System.out.println("I have more than 20 watermelons");
         isEnough = true;
        }

        if (isEnough) {
            System.out.println("Good job");
        }

        if (!isEnough) {
            System.out.println("I need more watermelon");
        }






    }
}
