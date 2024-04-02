package m18_loops_part3;

public class EvenNumbers {

    public static void main(String[] args) {

        int sumEven = 0;
        int i = 0;
        while (i <= 10) {
            if (i % 2 == 0){
            sumEven += i;
            }
            i++;
        }
        System.out.println("Sum of even numbers is " + sumEven);
    }
}
