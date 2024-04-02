package m15_selection_statements_part2;

public class TrafficLight {

    public static void main(String[] args) {

        /*
        Write a program using switch statement to display traffic light colors
         */

        char trafficLight = 'l';

        switch (trafficLight) {

            case 'R', 'r':
                System.out.println("Red");
                break;
            case 'Y', 'y':
                System.out.println("Yellow");
                break;
            case 'G', 'g':
                System.out.println("Green");
                break;
            default:
                System.out.println("Invalid option");



        }


    }
}
