package m26_user_input_scanner;

import java.util.Scanner;

public class ScannerIntegers {
    
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
       byte firstNum =  input.nextByte(); //byte

        System.out.println("Enter your second number: ");
       short secondNumber = input.nextShort();

        System.out.println("Enter your third number:");
        int thirdNum = input.nextInt();

        System.out.println("Enter your fourth number:");
        long fourthNum = input.nextLong();

        input.close();


        System.out.println("first Num = " + firstNum);
        System.out.println("second Number = " + secondNumber);
        System.out.println("third Num = " + thirdNum);
        System.out.println("fourth Num = " + fourthNum);
    }

}
