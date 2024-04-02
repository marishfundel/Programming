package m15_selection_statements_part2;

public class LaptopModel {

    public static void main(String[] args) {

        String laptopModel = "dell";

        switch (laptopModel) {

            case "apple":
                System.out.println("Apple - no virus.");
                break;
            case "dell":
                System.out.println("Tough one.");
                break;
            case "hp":
                System.out.println("Not recommended.");
                break;
            default:
                System.out.println("Do not buy that one.");


        }
    }
}

/*
Write a code using Switch statment that displays different messages for given laptop model such as
apple, dell, hp.
If the laptop model is apple display: "Apple - no virus."
If the laptop model is dell display: "Tough one."
If the laptop model is hp display: "Not recommended."
If none of these then desplay "Do not buy that one!"

 */
