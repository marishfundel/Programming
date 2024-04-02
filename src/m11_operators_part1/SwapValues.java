package m11_operators_part1;

public class SwapValues {
// Swap values by using Temporary variable

public static void main(String[] args) {

   /*  int num1 = 5;
   int num2 = 10;

   int temp;
   temp = num1;
   num1 = num2;
   num2 = temp;

    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);

    */

    //swap values by arithmetic operators


int num1 = 10;
int num2 = 7;


    num2 = num2 + num1;
    num1 = num2 - num1;
    num2 = num2 - num1;

    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);








}

}