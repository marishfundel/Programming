package m15_selection_statements_part2;

public class Calculator {

    public static void main(String[] args) {

        double num1 = 100, num2 = 20;

        char operator = '+';

        switch (operator) {
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '/':
                    System.out.println("Division: " + (num1 / num2));
                 break;

            default:
                System.out.println("Invalid Operator");


        }



    }
}
