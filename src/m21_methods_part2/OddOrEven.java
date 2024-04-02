package m21_methods_part2;

public class OddOrEven {
    public static void main(String[] args) {
oddOrEven(201);
oddOrEven(200);
    }

    public static void oddOrEven(int number){
if (number % 2 == 0){
    System.out.println(number + " is even number");
} else {
    System.out.println(number + " is odd number");
}
    }

}
